package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.SmsTemplates")
@Table(name = "SMS_TEMPLATES")
public class SmsTemplates {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ST_ID\"", nullable = false)
  private Integer stId;
  @Column(name = "\"ST_TEMPLATE\"", nullable = false)
  private String stTemplate;
  @Column(name = "\"ST_TYPE\"", nullable = false)
  private String stType;
  @Column(name = "\"ST_USED_IN\"", nullable = true)
  private String stUsedIn;
  @Column(name = "\"ST_ISACTIVE\"", nullable = false)
  private boolean stIsactive;
}