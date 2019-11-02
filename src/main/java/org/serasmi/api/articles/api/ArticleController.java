package org.serasmi.api.articles.api;

import java.util.List;
import org.serasmi.api.articles.model.Article;
import org.serasmi.api.articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("article")
public class ArticleController {
  private final ArticleService articleService;

  @Autowired
  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @PostMapping
  public void addArticle(Article article) {
    articleService.addArticle(article);
  }

  @GetMapping
  @ResponseBody
  public List<Article> getAllArticles() {
    return articleService.getAllArticles();
  }
}
