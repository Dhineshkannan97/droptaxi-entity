package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.JourneyDetails")
@Table(name = "JOURNEY_DETAILS")
public class JourneyDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"JD_JIDAUTO\"", nullable = false)
  private Long jdJidauto;
  @Column(name = "\"JD_OFFICE_ID\"", nullable = true)
  private String jdOfficeId;
  @Column(name = "\"JD_JOURNEY_ID\"", nullable = false)
  private String jdJourneyId;
  @Column(name = "\"JD_BIDDING\"", nullable = false)
  private boolean jdBidding;
  @Column(name = "\"JD_BOOKED_BY\"", nullable = true)
  private String jdBookedBy;
  @Column(name = "\"JD_ROUTE_MASTER_ID\"", nullable = false)
  private String jdRouteMasterId;
  @Column(name = "\"JD_ROUTE_BASEPOINTS_ID\"", nullable = true)
  private Integer jdRouteBasepointsId;
  @Column(name = "\"JD_DATE_TIME\"", nullable = false)
  private Timestamp jdDateTime;
  @Column(name = "\"JD_NO_OF_DAYS\"", nullable = true)
  private Integer jdNoOfDays;
  @Column(name = "\"JD_VEHICLE_TYPE_ID\"", nullable = false)
  private String jdVehicleTypeId;
  @Column(name = "\"JD_RPKM\"", nullable = true)
  private Float jdRpkm;
  @Column(name = "\"JD_GST\"", nullable = false)
  private Float jdGst;
  @Column(name = "\"JD_TRIP_AMOUNT\"", nullable = false)
  private Float jdTripAmount;
  @Column(name = "\"JD_BID_COMMISSION\"", nullable = false)
  private Float jdBidCommission;
  @Column(name = "\"JD_USER_ID\"", nullable = false)
  private String jdUserId;
  @Column(name = "\"JD_AGENCY_SMSNO\"", nullable = false)
  private Long jdAgencySmsno;
  @Column(name = "\"JD_AG_CUST_NAME\"", nullable = true)
  private String jdAgCustName;
  @Column(name = "\"JD_AG_CUST_MOBILE\"", nullable = false)
  private Long jdAgCustMobile;
  @Column(name = "\"JD_AG_TOTAL_TRIP_AMOUNT\"", nullable = false)
  private Float jdAgTotalTripAmount;
  @Column(name = "\"JD_AG_CASH_TO_DRIVER\"", nullable = false)
  private Float jdAgCashToDriver;
  @Column(name = "\"JD_AG_CASH_TO_OFFICE\"", nullable = false)
  private Float jdAgCashToOffice;
  @Column(name = "\"JD_AG_JOURNEY_PAYMENT\"", nullable = true)
  private String jdAgJourneyPayment;
  @Column(name = "\"JD_PICKUP_POINT_NAME\"", nullable = true)
  private String jdPickupPointName;
  @Column(name = "\"JD_PICKUP_POINT\"", nullable = true)
  private String jdPickupPoint;
  @Column(name = "\"JD_DROP_POINT\"", nullable = true)
  private String jdDropPoint;
  @Column(name = "\"JD_REMARKS\"", nullable = true)
  private String jdRemarks;
  @Column(name = "\"JD_CUSTOMER_COMMENTS\"", nullable = true)
  private String jdCustomerComments;
  @Column(name = "\"JD_VEHICLE_ID\"", nullable = true)
  private String jdVehicleId;
  @Column(name = "\"JD_DRIVER_ID\"", nullable = true)
  private String jdDriverId;
  @Column(name = "\"JD_DRIVER_RATING\"", nullable = false)
  private Integer jdDriverRating;
  @Column(name = "\"JD_CUST_RATING\"", nullable = false)
  private Float jdCustRating;
  @Column(name = "\"JD_STATUS\"", nullable = false)
  private String jdStatus;
  @Column(name = "\"JD_START_READING\"", nullable = false)
  private Integer jdStartReading;
  @Column(name = "\"JD_END_READING\"", nullable = false)
  private Integer jdEndReading;
  @Column(name = "\"JD_CHECKIN_OTP\"", nullable = false)
  private Integer jdCheckinOtp;
  @Column(name = "\"JD_CHECKOUT_OTP\"", nullable = false)
  private Integer jdCheckoutOtp;
  @Column(name = "\"JD_KMS\"", nullable = false)
  private java.math.BigDecimal jdKms;
  @Column(name = "\"JD_EMPTY_KMS\"", nullable = false)
  private Float jdEmptyKms;
  @Column(name = "\"JD_TOLL_CHARGES\"", nullable = false)
  private Float jdTollCharges;
  @Column(name = "\"JD_SHOW_RVT\"", nullable = false)
  private boolean jdShowRvt;
  @Column(name = "\"JD_RVT_PRIORITY\"", nullable = false)
  private Integer jdRvtPriority;
  @Column(name = "\"JD_RVT_REMARKS\"", nullable = true)
  private String jdRvtRemarks;
  @Column(name = "\"JD_PAID_DRIVER\"", nullable = false)
  private boolean jdPaidDriver;
  @Column(name = "\"JD_PAID_OFFICE\"", nullable = false)
  private boolean jdPaidOffice;
  @Column(name = "\"JD_RESELLER_PAYMENT_RECD\"", nullable = false)
  private boolean jdResellerPaymentRecd;
  @Column(name = "\"JD_PAYMENT_REMARKS\"", nullable = true)
  private String jdPaymentRemarks;
  @Column(name = "\"JD_PKG_FROM_CITY\"", nullable = true)
  private String jdPkgFromCity;
  @Column(name = "\"JD_PKG_KMS_LIMIT\"", nullable = false)
  private Float jdPkgKmsLimit;
  @Column(name = "\"JD_PKG_HRS_LIMIT\"", nullable = false)
  private Float jdPkgHrsLimit;
  @Column(name = "\"JD_PKG_PRICE\"", nullable = false)
  private Float jdPkgPrice;
  @Column(name = "\"JD_PKG_ADDL_KMS_RATE\"", nullable = false)
  private Float jdPkgAddlKmsRate;
  @Column(name = "\"JD_PKG_ADDL_HRS_RATE\"", nullable = false)
  private Float jdPkgAddlHrsRate;
  @Column(name = "\"JD_PKG_HRS\"", nullable = false)
  private Float jdPkgHrs;
  @Column(name = "\"JD_PKG_ADDL_HRS\"", nullable = false)
  private Float jdPkgAddlHrs;
  @Column(name = "\"JD_PKG_ADDL_KMS\"", nullable = false)
  private Float jdPkgAddlKms;
  @Column(name = "\"JD_CUST_GST\"", nullable = false)
  private Float jdCustGst;
  @Column(name = "\"JD_DT_GST\"", nullable = false)
  private Float jdDtGst;
  @Column(name = "\"JD_PAYMENT_STATUS\"", nullable = false)
  private String jdPaymentStatus;
  @Column(name = "\"JD_WAITING_CHARGES\"", nullable = true)
  private Integer jdWaitingCharges;
  @Column(name = "\"JD_INTER_STATE_PERMIT\"", nullable = true)
  private Integer jdInterStatePermit;
  @Column(name = "\"JD_TOLLGATE_CHARGES\"", nullable = true)
  private Integer jdTollgateCharges;
  @Column(name = "\"JD_DRIVER_BETTA\"", nullable = true)
  private Integer jdDriverBetta;
  @Column(name = "\"JD_SERVICE_CHARGES\"", nullable = true)
  private Integer jdServiceCharges;
  @Column(name = "\"JD_CONFIRMED\"", nullable = false)
  private boolean jdConfirmed;
  @Column(name = "\"JD_BOOKING_ADVANCE\"", nullable = true)
  private Integer jdBookingAdvance;
  @Column(name = "\"JD_ADD_EXTRA\"", nullable = false)
  private Integer jdAddExtra;
  @Column(name = "\"JD_DISCOUNT_CODE\"", nullable = true)
  private String jdDiscountCode;
  @Column(name = "\"JD_REDEEM_AMOUNT\"", nullable = false)
  private Float jdRedeemAmount;
  @Column(name = "\"JD_TYPE_OF_BOOKING\"", nullable = false)
  private String jdTypeOfBooking;
  @Column(name = "\"JD_JOURNEY_TYPE\"", nullable = false)
  private String jdJourneyType;
  @Column(name = "\"JD_TAXI_TYPE\"", nullable = false)
  private String jdTaxiType;
  @Column(name = "\"JD_ASSIGNEDBY\"", nullable = true)
  private String jdAssignedby;
  @Column(name = "\"JD_ASSIGNED_DATETIME\"", nullable = true)
  private Timestamp jdAssignedDatetime;
  @Column(name = "\"JD_FOLLOWED_BY\"", nullable = true)
  private String jdFollowedBy;
  @Column(name = "\"JD_FOLLOWED_DATETIME\"", nullable = true)
  private Timestamp jdFollowedDatetime;
  @Column(name = "\"JD_CANCEL_REASON\"", nullable = true)
  private String jdCancelReason;
  @Column(name = "\"JD_CANCEL_DATETIME\"", nullable = true)
  private Timestamp jdCancelDatetime;
  @Column(name = "\"JD_CANCELLED_BY\"", nullable = true)
  private String jdCancelledBy;
  @Column(name = "\"JD_HOW_KNOW\"", nullable = true)
  private String jdHowKnow;
  @Column(name = "\"JD_PURPOSE\"", nullable = true)
  private String jdPurpose;
  @Column(name = "\"JD_SEND_BILL\"", nullable = false)
  private boolean jdSendBill;
  @Column(name = "\"JD_TRANS_ADMIN_USER\"", nullable = true)
  private String jdTransAdminUser;
  @Column(name = "\"JD_ISRETURN\"", nullable = false)
  private Byte jdIsreturn;
  @Column(name = "\"JD_FOR_JID\"", nullable = true)
  private String jdForJid;
  @Column(name = "\"JD_ISARCHIVE\"", nullable = false)
  private boolean jdIsarchive;
  @Column(name = "\"JD_TSTAMP\"", nullable = false)
  private Timestamp jdTstamp;
  @Column(name = "\"JD_CONFIRMED_DATETIME\"", nullable = true)
  private Timestamp jdConfirmedDatetime;
  @Column(name = "\"JD_CONFIRMEDBY\"", nullable = true)
  private String jdConfirmedby;
}