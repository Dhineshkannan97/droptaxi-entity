package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.DriverComplaints")
@Table(name = "DRIVER_COMPLAINTS")
public class DriverComplaints {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DC_ID\"", nullable = false)
  private Integer dcId;
  @Column(name = "\"DC_TRAVELS_NO\"", nullable = false)
  private Integer dcTravelsNo;
  @Column(name = "\"DC_JOURNEY_ID\"", nullable = true)
  private String dcJourneyId;
  @Column(name = "\"DC_REMARKS\"", nullable = false)
  private String dcRemarks;
  @Column(name = "\"DC_ENTRYBY\"", nullable = false)
  private String dcEntryby;
  @Column(name = "\"DC_ACTIONTAKEN\"", nullable = true)
  private String dcActiontaken;
  @Column(name = "\"DC_ACTIONBY\"", nullable = true)
  private String dcActionby;
  @Column(name = "\"DC_ACTION_DATETIME\"", nullable = true)
  private Timestamp dcActionDatetime;
  @Column(name = "\"DC_ISACTIVE\"", nullable = false)
  private Byte dcIsactive;
  @Column(name = "\"DC_TIMESTAMP\"", nullable = false)
  private Timestamp dcTimestamp;
}