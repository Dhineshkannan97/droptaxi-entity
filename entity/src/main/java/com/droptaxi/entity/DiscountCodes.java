package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity(name = "com.droptaxi.entity.DiscountCodes")
@Table(name = "DISCOUNT_CODES")
public class DiscountCodes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DC_ID\"", nullable = false)
  private Integer dcId;
  @Column(name = "\"DC_DISCOUNT_CODE\"", nullable = false)
  private String dcDiscountCode;
  @Column(name = "\"DC_AMOUNT\"", nullable = false)
  private Integer dcAmount;
  @Column(name = "\"DC_VALIDITY\"", nullable = false)
  private Date dcValidity;
  @Column(name = "\"DC_ISACTIVE\"", nullable = false)
  private Byte dcIsactive;
}