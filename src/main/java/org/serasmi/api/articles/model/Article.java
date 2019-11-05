package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.time.LocalDate;

public class Article {

  private final Long id;
  private final String title;
  private final String link;
  private final Date createdAt;
  private final int user;

  public Article(@JsonProperty("id") Long id,
                 @JsonProperty("title") String title,
                 @JsonProperty("content") String link,
                 @JsonProperty("user") int user) {
    this.id = id;
    this.title = title;
    this.link = link;
    this.createdAt = Date.valueOf(LocalDate.now());
    this.user = user;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getLink() {
    return link;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public int getUser() {
    return user;
  }
}
