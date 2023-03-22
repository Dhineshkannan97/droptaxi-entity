package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.NewCustomersList")
@Table(name = "NEW_CUSTOMERS_LIST")
public class NewCustomersList {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NCL_ID\"", nullable = false)
  private Integer nclId;
  @Column(name = "\"NCL_DT\"", nullable = false)
  private Date nclDt;
  @Column(name = "\"NCL_USER_ID\"", nullable = false)
  private String nclUserId;
  @Column(name = "\"NCL_HOW_KNOW\"", nullable = true)
  private String nclHowKnow;
  @Column(name = "\"NCL_ISACTIVE\"", nullable = false)
  private boolean nclIsactive;
  @Column(name = "\"NCL_TIMESTAMP\"", nullable = false)
  private Timestamp nclTimestamp;
}