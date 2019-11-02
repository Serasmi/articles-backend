package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Date;

public class Article {
  private final int id;
  private final String title;
  private final String content;
  private final Date createdAt;
  private final int createdBy;

  public Article(@JsonProperty("id") int id,
      @JsonProperty("title") String title,
      @JsonProperty("content") String content,
      @JsonProperty("createdAt") Date createdAt,
      @JsonProperty("createdBy") int createdBy) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public int getCreatedBy() {
    return createdBy;
  }
}
