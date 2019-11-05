package org.serasmi.api.articles.service;

import org.serasmi.api.articles.exceptions.UserNotFoundException;
import org.serasmi.api.articles.model.User;
import org.serasmi.api.articles.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepository repository;

  public UserService(UserRepository repository) {
    this.repository = repository;
  }

  public List<User> getAll() {
    return repository.findAll();
  }

  public User create(User newUser) {
    return repository.save(newUser);
  }

  public User get(Long id) {
    return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }
}
