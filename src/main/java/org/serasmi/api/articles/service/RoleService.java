package org.serasmi.api.articles.service;

import org.serasmi.api.articles.exceptions.RoleNotFoundException;
import org.serasmi.api.articles.model.Role;
import org.serasmi.api.articles.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

  private final RoleRepository repository;

  public RoleService(RoleRepository repository) {
    this.repository = repository;
  }

  public List<Role> getAll() {
    return repository.findAll();
  }

  public Role create(Role newRole) {
    return repository.save(newRole);
  }

  public Role get(Long id) {
    return repository.findById(id).orElseThrow(() -> new RoleNotFoundException(id));
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }
}
