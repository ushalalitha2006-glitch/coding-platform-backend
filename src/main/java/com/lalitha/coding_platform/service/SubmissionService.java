package com.lalitha.coding_platform.service;

import org.springframework.stereotype.Service;

import com.lalitha.coding_platform.model.Problem;
import com.lalitha.coding_platform.model.Submission;
import com.lalitha.coding_platform.model.User;
import com.lalitha.coding_platform.repository.ProblemRepository;
import com.lalitha.coding_platform.repository.SubmissionRepository;
import com.lalitha.coding_platform.repository.UserRepository;

@Service
public class SubmissionService {

    private final SubmissionRepository submissionRepository;
    private final UserRepository userRepository;
    private final ProblemRepository problemRepository;

    public SubmissionService(
            SubmissionRepository submissionRepository,
            UserRepository userRepository,
            ProblemRepository problemRepository) {

        this.submissionRepository = submissionRepository;
        this.userRepository = userRepository;
        this.problemRepository = problemRepository;
    }

    public Submission submit(Long userId, Long problemId, String code, String language) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Problem problem = problemRepository.findById(problemId)
                .orElseThrow(() -> new RuntimeException("Problem not found"));

        Submission submission = new Submission();
        submission.setUser(user);
        submission.setProblem(problem);
        submission.setCode(code);
        submission.setLanguage(language);
        submission.setStatus("SUBMITTED");

        return submissionRepository.save(submission);
    }
}