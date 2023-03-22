package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.NotTokens")
@Table(name = "NOT_TOKENS")
public class NotTokens {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NT_ID\"", nullable = false)
  private Integer ntId;
  @Column(name = "\"NT_TOKEN\"", nullable = true)
  private String ntToken;
  @Column(name = "\"NT_INSTANCE\"", nullable = true)
  private String ntInstance;
  @Column(name = "\"NT_USER_ID\"", nullable = true)
  private String ntUserId;
  @Column(name = "\"NT_STATUS\"", nullable = true)
  private Integer ntStatus;
  @Column(name = "\"NT_REFERRER\"", nullable = true)
  private String ntReferrer;
  @Column(name = "\"NT_TIMESTAMP\"", nullable = false)
  private Timestamp ntTimestamp;
  @Column(name = "\"NT_ISACTIVE\"", nullable = false)
  private Integer ntIsactive;
}