package com.lalitha.coding_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalitha.coding_platform.model.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {}