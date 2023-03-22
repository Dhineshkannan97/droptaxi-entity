package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.Agency")
@Table(name = "AGENCY")
public class Agency {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AG_AUTOID\"", nullable = false)
  private Integer agAutoid;
  @Column(name = "\"AG_ROLE_ID\"", nullable = false)
  private String agRoleId;
  @Column(name = "\"AG_TYPE_ID\"", nullable = false)
  private String agTypeId;
  @Column(name = "\"AG_ORG_NAME\"", nullable = false)
  private String agOrgName;
  @Column(name = "\"AG_EMAIL\"", nullable = false)
  private String agEmail;
  @Column(name = "\"AG_CONTACT_PERSON\"", nullable = false)
  private String agContactPerson;
  @Column(name = "\"AG_MOBILE_NO\"", nullable = false)
  private Long agMobileNo;
  @Column(name = "\"AG_ALT_NO\"", nullable = true)
  private Long agAltNo;
  @Column(name = "\"AG_PASSWORD\"", nullable = false)
  private String agPassword;
  @Column(name = "\"AG_ADDRESS\"", nullable = true)
  private String agAddress;
  @Column(name = "\"AG_LANDMARK\"", nullable = true)
  private String agLandmark;
  @Column(name = "\"AG_CITY\"", nullable = true)
  private String agCity;
  @Column(name = "\"AG_DISTRICT\"", nullable = true)
  private String agDistrict;
  @Column(name = "\"AG_PINCODE\"", nullable = true)
  private Integer agPincode;
  @Column(name = "\"AG_STATE\"", nullable = true)
  private String agState;
  @Column(name = "\"AG_AC_NAME\"", nullable = true)
  private String agAcName;
  @Column(name = "\"AG_AC_BALANCE\"", nullable = false)
  private Float agAcBalance;
  @Column(name = "\"AG_BUSINESS_TYPE\"", nullable = true)
  private String agBusinessType;
  @Column(name = "\"AG_BANK_NAME\"", nullable = true)
  private String agBankName;
  @Column(name = "\"AG_BANK_AC_NO\"", nullable = true)
  private String agBankAcNo;
  @Column(name = "\"AG_BANK_BRANCH\"", nullable = true)
  private String agBankBranch;
  @Column(name = "\"AG_BANK_IFSC\"", nullable = true)
  private String agBankIfsc;
  @Column(name = "\"AG_PAN_NO\"", nullable = true)
  private String agPanNo;
  @Column(name = "\"AG_GST_NO\"", nullable = true)
  private String agGstNo;
  @Column(name = "\"AG_IGST\"", nullable = false)
  private Float agIgst;
  @Column(name = "\"AG_IS_RESELLER\"", nullable = false)
  private boolean agIsReseller;
  @Column(name = "\"AG_IS_TRAIN_TKT\"", nullable = true)
  private boolean agIsTrainTkt;
  @Column(name = "\"AG_IS_FLIGHT_TKT\"", nullable = true)
  private boolean agIsFlightTkt;
  @Column(name = "\"AG_IS_PASSPORT_APPLICATION\"", nullable = true)
  private boolean agIsPassportApplication;
  @Column(name = "\"AG_IS_VISA_PROCESSING\"", nullable = true)
  private boolean agIsVisaProcessing;
  @Column(name = "\"AG_OTHER_SERVICES\"", nullable = true)
  private String agOtherServices;
  @Column(name = "\"AG_DISPLAY_PARTIAL_PAYMENT\"", nullable = false)
  private boolean agDisplayPartialPayment;
  @Column(name = "\"AG_DISPLAY_PAYMENT_LATER\"", nullable = false)
  private boolean agDisplayPaymentLater;
  @Column(name = "\"AG_EDITED\"", nullable = true)
  private Timestamp agEdited;
  @Column(name = "\"AG_CREATED\"", nullable = false)
  private Timestamp agCreated;
  @Column(name = "\"AG_STATUS\"", nullable = false)
  private String agStatus;
  @Column(name = "\"AG_ISACTIVE\"", nullable = false)
  private boolean agIsactive;
}