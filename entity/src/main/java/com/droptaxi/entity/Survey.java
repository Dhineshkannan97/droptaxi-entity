package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Survey")
@Table(name = "SURVEY")
public class Survey {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"S_ID\"", nullable = false)
  private Integer sId;
  @Column(name = "\"S_NAME\"", nullable = false)
  private String sName;
  @Column(name = "\"S_OPTION\"", nullable = false)
  private String sOption;
  @Column(name = "\"S_DATETIME\"", nullable = false)
  private Timestamp sDatetime;
  @Column(name = "\"S_ISACTIVE\"", nullable = false)
  private boolean sIsactive;
}