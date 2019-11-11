package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "articles")
public class Article {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String link;
  private Timestamp createdAt;
  private Long userId;

  public Article() {}

  public Article(@JsonProperty("title") String title,
                 @JsonProperty("link") String link,
                 @JsonProperty("user_id") Long userId) {
    this.title = title;
    this.link = link;
    this.userId = userId;
  }
}
