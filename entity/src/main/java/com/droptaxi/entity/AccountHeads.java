package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.AccountHeads")
@Table(name = "ACCOUNT_HEADS")
public class AccountHeads {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AH_ID\"", nullable = false)
  private Integer ahId;
  @Column(name = "\"AH_NAME\"", nullable = false)
  private String ahName;
}