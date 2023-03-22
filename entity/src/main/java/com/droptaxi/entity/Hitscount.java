package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Hitscount")
@Table(name = "HITSCOUNT")
public class Hitscount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"HC_ID\"", nullable = false)
  private Integer hcId;
  @Column(name = "\"HC_SOURCE\"", nullable = false)
  private String hcSource;
  @Column(name = "\"HC_JID\"", nullable = true)
  private String hcJid;
  @Column(name = "\"HC_DATE_TIME\"", nullable = false)
  private Timestamp hcDateTime;
}