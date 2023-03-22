package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.TravelsMaster")
@Table(name = "TRAVELS_MASTER")
public class TravelsMaster {

  @Id
  @Column(name = "\"TM_TRAVELS_ID\"", nullable = false)
  private String tmTravelsId;
  @Column(name = "\"TM_TRAVELS_NAME\"", nullable = false)
  private String tmTravelsName;
  @Column(name = "\"TM_TRAVELS_NO\"", nullable = false)
  private Integer tmTravelsNo;
  @Column(name = "\"TM_APP_GIVEN\"", nullable = false)
  private boolean tmAppGiven;
  @Column(name = "\"TM_CAR_BRANDING_DONE\"", nullable = false)
  private Byte tmCarBrandingDone;
  @Column(name = "\"TM_AGREEMENT_DONE\"", nullable = false)
  private Byte tmAgreementDone;
  @Column(name = "\"TM_AGREEMENT_SIGNED_DATE\"", nullable = true)
  private Date tmAgreementSignedDate;
  @Column(name = "\"TM_AGREEMENT_EXPIRY_DATE\"", nullable = true)
  private Date tmAgreementExpiryDate;
  @Column(name = "\"TM_POL_VERIFIED\"", nullable = false)
  private Byte tmPolVerified;
  @Column(name = "\"TM_AC_BALANCE\"", nullable = false)
  private Integer tmAcBalance;
  @Column(name = "\"TM_CONTACT_PERSON\"", nullable = false)
  private String tmContactPerson;
  @Column(name = "\"TM_PAN_NO\"", nullable = true)
  private String tmPanNo;
  @Column(name = "\"TM_AADHAR_NO\"", nullable = true)
  private String tmAadharNo;
  @Column(name = "\"TM_TELEPHONE1\"", nullable = true)
  private Long tmTelephone1;
  @Column(name = "\"TM_TELEPHONE2\"", nullable = true)
  private Long tmTelephone2;
  @Column(name = "\"TM_TELEPHONE3\"", nullable = true)
  private Long tmTelephone3;
  @Column(name = "\"TM_MOBILE_NO\"", nullable = false)
  private Long tmMobileNo;
  @Column(name = "\"TM_ADDRESS\"", nullable = false)
  private String tmAddress;
  @Column(name = "\"TM_CITY\"", nullable = true)
  private String tmCity;
  @Column(name = "\"TM_HUB\"", nullable = true)
  private String tmHub;
  @Column(name = "\"TM_NATIVE_HUB\"", nullable = true)
  private String tmNativeHub;
  @Column(name = "\"TM_PINCODE\"", nullable = true)
  private Integer tmPincode;
  @Column(name = "\"TM_STATE\"", nullable = true)
  private String tmState;
  @Column(name = "\"TM_EMAIL\"", nullable = true)
  private String tmEmail;
  @Column(name = "\"TM_PASSWORD\"", nullable = true)
  private String tmPassword;
  @Column(name = "\"TM_INBUSINESS\"", nullable = false)
  private boolean tmInbusiness;
  @Column(name = "\"TM_ISACTIVE\"", nullable = false)
  private boolean tmIsactive;
  @Column(name = "\"TM_ADDED_BY\"", nullable = true)
  private String tmAddedBy;
  @Column(name = "\"TM_EDITED_BY\"", nullable = true)
  private String tmEditedBy;
  @Column(name = "\"TM_EDITED_ON\"", nullable = true)
  private Timestamp tmEditedOn;
  @Column(name = "\"TM_TSTAMP\"", nullable = false)
  private Timestamp tmTstamp;
  @Column(name = "\"TM_APPROVED\"", nullable = false)
  private boolean tmApproved;
  @Column(name = "\"TM_FROM_BIDDINGAPP\"", nullable = false)
  private boolean tmFromBiddingapp;
}