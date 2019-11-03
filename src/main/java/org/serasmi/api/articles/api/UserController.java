package org.serasmi.api.articles.api;

import org.serasmi.api.articles.dao.UserRepository;
import org.serasmi.api.articles.exceptions.UserNotFoundException;
import org.serasmi.api.articles.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

  private final UserRepository repository;

  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/user")
  public List<User> getAll() {
    return repository.findAll();
  }

  @PostMapping("/user")
  public User create(@RequestBody User newUser) {
    return repository.save(newUser);
  }

  @GetMapping("/user/{id}")
  public User get(@PathVariable Long id) {
    return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
  }

  @DeleteMapping("/user/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
