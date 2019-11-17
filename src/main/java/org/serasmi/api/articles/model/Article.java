package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@Data
@Entity
@Table(name = "articles")
public class Article {

  private static final String DEFAULT_TITLE = "Default article title";

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String link;
  @CreationTimestamp
  private Timestamp createdAt;
  private Long userId;

  public Article() {}

  public Article(@JsonProperty("title") String title,
                 @JsonProperty("link") String link,
                 @JsonProperty("user_id") Long userId) {
    Timestamp currentTime = new Timestamp(new Date().getTime());

    this.title = Optional.ofNullable(title).orElse(DEFAULT_TITLE + " - " + currentTime);
    this.link = link;
    this.userId = Optional.ofNullable(userId).orElse(3L); // TODO: remove hardcoded userId
  }
}
