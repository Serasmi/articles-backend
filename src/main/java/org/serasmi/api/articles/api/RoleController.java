package org.serasmi.api.articles.api;

import org.serasmi.api.articles.model.Role;
import org.serasmi.api.articles.model.User;
import org.serasmi.api.articles.service.RoleService;
import org.serasmi.api.articles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

  private final RoleService service;

  @Autowired
  public RoleController(RoleService service) {
    this.service = service;
  }

  @GetMapping
  public List<Role> getAll() {
    return service.getAll();
  }

  @PostMapping
  public Role create(@RequestBody Role newRole) {
    return service.create(newRole);
  }

  @GetMapping(value = "/{id}")
  public Role get(@PathVariable Long id) {
    return service.get(id);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
