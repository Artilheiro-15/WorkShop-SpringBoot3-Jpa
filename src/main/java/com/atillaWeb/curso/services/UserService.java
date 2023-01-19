package com.atillaweb.curso.services;

import com.atillaweb.curso.entities.User;
import com.atillaweb.curso.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  // esse comando vai deletar do banco de dados o usuario
  public void delete(Long id) {
    repository.deleteById(id);
  }
}
