package com.atillaweb.curso.services;

import com.atillaweb.curso.entities.Product;
import com.atillaweb.curso.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  //aki eu vou implementar duas operaçoes basicas que e a operaçao para buscar
  //todos os usuarios e a operaçao para buscar o usuario por id

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }
}
