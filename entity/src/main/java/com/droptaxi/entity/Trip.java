package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Trip")
@Table(name = "trip")
public class Trip {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"trip_id\"", nullable = false)
  private Integer tripId;
  @Column(name = "\"user_id\"", nullable = true)
  private String userId;
  @Column(name = "\"journey_id\"", nullable = true)
  private String journeyId;
  @Column(name = "\"car_type\"", nullable = true)
  private String carType;
  @Column(name = "\"car_type_id\"", nullable = true)
  private Integer carTypeId;
  @Column(name = "\"trip_type\"", nullable = true)
  private String tripType;
  @Column(name = "\"meter_number\"", nullable = true)
  private String meterNumber;
  @Column(name = "\"end_meter_number\"", nullable = true)
  private String endMeterNumber;
  @Column(name = "\"start_lat\"", nullable = true)
  private String startLat;
  @Column(name = "\"start_lng\"", nullable = true)
  private String startLng;
  @Column(name = "\"start_location\"", nullable = true)
  private String startLocation;
  @Column(name = "\"start_city\"", nullable = true)
  private String startCity;
  @Column(name = "\"current_lat\"", nullable = true)
  private String currentLat;
  @Column(name = "\"current_lng\"", nullable = true)
  private String currentLng;
  @Column(name = "\"current_location\"", nullable = true)
  private String currentLocation;
  @Column(name = "\"current_city\"", nullable = true)
  private String currentCity;
  @Column(name = "\"end_lat\"", nullable = true)
  private String endLat;
  @Column(name = "\"end_lng\"", nullable = true)
  private String endLng;
  @Column(name = "\"end_location\"", nullable = true)
  private String endLocation;
  @Column(name = "\"end_city\"", nullable = true)
  private String endCity;
  @Column(name = "\"start_datetime\"", nullable = true)
  private Timestamp startDatetime;
  @Column(name = "\"modified_datetime\"", nullable = true)
  private Timestamp modifiedDatetime;
  @Column(name = "\"trip_status\"", nullable = true)
  private Integer tripStatus;
  @Column(name = "\"app_version\"", nullable = true)
  private String appVersion;
}