package org.serasmi.api.articles.service;

import java.util.List;
import org.serasmi.api.articles.dao.ArticleDao;
import org.serasmi.api.articles.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
  private final ArticleDao articleDao;

  @Autowired
  public ArticleService(@Qualifier("postgresArticleData") ArticleDao articleDao) {
    this.articleDao = articleDao;
  }

  public void addArticle(Article article) {
    articleDao.insertArticle(article);
  }

  public List<Article> getAllArticles() {
    return articleDao.getAllArticles();
  }
}
