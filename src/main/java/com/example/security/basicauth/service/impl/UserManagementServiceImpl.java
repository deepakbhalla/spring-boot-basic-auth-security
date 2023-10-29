package com.example.security.basicauth.service.impl;

import com.example.security.basicauth.deserializer.UserDetailsDeserializer;
import com.example.security.basicauth.model.User;
import com.example.security.basicauth.repository.UserRepository;
import com.example.security.basicauth.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetailsDeserializer userDetailsDeserializer;

    @Override
    public List<User> getAllUsers() {
        return this.userDetailsDeserializer.deserializeAccount(this.userRepository.findAll());
    }
}
