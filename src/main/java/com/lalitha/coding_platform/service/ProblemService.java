package com.lalitha.coding_platform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lalitha.coding_platform.model.Problem;
import com.lalitha.coding_platform.repository.ProblemRepository;

@Service
public class ProblemService {

    private final ProblemRepository problemRepository;

    public ProblemService(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public Problem save(Problem problem) {
        return problemRepository.save(problem);
    }

    public List<Problem> getAll() {
        return problemRepository.findAll();
    }

    public Problem getById(Long id) {
        return problemRepository.findById(id).orElse(null);
    }
}