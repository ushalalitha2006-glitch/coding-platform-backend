package com.lalitha.coding_platform.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lalitha.coding_platform.model.Submission;
import com.lalitha.coding_platform.service.SubmissionService;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping
    public Submission submit(
            @RequestParam Long userId,
            @RequestParam Long problemId,
            @RequestBody String code,
            @RequestParam String language) {

        return submissionService.submit(userId, problemId, code, language);
    }
}