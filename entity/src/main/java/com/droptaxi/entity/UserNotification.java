package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.UserNotification")
@Table(name = "USER_NOTIFICATION")
public class UserNotification {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"UN_ID\"", nullable = false)
  private Integer unId;
  @Column(name = "\"UN_USER_ID\"", nullable = false)
  private String unUserId;
  @Column(name = "\"UN_MESSAGE\"", nullable = false)
  private String unMessage;
  @Column(name = "\"UN_TIMESTAMP\"", nullable = false)
  private Timestamp unTimestamp;
}