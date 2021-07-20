package com.example.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Team {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer sq;

  @OneToOne(cascade = CascadeType.ALL)
  private Sports sports;

  private String teamId;
  private String teamName;

  @OneToOne
  private Region region;

  @OneToOne(cascade = CascadeType.ALL)
  private User ownerId;
}
