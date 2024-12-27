package com.example.springbootcrud.servicies;

import com.example.springbootcrud.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    boolean existsByUserName(String username);

}
