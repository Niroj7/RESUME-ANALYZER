package com.niroj.resumeanalyzer.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Component
public class TextExtractor {

    public String extract(MultipartFile file) {

        if (file == null || file.isEmpty()) return "";

        String name = file.getOriginalFilename().toLowerCase();

        try (InputStream is = file.getInputStream()) {

            // PDF
            if (name.endsWith(".pdf")) {
                try (PDDocument doc = PDDocument.load(is)) {
                    return new PDFTextStripper().getText(doc);
                }
            }

            // DOCX
            if (name.endsWith(".docx")) {
                try (XWPFDocument doc = new XWPFDocument(is);
                     XWPFWordExtractor extractor = new XWPFWordExtractor(doc)) {

                    return extractor.getText();
                }
            }

            // TXT
            if (name.endsWith(".txt")) {
                return new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
