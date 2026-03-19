package com.lalitha.coding_platform.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalitha.coding_platform.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}