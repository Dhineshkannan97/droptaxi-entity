package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.UserMaster")
@Table(name = "USER_MASTER")
public class UserMaster {

  @Id
  @Column(name = "\"UM_USER_ID\"", nullable = false)
  private String umUserId;
  @Column(name = "\"UM_USER_ROLE_ID\"", nullable = false)
  private String umUserRoleId;
  @Column(name = "\"UM_USER_TYPE_ID\"", nullable = false)
  private String umUserTypeId;
  @Column(name = "\"UM_SALUTATION\"", nullable = true)
  private String umSalutation;
  @Column(name = "\"UM_USER_NAME\"", nullable = false)
  private String umUserName;
  @Column(name = "\"UM_REF_BAL\"", nullable = false)
  private Float umRefBal;
  @Column(name = "\"UM_REF_BY\"", nullable = true)
  private String umRefBy;
  @Column(name = "\"UM_COMPANY_NAME\"", nullable = true)
  private String umCompanyName;
  @Column(name = "\"UM_GST_NO\"", nullable = true)
  private String umGstNo;
  @Column(name = "\"UM_USER_EMAILID\"", nullable = false)
  private String umUserEmailid;
  @Column(name = "\"UM_USER_PASSWORD\"", nullable = false)
  private String umUserPassword;
  @Column(name = "\"UM_USER_MOBILE_NO\"", nullable = false)
  private Long umUserMobileNo;
  @Column(name = "\"UM_LOGIN_OTP\"", nullable = false)
  private Integer umLoginOtp;
  @Column(name = "\"UM_OTP_MOBILE_NO\"", nullable = false)
  private Long umOtpMobileNo;
  @Column(name = "\"UM_USER_ALT_CONTACT_NO\"", nullable = true)
  private Long umUserAltContactNo;
  @Column(name = "\"UM_USER_ADDRESS\"", nullable = true)
  private String umUserAddress;
  @Column(name = "\"UM_USER_CITY\"", nullable = true)
  private String umUserCity;
  @Column(name = "\"UM_USER_PINCODE\"", nullable = true)
  private Integer umUserPincode;
  @Column(name = "\"UM_USER_STATE\"", nullable = true)
  private String umUserState;
  @Column(name = "\"UM_LANGUAGE\"", nullable = true)
  private String umLanguage;
  @Column(name = "\"UM_HOW_KNOW\"", nullable = true)
  private String umHowKnow;
  @Column(name = "\"UM_USER_STATUS\"", nullable = false)
  private boolean umUserStatus;
  @Column(name = "\"UM_BLOCKED_BY\"", nullable = true)
  private String umBlockedBy;
  @Column(name = "\"UM_BLOCKED_ON\"", nullable = true)
  private Timestamp umBlockedOn;
  @Column(name = "\"UM_UNBLOCKED_BY\"", nullable = true)
  private String umUnblockedBy;
  @Column(name = "\"UM_UNBLOCKED_ON\"", nullable = true)
  private Timestamp umUnblockedOn;
  @Column(name = "\"UM_BLOCKED_REASON\"", nullable = true)
  private String umBlockedReason;
  @Column(name = "\"UM_ISACTIVE\"", nullable = false)
  private boolean umIsactive;
  @Column(name = "\"UM_TSTAMP\"", nullable = false)
  private Timestamp umTstamp;
}