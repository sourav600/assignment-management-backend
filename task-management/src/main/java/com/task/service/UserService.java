package com.task.service;

import com.task.modal.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);

    public List<User>getAllUsers();
}
