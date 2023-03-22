package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.CityMaster")
@Table(name = "CITY_MASTER")
public class CityMaster {

  @Id
  @Column(name = "\"CM_CITY_CODE\"", nullable = false)
  private String cmCityCode;
  @Column(name = "\"CM_CITY_NAME\"", nullable = false)
  private String cmCityName;
  @Column(name = "\"CM_HUB\"", nullable = true)
  private String cmHub;
  @Column(name = "\"CM_STATE\"", nullable = true)
  private String cmState;
  @Column(name = "\"CM_DT_PICKUP_CITY\"", nullable = false)
  private boolean cmDtPickupCity;
  @Column(name = "\"CM_DROP_CITY\"", nullable = false)
  private boolean cmDropCity;
  @Column(name = "\"CM_ADDEDBY\"", nullable = true)
  private String cmAddedby;
  @Column(name = "\"CM_ADDED_DATE\"", nullable = true)
  private Timestamp cmAddedDate;
  @Column(name = "\"CM_EDITEDBY\"", nullable = true)
  private String cmEditedby;
  @Column(name = "\"CM_EDITED_DATE\"", nullable = true)
  private Timestamp cmEditedDate;
}