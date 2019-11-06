package org.serasmi.api.articles.api;

import org.serasmi.api.articles.model.User;
import org.serasmi.api.articles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService service;

  @Autowired
  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping
  public List<User> getAll() {
    return service.getAll();
  }

  @PostMapping
  public User create(@RequestBody User newUser) {
    return service.create(newUser);
  }

  @GetMapping("/{id}")
  public User get(@PathVariable Long id) {
    return service.get(id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
