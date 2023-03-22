package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Callback")
@Table(name = "CALLBACK")
public class Callback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CB_ID\"", nullable = false)
  private Integer cbId;
  @Column(name = "\"CB_MOBILENO\"", nullable = false)
  private Long cbMobileno;
  @Column(name = "\"CB_CALLED\"", nullable = false)
  private boolean cbCalled;
  @Column(name = "\"CB_WHO_CB\"", nullable = true)
  private String cbWhoCb;
  @Column(name = "\"CB_REMARKS\"", nullable = true)
  private String cbRemarks;
  @Column(name = "\"CB_TIMESTAMP\"", nullable = false)
  private Timestamp cbTimestamp;
  @Column(name = "\"CB_RESPONDED_TIME\"", nullable = true)
  private Timestamp cbRespondedTime;
}