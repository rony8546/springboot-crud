package com.example.springbootcrud.repositories;

import com.example.springbootcrud.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String username);
    Optional<User> findByusername(String username);

}
