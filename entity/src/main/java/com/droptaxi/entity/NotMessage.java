package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.NotMessage")
@Table(name = "NOT_MESSAGE")
public class NotMessage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NM_ID\"", nullable = false)
  private Integer nmId;
  @Column(name = "\"NM_NAME\"", nullable = false)
  private String nmName;
  @Column(name = "\"NM_INFO\"", nullable = false)
  private String nmInfo;
  @Column(name = "\"NM_ISACTIVE\"", nullable = false)
  private Integer nmIsactive;
  @Column(name = "\"NM_TS\"", nullable = false)
  private Timestamp nmTs;
}