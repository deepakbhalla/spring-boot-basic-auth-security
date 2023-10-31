package com.example.security.basicauth.service;

import com.example.security.basicauth.exception.ResourceNotFoundException;
import com.example.security.basicauth.exception.UserAlreadyExistAuthenticationException;
import com.example.security.basicauth.model.SignUpRequest;
import com.example.security.basicauth.model.User;
import java.util.List;

public interface UserManagementService {

    List<User> getAllUsers();

    User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

    void deleteUser(String username) throws ResourceNotFoundException;
}
