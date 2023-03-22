package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.UserPickupPoint")
@Table(name = "USER_PICKUP_POINT")
public class UserPickupPoint {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"UPP_PICKUP_POINT_ID\"", nullable = false)
  private Integer uppPickupPointId;
  @Column(name = "\"UPP_USER_ID\"", nullable = false)
  private String uppUserId;
  @Column(name = "\"UPP_PICKUP_POINT_NAME\"", nullable = false)
  private String uppPickupPointName;
  @Column(name = "\"UPP_PICKUP_POINT\"", nullable = false)
  private String uppPickupPoint;
}