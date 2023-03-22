package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = " com.droptaxi.entity.BiddingDetailsHistory")
@Table(name = "BIDDING_DETAILS_HISTORY")
public class BiddingDetailsHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BD_ID\"", nullable = false)
  private Integer bdId;
  @Column(name = "\"BD_JOURNEY_ID\"", nullable = true)
  private String bdJourneyId;
  @Column(name = "\"BD_VEHICLE_ID\"", nullable = true)
  private String bdVehicleId;
  @Column(name = "\"BD_DRIVER_ID\"", nullable = true)
  private String bdDriverId;
  @Column(name = "\"BD_DATE_TIME\"", nullable = true)
  private Timestamp bdDateTime;
  @Column(name = "\"BD_ISACTIVE\"", nullable = false)
  private Byte bdIsactive;
  @Column(name = "\"BD_AMOUNT\"", nullable = true)
  private Float bdAmount;
  @Column(name = "\"BD_SELECTED\"", nullable = false)
  private Byte bdSelected;
  @Column(name = "\"BD_REMARKS\"", nullable = true)
  private String bdRemarks;
}