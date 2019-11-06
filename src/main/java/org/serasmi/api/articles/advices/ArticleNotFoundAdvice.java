package org.serasmi.api.articles.advices;

import org.serasmi.api.articles.exceptions.ArticleNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ArticleNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(ArticleNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseNotFound articleNotFoundHandler(ArticleNotFoundException ex) {
    return new ResponseNotFound(ex.getMessage());
  }


}
