package org.serasmi.api.articles.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

  private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
  private String name;
  private String role;

  public User() {}

  public User(String name, String role) {
    this.name = name;
    this.role = role;
  }
}
