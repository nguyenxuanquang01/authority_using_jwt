package com.dac.topic3.service;

import com.dac.topic3.domain.Role;
import com.dac.topic3.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
