package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Enquiry")
@Table(name = "ENQUIRY")
public class Enquiry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"EN_ID\"", nullable = false)
  private Integer enId;
  @Column(name = "\"EN_FROM_CITY\"", nullable = true)
  private String enFromCity;
  @Column(name = "\"EN_TO_CITY\"", nullable = true)
  private String enToCity;
  @Column(name = "\"EN_JOURNEY_TYPE\"", nullable = true)
  private String enJourneyType;
  @Column(name = "\"EN_JOURNEY_DATE\"", nullable = true)
  private Timestamp enJourneyDate;
  @Column(name = "\"EN_STATUS\"", nullable = true)
  private String enStatus;
  @Column(name = "\"EN_ENQUIRY_SOURCE\"", nullable = true)
  private String enEnquirySource;
  @Column(name = "\"EN_ENQUIRY_DETAILS\"", nullable = false)
  private String enEnquiryDetails;
  @Column(name = "\"EN_REMARKS\"", nullable = true)
  private String enRemarks;
  @Column(name = "\"EN_TAKEN_BY\"", nullable = false)
  private String enTakenBy;
  @Column(name = "\"EN_REMARKS_SAVED_BY\"", nullable = true)
  private String enRemarksSavedBy;
  @Column(name = "\"EN_CUST_NAME\"", nullable = false)
  private String enCustName;
  @Column(name = "\"EN_CUST_MOBILE\"", nullable = false)
  private Long enCustMobile;
  @Column(name = "\"EN_CUST_EMAIL\"", nullable = true)
  private String enCustEmail;
  @Column(name = "\"EN_RECD_DATETIME\"", nullable = false)
  private Timestamp enRecdDatetime;
  @Column(name = "\"EN_REMARKS_DATETIME\"", nullable = true)
  private Timestamp enRemarksDatetime;
  @Column(name = "\"EN_FOLLOWED_BY\"", nullable = true)
  private String enFollowedBy;
  @Column(name = "\"EN_FOLLOWED_DATETIME\"", nullable = true)
  private Timestamp enFollowedDatetime;
  @Column(name = "\"EN_ISACTIVE\"", nullable = false)
  private boolean enIsactive;
  @Column(name = "\"EN_TSTAMP\"", nullable = false)
  private Timestamp enTstamp;
}