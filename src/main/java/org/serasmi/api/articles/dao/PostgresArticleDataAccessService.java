package org.serasmi.api.articles.dao;

import java.util.ArrayList;
import java.util.List;
import org.serasmi.api.articles.model.Article;
import org.springframework.stereotype.Repository;

@Repository("postgresArticleData")
public class PostgresArticleDataAccessService implements ArticleDao {
  // TODO: connect to DB here
  private static List<Article> DB = new ArrayList<>();

  @Override
  public int insertArticle(Article article) {
    // TODO: insert data to DB here
    DB.add(article);
    return DB.size();
  }

  @Override
  public List<Article> getAllArticles() {
    // TODO: return all articles here
    return DB;
  }
}
