package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.B2baccounts")
@Table(name = "B2BACCOUNTS")
public class B2baccounts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"B2BAC_ID\"", nullable = false)
  private Integer b2bacId;
  @Column(name = "\"B2BAC_AGENCY_ID\"", nullable = false)
  private String b2bacAgencyId;
  @Column(name = "\"B2BAC_DATE_OF_PAYMENT\"", nullable = false)
  private Timestamp b2bacDateOfPayment;
  @Column(name = "\"B2BAC_MODE_OF_PAYMENT\"", nullable = true)
  private String b2bacModeOfPayment;
  @Column(name = "\"B2BAC_BANK\"", nullable = true)
  private String b2bacBank;
  @Column(name = "\"B2BAC_REF_NO\"", nullable = true)
  private String b2bacRefNo;
  @Column(name = "\"B2BAC_PAYMENT_DETAILS\"", nullable = true)
  private String b2bacPaymentDetails;
  @Column(name = "\"B2BAC_AMOUNT\"", nullable = false)
  private Integer b2bacAmount;
  @Column(name = "\"B2BAC_CUST_GST\"", nullable = false)
  private Float b2bacCustGst;
  @Column(name = "\"B2BAC_DT_GST\"", nullable = false)
  private Float b2bacDtGst;
  @Column(name = "\"B2BAC_CREDIT_DEBIT\"", nullable = false)
  private String b2bacCreditDebit;
  @Column(name = "\"B2BAC_JOURNEY_ID\"", nullable = true)
  private String b2bacJourneyId;
  @Column(name = "\"B2BAC_BALANCE\"", nullable = false)
  private Integer b2bacBalance;
  @Column(name = "\"B2BAC_ENTERED_BY\"", nullable = false)
  private String b2bacEnteredBy;
  @Column(name = "\"B2BAC_EDITED_BY\"", nullable = true)
  private String b2bacEditedBy;
  @Column(name = "\"B2BAC_EDITED_DATE\"", nullable = true)
  private Timestamp b2bacEditedDate;
  @Column(name = "\"B2BAC_TIMESTAMP\"", nullable = false)
  private Timestamp b2bacTimestamp;
  @Column(name = "\"B2BAC_ISACTIVE\"", nullable = false)
  private boolean b2bacIsactive;
}