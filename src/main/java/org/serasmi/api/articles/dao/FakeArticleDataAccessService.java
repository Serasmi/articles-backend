package org.serasmi.api.articles.dao;

import org.serasmi.api.articles.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeArticleData")
public class FakeArticleDataAccessService implements ArticleDao{
  private static List<Article> DB = new ArrayList<>();

  @Override
  public int insertArticle(Article article) {
    DB.add(article);
    return DB.size();
  }

  @Override
  public List<Article> getAllArticles() {
    return DB;
  }

  @Override
  public Article getArticle(Long id) {
    try {
      return DB.get(id.intValue());
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }

    return null;
  }
}
