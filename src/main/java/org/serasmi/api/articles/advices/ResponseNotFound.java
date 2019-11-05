package org.serasmi.api.articles.advices;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
class ResponseNotFound {

  private final int code = 404;
  private String error;

  ResponseNotFound() {
    this.error = HttpStatus.NOT_FOUND.toString();
  }

  ResponseNotFound(String error) {
    this.error = error;
  }
}
