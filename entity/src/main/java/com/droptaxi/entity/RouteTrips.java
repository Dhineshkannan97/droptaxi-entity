package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.RouteTrips")
@Table(name = "ROUTE_TRIPS")
public class RouteTrips {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"RT_ID\"", nullable = false)
  private Integer rtId;
  @Column(name = "\"RT_ROUTEID\"", nullable = false)
  private String rtRouteid;
  @Column(name = "\"RT_YEAR\"", nullable = false)
  private Integer rtYear;
  @Column(name = "\"RT_JAN\"", nullable = false)
  private Integer rtJan;
  @Column(name = "\"RT_FEB\"", nullable = false)
  private Integer rtFeb;
  @Column(name = "\"RT_MAR\"", nullable = false)
  private Integer rtMar;
  @Column(name = "\"RT_APR\"", nullable = false)
  private Integer rtApr;
  @Column(name = "\"RT_MAY\"", nullable = false)
  private Integer rtMay;
  @Column(name = "\"RT_JUN\"", nullable = false)
  private Integer rtJun;
  @Column(name = "\"RT_JUL\"", nullable = false)
  private Integer rtJul;
  @Column(name = "\"RT_AUG\"", nullable = false)
  private Integer rtAug;
  @Column(name = "\"RT_SEP\"", nullable = false)
  private Integer rtSep;
  @Column(name = "\"RT_OCT\"", nullable = false)
  private Integer rtOct;
  @Column(name = "\"RT_NOV\"", nullable = false)
  private Integer rtNov;
  @Column(name = "\"RT_DEC\"", nullable = false)
  private Integer rtDec;
  @Column(name = "\"RT_ISACTIVE\"", nullable = false)
  private boolean rtIsactive;
}