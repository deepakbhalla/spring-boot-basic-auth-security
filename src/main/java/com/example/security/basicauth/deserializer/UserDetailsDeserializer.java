package com.example.security.basicauth.deserializer;

import com.example.security.basicauth.entity.UserEntity;
import com.example.security.basicauth.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailsDeserializer {

    public User deserializeAccount(UserEntity userEntity) {
        return User.builder()
                .username(userEntity.getUsername())
                .build();
    }

    public List<User> deserializeAccount(List<UserEntity> userEntity) {
        List<User> users = new ArrayList<>();
        userEntity.forEach(u -> users.add(User.builder()
                .username(u.getUsername())
                .build()));
        return users;
    }
}
