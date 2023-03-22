package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.MiscExpenses")
@Table(name = "MISC_EXPENSES")
public class MiscExpenses {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"M_ID\"", nullable = false)
  private Integer mId;
  @Column(name = "\"M_DOENTRY\"", nullable = false)
  private Timestamp mDoentry;
  @Column(name = "\"M_DOPAYMENT\"", nullable = false)
  private Timestamp mDopayment;
  @Column(name = "\"M_DESCRIPTION\"", nullable = false)
  private String mDescription;
  @Column(name = "\"M_HEAD\"", nullable = false)
  private String mHead;
  @Column(name = "\"M_MODE_OF_PAYMENT\"", nullable = true)
  private String mModeOfPayment;
  @Column(name = "\"M_DB_CR\"", nullable = false)
  private String mDbCr;
  @Column(name = "\"M_AMOUNT\"", nullable = false)
  private Float mAmount;
  @Column(name = "\"M_BALANCE\"", nullable = false)
  private Float mBalance;
  @Column(name = "\"M_ISACTIVE\"", nullable = false)
  private boolean mIsactive;
}