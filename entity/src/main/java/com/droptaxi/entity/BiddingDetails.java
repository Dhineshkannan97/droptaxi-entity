package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = " com.droptaxi.entity.BiddingDetails")
@Table(name = "BIDDING_DETAILS")
public class BiddingDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BD_ID\"", nullable = false)
  private Integer bdId;
  @Column(name = "\"BD_JOURNEY_ID\"", nullable = false)
  private String bdJourneyId;
  @Column(name = "\"BD_VEHICLE_ID\"", nullable = false)
  private String bdVehicleId;
  @Column(name = "\"BD_DRIVER_ID\"", nullable = false)
  private String bdDriverId;
  @Column(name = "\"BD_DATE_TIME\"", nullable = false)
  private Timestamp bdDateTime;
  @Column(name = "\"BD_ISACTIVE\"", nullable = false)
  private boolean bdIsactive;
  @Column(name = "\"BD_AMOUNT\"", nullable = false)
  private Float bdAmount;
  @Column(name = "\"BD_SELECTED\"", nullable = false)
  private boolean bdSelected;
  @Column(name = "\"BD_REMARKS\"", nullable = false)
  private String bdRemarks;
}