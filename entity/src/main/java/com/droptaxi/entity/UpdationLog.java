package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.UpdationLog")
@Table(name = "UPDATION_LOG")
public class UpdationLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"UL_ID\"", nullable = false)
  private Integer ulId;
  @Column(name = "\"UL_ACTION_BY\"", nullable = true)
  private String ulActionBy;
  @Column(name = "\"UL_ACTION\"", nullable = true)
  private String ulAction;
  @Column(name = "\"UL_TABLE\"", nullable = true)
  private String ulTable;
  @Column(name = "\"UL_TABLE_ACTION\"", nullable = true)
  private String ulTableAction;
  @Column(name = "\"UL_TIMESTAMP\"", nullable = false)
  private Timestamp ulTimestamp;
}