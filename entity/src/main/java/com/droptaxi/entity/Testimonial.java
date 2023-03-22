package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Testimonial")
@Table(name = "TESTIMONIAL")
public class Testimonial {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"T_ID\"", nullable = false)
  private Integer tId;
  @Column(name = "\"T_CUST_NAME\"", nullable = false)
  private String tCustName;
  @Column(name = "\"T_CUST_MESG\"", nullable = false)
  private String tCustMesg;
  @Column(name = "\"T_ISACTIVE\"", nullable = false)
  private boolean tIsactive;
  @Column(name = "\"T_TIMESTAMP\"", nullable = false)
  private Timestamp tTimestamp;
}