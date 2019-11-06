package org.serasmi.api.articles.repository;

import org.serasmi.api.articles.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
