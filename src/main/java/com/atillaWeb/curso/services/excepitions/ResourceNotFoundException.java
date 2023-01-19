package com.atillaweb.curso.services.excepitions;

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(Object id) {
    super("Resource not fund. Id " + id);
  }
}
