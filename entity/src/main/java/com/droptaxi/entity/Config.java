package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.Config")
@Table(name = "CONFIG")
public class Config {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CID\"", nullable = false)
  private Integer cid;
  @Column(name = "\"C_NAME\"", nullable = false)
  private String cName;
  @Column(name = "\"C_VALUE\"", nullable = false)
  private String cValue;
}