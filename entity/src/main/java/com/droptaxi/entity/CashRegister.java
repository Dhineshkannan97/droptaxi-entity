package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.CashRegister")
@Table(name = "CASH_REGISTER")
public class CashRegister {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CR_ID\"", nullable = false)
  private Integer crId;
  @Column(name = "\"CR_TRAVELS_ID\"", nullable = false)
  private String crTravelsId;
  @Column(name = "\"CR_DATE_OF_PAYMENT\"", nullable = false)
  private Timestamp crDateOfPayment;
  @Column(name = "\"CR_AMOUNT\"", nullable = false)
  private Float crAmount;
  @Column(name = "\"CR_CREDIT_DEBIT\"", nullable = false)
  private String crCreditDebit;
  @Column(name = "\"CR_MODE\"", nullable = false)
  private String crMode;
  @Column(name = "\"CR_BANK\"", nullable = true)
  private String crBank;
  @Column(name = "\"CR_REFNO\"", nullable = true)
  private String crRefno;
  @Column(name = "\"CR_REMARKS\"", nullable = true)
  private String crRemarks;
  @Column(name = "\"CR_ENTRY_BY\"", nullable = false)
  private String crEntryBy;
  @Column(name = "\"CR_EDITED_BY\"", nullable = true)
  private String crEditedBy;
  @Column(name = "\"CR_IS_ADDED\"", nullable = false)
  private boolean crIsAdded;
  @Column(name = "\"CR_ADDED_BY\"", nullable = true)
  private String crAddedBy;
  @Column(name = "\"CR_ADDED_DATE\"", nullable = true)
  private Timestamp crAddedDate;
  @Column(name = "\"CR_ISACTIVE\"", nullable = false)
  private boolean crIsactive;
  @Column(name = "\"CR_ENTRY_DATE\"", nullable = false)
  private Timestamp crEntryDate;
  @Column(name = "\"CR_EDITED_DATE\"", nullable = true)
  private Timestamp crEditedDate;
}