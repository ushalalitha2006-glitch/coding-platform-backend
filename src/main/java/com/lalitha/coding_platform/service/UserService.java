package com.lalitha.coding_platform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lalitha.coding_platform.model.User;
import com.lalitha.coding_platform.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> login(String email) {
        return userRepository.findByEmail(email);
    }
}