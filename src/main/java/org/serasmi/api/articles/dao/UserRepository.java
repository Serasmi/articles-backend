package org.serasmi.api.articles.dao;

import org.serasmi.api.articles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
