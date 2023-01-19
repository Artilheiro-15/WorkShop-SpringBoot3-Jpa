package com.atillaweb.curso.services;

import com.atillaweb.curso.entities.User;
import com.atillaweb.curso.repositories.UserRepository;
import com.atillaweb.curso.services.excepitions.ResourceNotFoundException;
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
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  // esse comando vai deletar do banco de dados o usuario
  public void delete(Long id) {
    repository.deleteById(id);
  }

  //aki vou cria a funçao para atualizar um dado usuario
  public User update(Long id, User obj) {
    User entity = repository.getReferenceById(id);
    updateData(entity, obj);
    return repository.save(entity);
  }

  //Esse metodo e para atualizar os dados do entity com base com oque chegou no obj
  private void updateData(User entity, User obj) {
    entity.setName(obj.getName());
    entity.setEmail(obj.getName());
    entity.setPhone(obj.getPhone());
  }
}
