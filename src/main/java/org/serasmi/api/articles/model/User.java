package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Long role;

  public User() {}

  public User(@JsonProperty("name") String name, @JsonProperty("role") Long role) {
    this.name = name;
    this.role = role;
  }
}
