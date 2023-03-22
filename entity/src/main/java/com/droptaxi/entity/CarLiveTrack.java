package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.CarLiveTrack")
@Table(name = "car_live_track")
public class CarLiveTrack {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"journey_id\"", nullable = true)
  private String journeyId;
  @Column(name = "\"user_id\"", nullable = true)
  private String userId;
  @Column(name = "\"latitude\"", nullable = true)
  private String latitude;
  @Column(name = "\"longitude\"", nullable = true)
  private String longitude;
  @Column(name = "\"live_status\"", nullable = true)
  private Integer liveStatus;
  @Column(name = "\"trip_status\"", nullable = true)
  private Integer tripStatus;
}