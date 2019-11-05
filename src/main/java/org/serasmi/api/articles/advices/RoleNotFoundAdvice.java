package org.serasmi.api.articles.advices;

import lombok.Data;
import org.serasmi.api.articles.exceptions.RoleNotFoundException;
import org.serasmi.api.articles.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RoleNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(RoleNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseNotFound roleNotFoundHandler(UserNotFoundException ex) {
    return new ResponseNotFound(ex.getMessage());
  }
}
