package org.serasmi.api.articles.api;

import java.util.List;
import org.serasmi.api.articles.model.Article;
import org.serasmi.api.articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

  private final ArticleService articleService;

  @Autowired
  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  // Aggregate root

  @GetMapping("/articles")
  public List<Article> getAllArticles() {
    return articleService.getAllArticles();
  }

  @PostMapping("/articles")
  public int addArticle(@RequestBody Article article) {
    return articleService.addArticle(article);
  }

  // Single item

  @GetMapping("/articles/{id}")
  public Article getArticle(@PathVariable Long id) {
    return articleService.getArticle(id);
  }
}
