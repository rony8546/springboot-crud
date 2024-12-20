package com.example.springbootcrud.repositories;

import com.example.springbootcrud.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
