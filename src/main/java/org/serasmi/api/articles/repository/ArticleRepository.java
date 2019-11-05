package org.serasmi.api.articles.repository;

import org.serasmi.api.articles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<User, Long> {
}
