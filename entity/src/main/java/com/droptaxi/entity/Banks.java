package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Banks")
@Table(name = "BANKS")
public class Banks {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BK_ID\"", nullable = false)
  private Integer bkId;
  @Column(name = "\"BK_NAME\"", nullable = false)
  private String bkName;
  @Column(name = "\"BK_BALANCE\"", nullable = false)
  private Float bkBalance;
  @Column(name = "\"BK_ISACTIVE\"", nullable = false)
  private boolean bkIsactive;
  @Column(name = "\"BK_TIMESTAMP\"", nullable = false)
  private Timestamp bkTimestamp;
}