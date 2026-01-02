package com.niroj.resumeanalyzer.service;

import com.niroj.resumeanalyzer.model.AnalysisResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashSet;
import java.util.Set;

@Service
public class ResumeAnalyzerService {

    private final TextExtractor textExtractor;

    public ResumeAnalyzerService(TextExtractor textExtractor) {
        this.textExtractor = textExtractor;
    }

    public AnalysisResult analyze(
            MultipartFile resumeFile,
            MultipartFile jdFile,
            String resumeText,
            String jdText
    ) {

        String resume = getText(resumeFile, resumeText).toLowerCase();
        String jd = getText(jdFile, jdText).toLowerCase();

        if (resume.isBlank() || jd.isBlank()) {
            return new AnalysisResult(0, Set.of(), Set.of("no readable text"));
        }

        Set<String> matched = new HashSet<>();
        Set<String> missing = new HashSet<>();

        for (String skill : SkillRepository.getAllSkills()) {
            if (jd.contains(skill)) {
                if (resume.contains(skill)) {
                    matched.add(skill);
                } else {
                    missing.add(skill);
                }
            }
        }

        int total = matched.size() + missing.size();
        double score = total == 0 ? 0 : (matched.size() * 100.0) / total;

        AnalysisResult result = new AnalysisResult(score, matched, missing);

        // 🤖 AI SUGGESTIONS
        Set<String> suggestions = new HashSet<>();

        if (!missing.isEmpty()) {
            suggestions.add("Add or highlight these skills: " + String.join(", ", missing));
        }

        if (!resume.contains("project")) {
            suggestions.add("Add a Projects section with measurable impact");
        }

        if (!resume.matches(".*\\d+.*")) {
            suggestions.add("Quantify achievements using numbers (e.g., improved by 30%)");
        }

        if (score >= 80) {
            suggestions.add("Strong match! Tailor your resume summary for this role");
        }

        result.setSuggestions(suggestions);
        return result;
    }

    private String getText(MultipartFile file, String fallbackText) {
        if (file != null && !file.isEmpty()) {
            String extracted = textExtractor.extract(file);
            if (!extracted.isBlank()) return extracted;
        }
        return fallbackText == null ? "" : fallbackText;
    }
}
