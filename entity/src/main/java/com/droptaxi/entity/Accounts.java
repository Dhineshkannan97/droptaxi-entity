package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Accounts")
@Table(name = "ACCOUNTS")
public class Accounts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AC_ID\"", nullable = false)
  private Integer acId;
  @Column(name = "\"AC_TRAVELS_ID\"", nullable = false)
  private String acTravelsId;
  @Column(name = "\"AC_DATE_OF_PAYMENT\"", nullable = false)
  private Timestamp acDateOfPayment;
  @Column(name = "\"AC_MODE_OF_PAYMENT\"", nullable = true)
  private String acModeOfPayment;
  @Column(name = "\"AC_BANK\"", nullable = true)
  private String acBank;
  @Column(name = "\"AC_REF_NO\"", nullable = true)
  private String acRefNo;
  @Column(name = "\"AC_PAYMENT_DETAILS\"", nullable = true)
  private String acPaymentDetails;
  @Column(name = "\"AC_AMOUNT\"", nullable = false)
  private Integer acAmount;
  @Column(name = "\"AC_AMOUNT_N\"", nullable = false)
  private Integer acAmountN;
  @Column(name = "\"AC_CUST_GST\"", nullable = false)
  private Float acCustGst;
  @Column(name = "\"AC_DT_GST\"", nullable = false)
  private Float acDtGst;
  @Column(name = "\"AC_CREDIT_DEBIT\"", nullable = false)
  private String acCreditDebit;
  @Column(name = "\"AC_JOURNEY_ID\"", nullable = true)
  private String acJourneyId;
  @Column(name = "\"AC_BALANCE\"", nullable = false)
  private Integer acBalance;
  @Column(name = "\"AC_ENTERED_BY\"", nullable = false)
  private String acEnteredBy;
  @Column(name = "\"AC_EDITED_BY\"", nullable = true)
  private String acEditedBy;
  @Column(name = "\"AC_EDITED_DATE\"", nullable = true)
  private Timestamp acEditedDate;
  @Column(name = "\"AC_TIMESTAMP\"", nullable = false)
  private Timestamp acTimestamp;
  @Column(name = "\"AC_ISACTIVE\"", nullable = false)
  private boolean acIsactive;
}