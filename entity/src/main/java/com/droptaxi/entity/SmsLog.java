package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.SmsLog")
@Table(name = "SMS_LOG")
public class SmsLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"LOG_ID\"", nullable = false)
  private Long logId;
  @Column(name = "\"SMS_NO\"", nullable = true)
  private Long smsNo;
  @Column(name = "\"SENT_STATUS\"", nullable = true)
  private String sentStatus;
  @Column(name = "\"SMS_CONTENT\"", nullable = true)
  private String smsContent;
  @Column(name = "\"TIME_SENT\"", nullable = false)
  private Timestamp timeSent;
  @Column(name = "\"SMS_CONTENT_LENGTH\"", nullable = true)
  private Integer smsContentLength;
}