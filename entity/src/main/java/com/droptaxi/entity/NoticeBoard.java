package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.NoticeBoard")
@Table(name = "NOTICE_BOARD")
public class NoticeBoard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"NB_ID\"", nullable = false)
  private Integer nbId;
  @Column(name = "\"NB_MESG\"", nullable = false)
  private String nbMesg;
  @Column(name = "\"NB_LOC\"", nullable = false)
  private String nbLoc;
  @Column(name = "\"NB_BLOCK\"", nullable = false)
  private String nbBlock;
  @Column(name = "\"NB_BORDER\"", nullable = false)
  private boolean nbBorder;
  @Column(name = "\"NB_COLOR\"", nullable = false)
  private String nbColor;
  @Column(name = "\"NB_BOLD\"", nullable = false)
  private boolean nbBold;
  @Column(name = "\"NB_POSTED_BY\"", nullable = false)
  private String nbPostedBy;
  @Column(name = "\"NB_ISACTIVE\"", nullable = false)
  private boolean nbIsactive;
  @Column(name = "\"NB_TSTAMP\"", nullable = false)
  private Timestamp nbTstamp;
}