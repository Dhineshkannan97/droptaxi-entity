package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.DriverTrips")
@Table(name = "DRIVER_TRIPS")
public class DriverTrips {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DT_ID\"", nullable = false)
  private Integer dtId;
  @Column(name = "\"DT_DRIVER_ID\"", nullable = false)
  private String dtDriverId;
  @Column(name = "\"DT_TRIPS\"", nullable = false)
  private Integer dtTrips;
  @Column(name = "\"DT_KMS\"", nullable = false)
  private Integer dtKms;
}