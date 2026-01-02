package com.niroj.resumeanalyzer.controller;

import com.niroj.resumeanalyzer.model.AnalysisResult;
import com.niroj.resumeanalyzer.service.ResumeAnalyzerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ResumeController {

    private final ResumeAnalyzerService service;

    public ResumeController(ResumeAnalyzerService service) {
        this.service = service;
    }

    @PostMapping(value = "/analyze", consumes = "multipart/form-data")
    public ResponseEntity<AnalysisResult> analyze(
            @RequestPart(required = false) MultipartFile resumeFile,
            @RequestPart(required = false) MultipartFile jdFile,
            @RequestParam(required = false) String resumeText,
            @RequestParam(required = false) String jdText
    ) {
        return ResponseEntity.ok(
                service.analyze(resumeFile, jdFile, resumeText, jdText)
        );
    }
}
