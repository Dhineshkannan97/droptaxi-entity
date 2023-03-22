package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.VehicleMaster")
@Table(name = "VEHICLE_MASTER")
public class VehicleMaster {

  @Id
  @Column(name = "\"VM_VEHICLE_ID\"", nullable = false)
  private String vmVehicleId;
  @Column(name = "\"VM_VEHICLE_TYPEID\"", nullable = false)
  private String vmVehicleTypeid;
  @Column(name = "\"VM_VEHICLE_MODEL\"", nullable = true)
  private String vmVehicleModel;
  @Column(name = "\"VM_TRAVELS_ID\"", nullable = false)
  private String vmTravelsId;
  @Column(name = "\"VM_VEHICLE_REGNO\"", nullable = false)
  private String vmVehicleRegno;
  @Column(name = "\"VM_PERMIT_NO\"", nullable = true)
  private String vmPermitNo;
  @Column(name = "\"VM_RTO\"", nullable = true)
  private String vmRto;
  @Column(name = "\"VM_INTERSTATE_PERMIT\"", nullable = false)
  private String vmInterstatePermit;
  @Column(name = "\"VM_REGISTRATION_ADDRESS\"", nullable = false)
  private String vmRegistrationAddress;
  @Column(name = "\"VM_REGISTRATION_CITY\"", nullable = false)
  private String vmRegistrationCity;
  @Column(name = "\"VM_REGISTRATION_PINCODE\"", nullable = true)
  private Integer vmRegistrationPincode;
  @Column(name = "\"VM_REGISTRATION_STATE\"", nullable = true)
  private String vmRegistrationState;
  @Column(name = "\"VM_OVERALL\"", nullable = false)
  private boolean vmOverall;
  @Column(name = "\"VM_STEERING\"", nullable = false)
  private boolean vmSteering;
  @Column(name = "\"VM_INTERIOR\"", nullable = false)
  private boolean vmInterior;
  @Column(name = "\"VM_OUTERBODY\"", nullable = false)
  private boolean vmOuterbody;
  @Column(name = "\"VM_RUNNING\"", nullable = false)
  private boolean vmRunning;
  @Column(name = "\"VM_SPEED_GOVERNOR\"", nullable = false)
  private boolean vmSpeedGovernor;
  @Column(name = "\"VM_CHECKEDBY\"", nullable = true)
  private String vmCheckedby;
  @Column(name = "\"VM_INS_VALIDDATE\"", nullable = true)
  private Date vmInsValiddate;
  @Column(name = "\"VM_FC_VALIDDATE\"", nullable = true)
  private Date vmFcValiddate;
  @Column(name = "\"VM_ISRC\"", nullable = true)
  private boolean vmIsrc;
  @Column(name = "\"VM_ISINSURANCE\"", nullable = true)
  private boolean vmIsinsurance;
  @Column(name = "\"VM_GPS_IMEI_NO\"", nullable = true)
  private String vmGpsImeiNo;
  @Column(name = "\"VM_GPS_SIM_NO\"", nullable = true)
  private Long vmGpsSimNo;
  @Column(name = "\"VM_ENTRY_BY\"", nullable = true)
  private String vmEntryBy;
  @Column(name = "\"VM_EDITED_BY\"", nullable = true)
  private String vmEditedBy;
  @Column(name = "\"VM_EDITED_ON\"", nullable = true)
  private Timestamp vmEditedOn;
  @Column(name = "\"VM_ISACTIVE\"", nullable = false)
  private boolean vmIsactive;
  @Column(name = "\"VM_TSTAMP\"", nullable = false)
  private Timestamp vmTstamp;
  @Column(name = "\"VM_VEHICLE_TYPE\"", nullable = true)
  private String vmVehicleType;
}