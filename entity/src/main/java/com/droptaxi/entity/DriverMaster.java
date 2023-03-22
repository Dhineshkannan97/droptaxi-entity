package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.DriverMaster")
@Table(name = "DRIVER_MASTER")
public class DriverMaster {

  @Id
  @Column(name = "\"DM_DRIVER_ID\"", nullable = false)
  private String dmDriverId;
  @Column(name = "\"DM_DRIVER_NUMBER\"", nullable = true)
  private Integer dmDriverNumber;
  @Column(name = "\"DM_DRIVER_NAME\"", nullable = false)
  private String dmDriverName;
  @Column(name = "\"DM_PAN_NO\"", nullable = true)
  private String dmPanNo;
  @Column(name = "\"DM_AADHAR_NO\"", nullable = true)
  private String dmAadharNo;
  @Column(name = "\"DM_PASSWORD\"", nullable = true)
  private String dmPassword;
  @Column(name = "\"DM_ATTACHED_TRAVELS\"", nullable = true)
  private String dmAttachedTravels;
  @Column(name = "\"DM_LICENCE_NO\"", nullable = true)
  private String dmLicenceNo;
  @Column(name = "\"DM_BADGENO\"", nullable = true)
  private String dmBadgeno;
  @Column(name = "\"DM_BADGE_EXPIRY\"", nullable = true)
  private Date dmBadgeExpiry;
  @Column(name = "\"DM_OFFICE_NO\"", nullable = true)
  private Long dmOfficeNo;
  @Column(name = "\"DM_MOBILE_NO\"", nullable = false)
  private Long dmMobileNo;
  @Column(name = "\"DM_EMAIL_ID\"", nullable = true)
  private String dmEmailId;
  @Column(name = "\"DM_CURRENT_ADDRESS\"", nullable = true)
  private String dmCurrentAddress;
  @Column(name = "\"DM_CURRENT_CITY\"", nullable = true)
  private String dmCurrentCity;
  @Column(name = "\"DM_CURRENT_PINCODE\"", nullable = true)
  private Integer dmCurrentPincode;
  @Column(name = "\"DM_CURRENT_STATE\"", nullable = true)
  private String dmCurrentState;
  @Column(name = "\"DM_CURRENT_PHONE\"", nullable = true)
  private Long dmCurrentPhone;
  @Column(name = "\"DM_SAMEAS_CURRENTADDRESS\"", nullable = false)
  private Byte dmSameasCurrentaddress;
  @Column(name = "\"DM_PERMANENT_ADDRESS\"", nullable = true)
  private String dmPermanentAddress;
  @Column(name = "\"DM_PERMANENT_CITY\"", nullable = true)
  private String dmPermanentCity;
  @Column(name = "\"DM_PERMANENT_PINCODE\"", nullable = true)
  private Integer dmPermanentPincode;
  @Column(name = "\"DM_PERMANENT_STATE\"", nullable = true)
  private String dmPermanentState;
  @Column(name = "\"DM_PERMANENT_PHONE\"", nullable = true)
  private Long dmPermanentPhone;
  @Column(name = "\"DM_ISPHOTO\"", nullable = false)
  private Byte dmIsphoto;
  @Column(name = "\"DM_ISLICENCE\"", nullable = false)
  private Byte dmIslicence;
  @Column(name = "\"DM_ISOWNERCUMDRIVER\"", nullable = false)
  private Byte dmIsownercumdriver;
  @Column(name = "\"DM_APPROVAL_REMARKS\"", nullable = true)
  private String dmApprovalRemarks;
  @Column(name = "\"DM_ENTRY_BY\"", nullable = true)
  private String dmEntryBy;
  @Column(name = "\"DM_ENTRY_DATE\"", nullable = true)
  private Timestamp dmEntryDate;
  @Column(name = "\"DM_ISACTIVE\"", nullable = false)
  private Byte dmIsactive;
  @Column(name = "\"DM_TSTAMP\"", nullable = false)
  private Timestamp dmTstamp;
}