package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Smstoagency")
@Table(name = "SMSTOAGENCY")
@IdClass(Smstoagency.PrimaryKeys.class)
public class Smstoagency {
  @Data
  public static class PrimaryKeys implements Serializable {
    private String agOrgName;
    private Long logId;
  }

  @Id
  @Column(name = "\"AG_ORG_NAME\"", nullable = false)
  private String agOrgName;
  @Id
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