package com.example.thirdproject.repository;

import com.example.thirdproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    //Optional<User> findByUsername(String username);
    public User findByUsername(String username);
    //Optional<User> findByEmail(String email);
}
