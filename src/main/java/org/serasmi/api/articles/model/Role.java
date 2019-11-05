package org.serasmi.api.articles.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {

  private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
  private String name;

  public Role() {}

  public Role(@JsonProperty("name") String name) {
    this.name = name;
  }
}
