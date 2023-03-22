package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Complaints")
@Table(name = "COMPLAINTS")
public class Complaints {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"C_ID\"", nullable = false)
  private Integer cId;
  @Column(name = "\"C_NAME\"", nullable = false)
  private String cName;
  @Column(name = "\"C_MOBILE_NO\"", nullable = false)
  private Long cMobileNo;
  @Column(name = "\"C_EMAILID\"", nullable = true)
  private String cEmailid;
  @Column(name = "\"C_JOURNEY_ID\"", nullable = true)
  private String cJourneyId;
  @Column(name = "\"C_RASHDRIVING\"", nullable = false)
  private boolean cRashdriving;
  @Column(name = "\"C_EXCESSAMOUNT\"", nullable = false)
  private boolean cExcessamount;
  @Column(name = "\"C_RUDE\"", nullable = false)
  private boolean cRude;
  @Column(name = "\"C_VEHICLENOTCLEAN\"", nullable = false)
  private boolean cVehiclenotclean;
  @Column(name = "\"C_NOTONTIME\"", nullable = false)
  private boolean cNotontime;
  @Column(name = "\"C_COMMENT\"", nullable = false)
  private String cComment;
  @Column(name = "\"C_ENTRYBY\"", nullable = true)
  private String cEntryby;
  @Column(name = "\"C_ACTION\"", nullable = true)
  private String cAction;
  @Column(name = "\"C_REPLY\"", nullable = true)
  private String cReply;
  @Column(name = "\"C_REPLY_DT\"", nullable = true)
  private Timestamp cReplyDt;
  @Column(name = "\"C_ISACTIVE\"", nullable = false)
  private boolean cIsactive;
  @Column(name = "\"C_TIMESTAMP\"", nullable = false)
  private Timestamp cTimestamp;
}