package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.ReferralLog")
@Table(name = "REFERRAL_LOG")
public class ReferralLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"RL_ID\"", nullable = false)
  private Integer rlId;
  @Column(name = "\"RL_USER_NAME\"", nullable = true)
  private String rlUserName;
  @Column(name = "\"RL_USER_MOBILE\"", nullable = true)
  private Long rlUserMobile;
  @Column(name = "\"RL_FRIEND_MOBILE\"", nullable = true)
  private Long rlFriendMobile;
  @Column(name = "\"RL_SENT_STATUS\"", nullable = true)
  private String rlSentStatus;
  @Column(name = "\"RL_EMAILID\"", nullable = true)
  private String rlEmailid;
  @Column(name = "\"RL_DATE_TIME\"", nullable = false)
  private Timestamp rlDateTime;
  @Column(name = "\"RL_ISACTIVE\"", nullable = false)
  private boolean rlIsactive;
}