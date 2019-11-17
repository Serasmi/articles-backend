package org.serasmi.api.articles.service;

import java.util.List;
import org.serasmi.api.articles.exceptions.ArticleNotFoundException;
import org.serasmi.api.articles.model.Article;
import org.serasmi.api.articles.repository.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

  private final ArticleRepository repository;

  public ArticleService(ArticleRepository repository) {
    this.repository = repository;
  }

  public List<Article> getAll() {
    return repository.findAll();
  }

  public Article create(Article newArticle) {
    return repository.save(newArticle);
  }

  public Article get(Long id) {
    return repository.findById(id).orElseThrow(() -> new ArticleNotFoundException(id ));
  }

  public Article update(Article newArticle, Long id) {
    return repository.findById(id)
        .map(article -> {
          article.setTitle(newArticle.getTitle());
          article.setLink(newArticle.getLink());

          return repository.save(article);
        })
        .orElseGet(() -> {
          newArticle.setId(id);
          return repository.save(newArticle);
        });
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }
}
