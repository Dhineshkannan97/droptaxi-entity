package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.LoginLog")
@Table(name = "LOGIN_LOG")
public class LoginLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"L_ID\"", nullable = false)
  private Integer lId;
  @Column(name = "\"L_USERID\"", nullable = false)
  private String lUserid;
  @Column(name = "\"L_LOGIN_DATETIME\"", nullable = true)
  private Timestamp lLoginDatetime;
  @Column(name = "\"L_LOGOUT_DATETIME\"", nullable = true)
  private Timestamp lLogoutDatetime;
  @Column(name = "\"L_STATUS\"", nullable = true)
  private String lStatus;
  @Column(name = "\"L_SESSIONID\"", nullable = true)
  private String lSessionid;
}