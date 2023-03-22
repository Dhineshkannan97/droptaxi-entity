package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = " com.droptaxi.entity.Notification")
@Table(name = "NOTIFICATION")
public class Notification {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"N_ID\"", nullable = false)
  private Integer nId;
  @Column(name = "\"N_JOURNEY_ID\"", nullable = false)
  private String nJourneyId;
  @Column(name = "\"N_DRIVER_ID\"", nullable = false)
  private String nDriverId;
  @Column(name = "\"N_ISNOTIFIED\"", nullable = false)
  private boolean nIsnotified;
  @Column(name = "\"N_TIMESTAMP\"", nullable = false)
  private Timestamp nTimestamp;
}