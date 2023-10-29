package com.example.security.basicauth.repository;

import com.example.security.basicauth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public UserEntity findByUsername(String username);
}
