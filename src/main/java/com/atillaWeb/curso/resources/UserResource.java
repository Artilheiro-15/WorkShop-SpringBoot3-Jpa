package com.atillaweb.curso.resources;

import com.atillaweb.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Atila", "atilla@gmail.com", "994560541", "123456");
    return ResponseEntity.ok().body(u);
  }
}
