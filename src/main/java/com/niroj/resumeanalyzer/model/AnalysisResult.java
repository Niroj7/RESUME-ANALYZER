package com.niroj.resumeanalyzer.model;

import java.util.Set;

public class AnalysisResult {

    private double score;
    private Set<String> matchedSkills;
    private Set<String> missingSkills;
    private Set<String> suggestions;

    public AnalysisResult(
            double score,
            Set<String> matchedSkills,
            Set<String> missingSkills
    ) {
        this.score = score;
        this.matchedSkills = matchedSkills;
        this.missingSkills = missingSkills;
    }

    // 🔹 getters & setters

    public double getScore() {
        return score;
    }

    public Set<String> getMatchedSkills() {
        return matchedSkills;
    }

    public Set<String> getMissingSkills() {
        return missingSkills;
    }

    public Set<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(Set<String> suggestions) {
        this.suggestions = suggestions;
    }
}
