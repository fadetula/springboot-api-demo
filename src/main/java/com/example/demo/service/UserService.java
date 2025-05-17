package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> getUserById(String id) {
        return Optional.ofNullable(users.get(id));
    }

    public User createUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public void deleteUser(String id) {
        users.remove(id);
    }
}