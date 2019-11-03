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
  public ArticleService(@Qualifier("fakeArticleData") ArticleDao articleDao) {
    this.articleDao = articleDao;
  }

  public int addArticle(Article article) {
    return articleDao.insertArticle(article);
  }

  public List<Article> getAllArticles() {
    return articleDao.getAllArticles();
  }

  public Article getArticle(Long id) {
    return articleDao.getArticle(id);
  }
}
