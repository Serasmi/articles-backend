package org.serasmi.api.articles.advices;

import lombok.Data;
import org.serasmi.api.articles.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(UserNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseUserNotFound userNotFoundHandler(UserNotFoundException ex) {
    return new ResponseUserNotFound(ex.getMessage());
  }

  @Data
  class ResponseUserNotFound {

    private final int code = 404;
    private String error;

    ResponseUserNotFound() {
      this.error = "Not found";
    }

    ResponseUserNotFound(String error) {
      this.error = error;
    }
  }
}
