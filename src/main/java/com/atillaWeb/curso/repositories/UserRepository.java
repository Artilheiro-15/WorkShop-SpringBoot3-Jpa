package com.atillaweb.curso.repositories;

import com.atillaweb.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
