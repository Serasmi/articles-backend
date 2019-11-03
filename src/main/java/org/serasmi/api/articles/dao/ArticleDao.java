package org.serasmi.api.articles.dao;

import java.util.List;
import org.serasmi.api.articles.model.Article;

public interface ArticleDao {
  int insertArticle(Article article);

  List<Article> getAllArticles();

  Article getArticle(Long id);
}
