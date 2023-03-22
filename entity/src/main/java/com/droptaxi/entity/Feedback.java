package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Feedback")
@Table(name = "FEEDBACK")
public class Feedback {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"FB_ID\"", nullable = false)
  private Integer fbId;
  @Column(name = "\"FB_NAME\"", nullable = false)
  private String fbName;
  @Column(name = "\"FB_MOBILE_NO\"", nullable = false)
  private Long fbMobileNo;
  @Column(name = "\"FB_EMAILID\"", nullable = true)
  private String fbEmailid;
  @Column(name = "\"FB_COMMENT\"", nullable = false)
  private String fbComment;
  @Column(name = "\"FB_JOURNEYID\"", nullable = true)
  private String fbJourneyid;
  @Column(name = "\"FB_RATING\"", nullable = false)
  private Byte fbRating;
  @Column(name = "\"FB_ACTION\"", nullable = true)
  private String fbAction;
  @Column(name = "\"FB_REPLY\"", nullable = true)
  private String fbReply;
  @Column(name = "\"FB_REPLY_DT\"", nullable = true)
  private Timestamp fbReplyDt;
  @Column(name = "\"FB_ISACTIVE\"", nullable = false)
  private boolean fbIsactive;
  @Column(name = "\"FB_TIMESTAMP\"", nullable = false)
  private Timestamp fbTimestamp;
}