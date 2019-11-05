package org.serasmi.api.articles.exceptions;

public class RoleNotFoundException extends RuntimeException {
  public RoleNotFoundException(Long id) {
    super("Could not find role with id: " + id);
  }
}
