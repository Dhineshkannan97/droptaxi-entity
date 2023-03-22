package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.NotSendRequest")
@Table(name = "NOT_SEND_REQUEST")
public class NotSendRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NSR_ID\"", nullable = false)
  private Integer nsrId;
  @Column(name = "\"NSR_STATUS\"", nullable = false)
  private String nsrStatus;
  @Column(name = "\"NSR_TOKENS\"", nullable = false)
  private String nsrTokens;
  @Column(name = "\"NSR_NM_ID\"", nullable = false)
  private Integer nsrNmId;
  @Column(name = "\"NSR_SEND_RESULT\"", nullable = false)
  private String nsrSendResult;
  @Column(name = "\"NSR_ISACTIVE\"", nullable = false)
  private Integer nsrIsactive;
}