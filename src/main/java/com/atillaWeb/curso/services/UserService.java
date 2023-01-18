package com.atillaweb.curso.services;

import com.atillaweb.curso.entities.User;
import com.atillaweb.curso.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  //aki eu vou implementar duas operaçoes basicas que e a operaçao para buscar
  //todos os usuarios e a operaçao para buscar o usuario por id

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();
  }
}
