package com.atillaweb.curso.resources.exeptions;

import com.atillaweb.curso.services.excepitions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

  //esse aki ficou sendo nosso tratamento personalizado de exceçao (ResourceNotFoundException)
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardError> ResourceNotFound(
    ResourceNotFoundException e,
    HttpServletRequest request
  ) {
    String error = "Resource not found";
    HttpStatus status = HttpStatus.NOT_FOUND;
    StandardError err = new StandardError(
      Instant.now(),
      status.value(),
      error,
      e.getMessage(),
      request.getRequestURI()
    );
    return ResponseEntity.status(status).body(err);
  }
}
