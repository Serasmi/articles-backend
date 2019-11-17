package org.serasmi.api.articles.exceptions;

public class ArticleNotFoundException extends RuntimeException {
  public ArticleNotFoundException(Long id) {
    super("Could not find article with id: " + id);
  }
}
