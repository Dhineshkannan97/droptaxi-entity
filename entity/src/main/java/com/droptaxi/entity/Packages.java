package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.Packages")
@Table(name = "PACKAGES")
public class Packages {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"P_ID\"", nullable = false)
  private Integer pId;
  @Column(name = "\"P_ORDER\"", nullable = false)
  private Integer pOrder;
  @Column(name = "\"P_TYPE\"", nullable = false)
  private String pType;
  @Column(name = "\"P_NAME\"", nullable = false)
  private String pName;
  @Column(name = "\"P_VEHICLE_TYPE_ID\"", nullable = false)
  private String pVehicleTypeId;
  @Column(name = "\"P_KMS_LIMIT\"", nullable = false)
  private Integer pKmsLimit;
  @Column(name = "\"P_HRS_LIMIT\"", nullable = false)
  private Integer pHrsLimit;
  @Column(name = "\"P_ADDL_KMS_RATE\"", nullable = false)
  private Float pAddlKmsRate;
  @Column(name = "\"P_ADDL_HRS_RATE\"", nullable = false)
  private Float pAddlHrsRate;
  @Column(name = "\"P_PRICE\"", nullable = false)
  private Float pPrice;
  @Column(name = "\"P_BASE_FARE\"", nullable = false)
  private Float pBaseFare;
  @Column(name = "\"P_BASE_CGST\"", nullable = false)
  private Float pBaseCgst;
  @Column(name = "\"P_BASE_SGST\"", nullable = false)
  private Float pBaseSgst;
  @Column(name = "\"P_FAC\"", nullable = false)
  private Float pFac;
  @Column(name = "\"P_FAC_CGST\"", nullable = false)
  private Float pFacCgst;
  @Column(name = "\"P_FAC_SGST\"", nullable = false)
  private Float pFacSgst;
  @Column(name = "\"P_AK_BASE_FARE\"", nullable = false)
  private Float pAkBaseFare;
  @Column(name = "\"P_AK_BASE_CGST\"", nullable = false)
  private Float pAkBaseCgst;
  @Column(name = "\"P_AK_BASE_SGST\"", nullable = false)
  private Float pAkBaseSgst;
  @Column(name = "\"P_AK_FAC\"", nullable = false)
  private Float pAkFac;
  @Column(name = "\"P_AK_FAC_CGST\"", nullable = false)
  private Float pAkFacCgst;
  @Column(name = "\"P_AK_FAC_SGST\"", nullable = false)
  private Float pAkFacSgst;
  @Column(name = "\"P_AH_BASE_FARE\"", nullable = false)
  private Float pAhBaseFare;
  @Column(name = "\"P_AH_BASE_CGST\"", nullable = false)
  private Float pAhBaseCgst;
  @Column(name = "\"P_AH_BASE_SGST\"", nullable = false)
  private Float pAhBaseSgst;
  @Column(name = "\"P_AH_FAC\"", nullable = false)
  private Float pAhFac;
  @Column(name = "\"P_AH_FAC_CGST\"", nullable = false)
  private Float pAhFacCgst;
  @Column(name = "\"P_AH_FAC_SGST\"", nullable = false)
  private Float pAhFacSgst;
  @Column(name = "\"P_ISACTIVE\"", nullable = false)
  private boolean pIsactive;
}