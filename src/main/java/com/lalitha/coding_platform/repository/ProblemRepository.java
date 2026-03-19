package com.lalitha.coding_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalitha.coding_platform.model.Problem;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}