package org.serasmi.api.articles.api;

import org.serasmi.api.articles.dao.UserRepository;
import org.serasmi.api.articles.exceptions.UserNotFoundException;
import org.serasmi.api.articles.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserRepository repository;

  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<User> getAll() {
    return repository.findAll();
  }

  @PostMapping
  public User create(@RequestBody User newUser) {
    return repository.save(newUser);
  }

  @GetMapping(value = "/{id}")
  public User get(@PathVariable Long id) {
    return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
