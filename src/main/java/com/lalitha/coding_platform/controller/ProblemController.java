package com.lalitha.coding_platform.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lalitha.coding_platform.model.Problem;
import com.lalitha.coding_platform.service.ProblemService;

@RestController
@RequestMapping("/api/problems")
public class ProblemController {

    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @PostMapping
    public Problem create(@RequestBody Problem problem) {
        return problemService.save(problem);
    }

    @GetMapping
    public List<Problem> getAll() {
        return problemService.getAll();
    }

    @GetMapping("/{id}")
    public Problem getById(@PathVariable Long id) {
        return problemService.getById(id);
    }
}