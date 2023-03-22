package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.StatusLog")
@Table(name = "STATUS_LOG")
public class StatusLog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"S_ID\"", nullable = false)
  private Integer sId;
  @Column(name = "\"S_STATUS\"", nullable = false)
  private String sStatus;
  @Column(name = "\"S_CHANGED_BY\"", nullable = false)
  private String sChangedBy;
  @Column(name = "\"S_DATE_TIME\"", nullable = false)
  private Timestamp sDateTime;
  @Column(name = "\"S_JID\"", nullable = false)
  private String sJid;
}