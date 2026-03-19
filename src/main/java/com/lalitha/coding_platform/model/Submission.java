package com.lalitha.coding_platform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String status;
    private String language;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "problem_id")
    private Problem problem;

    public Submission() {}

    public Long getId() { return id; }
    public String getCode() { return code; }
    public String getStatus() { return status; }
    public String getLanguage() { return language; }
    public User getUser() { return user; }
    public Problem getProblem() { return problem; }

    public void setCode(String code) { this.code = code; }
    public void setStatus(String status) { this.status = status; }
    public void setLanguage(String language) { this.language = language; }
    public void setUser(User user) { this.user = user; }
    public void setProblem(Problem problem) { this.problem = problem; }
}