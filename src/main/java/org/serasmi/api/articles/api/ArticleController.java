package org.serasmi.api.articles.api;

import java.security.Principal;
import java.util.List;
import org.serasmi.api.articles.model.Article;
import org.serasmi.api.articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

  private ArticleService service;

  @Autowired
  public ArticleController(ArticleService articleService) {
    this.service = articleService;
  }

  @GetMapping
  public List<Article> getAll() {
    return service.getAll();
  }

  @PostMapping
  public Article create(@RequestBody Article newArticle) {
    return service.create(newArticle);
  }

  @GetMapping("/{id}")
  public Article get(@PathVariable Long id) {
    return service.get(id);
  }

  @PutMapping("/{id}")
  public Article update(@RequestBody Article newArticle, @PathVariable Long id) {
    return service.update(newArticle, id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
