package com.example.security.basicauth.service;

import com.example.security.basicauth.model.User;
import java.util.List;

public interface UserManagementService {

    List<User> getAllUsers();
}
