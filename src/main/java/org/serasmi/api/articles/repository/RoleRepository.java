package org.serasmi.api.articles.repository;

import org.serasmi.api.articles.model.Role;
import org.serasmi.api.articles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
