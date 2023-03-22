package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity(name = "com.droptaxi.entity.RouteMaster")
@Table(name = "ROUTE_MASTER")
public class RouteMaster {

	@Id
	@Column(name = "\"RM_ROUTE_MASTER_ID\"", nullable = false)
	private String rmRouteMasterId;
	@Column(name = "\"RM_ROUTE_DT\"", nullable = false)
	private boolean rmRouteDt;
	@Column(name = "\"RM_ROUTE_3T\"", nullable = false)
	private boolean rmRoute3t;
	@Column(name = "\"RM_HARD_ROUTE\"", nullable = false)
	private boolean rmHardRoute;
	@Column(name = "\"RM_SHORT_ROUTE\"", nullable = false)
	private boolean rmShortRoute;
	@Column(name = "\"RM_ROUTE_START_CITY\"", nullable = false)
	private String rmRouteStartCity;
	@Column(name = "\"RM_ROUTE_DESTINATION_CITY\"", nullable = false)
	private String rmRouteDestinationCity;
	@Column(name = "\"RM_SEDAN_ISP\"", nullable = false)
	private Float rmSedanIsp;
	@Column(name = "\"RM_SUV_ISP\"", nullable = false)
	private Float rmSuvIsp;
	@Column(name = "\"RM_APPROX_DISTANCE\"", nullable = true)
	private Integer rmApproxDistance;
	@Column(name = "\"RM_APPROX_DURATION\"", nullable = false)
	private double rmApproxDuration;
	@Column(name = "\"RM_COMMISSION\"", nullable = true)
	private Float rmCommission;
	@Column(name = "\"RM_COMMISSION_ROUNDTRIP\"", nullable = true)
	private Integer rmCommissionRoundtrip;
	@Column(name = "\"RM_ISACTIVE\"", nullable = false)
	private boolean rmIsactive;
	@Column(name = "\"RM_TIMESTAMP\"", nullable = true)
	private Timestamp rmTimestamp;

	public void setRmRouteMasterId(String rmRouteMasterId) {
		this.rmRouteMasterId = rmRouteMasterId;
	}

	public void setRmRouteDt(boolean rmRouteDt) {
		this.rmRouteDt = rmRouteDt;
	}

	public void setRmRoute3t(boolean rmRoute3t) {
		this.rmRoute3t = rmRoute3t;
	}

	public void setRmHardRoute(boolean rmHardRoute) {
		this.rmHardRoute = rmHardRoute;
	}

	public void setRmShortRoute(boolean rmShortRoute) {
		this.rmShortRoute = rmShortRoute;
	}

	public void setRmRouteStartCity(String rmRouteStartCity) {
		this.rmRouteStartCity = rmRouteStartCity;
	}

	public void setRmRouteDestinationCity(String rmRouteDestinationCity) {
		this.rmRouteDestinationCity = rmRouteDestinationCity;
	}

	public void setRmSedanIsp(Float rmSedanIsp) {
		this.rmSedanIsp = rmSedanIsp;
	}

	public void setRmSuvIsp(Float rmSuvIsp) {
		this.rmSuvIsp = rmSuvIsp;
	}

	public void setRmApproxDistance(Integer rmApproxDistance) {
		this.rmApproxDistance = rmApproxDistance;
	}

	public void setRmApproxDuration(double duration) {
		this.rmApproxDuration = duration;
	}

	public void setRmCommission(Float rmCommission) {
		this.rmCommission = rmCommission;
	}

	public void setRmCommissionRoundtrip(Integer rmCommissionRoundtrip) {
		this.rmCommissionRoundtrip = rmCommissionRoundtrip;
	}

	public void setRmIsactive(boolean rmIsactive) {
		this.rmIsactive = rmIsactive;
	}

	public void setRmTimestamp(Timestamp rmTimestamp) {
		this.rmTimestamp = rmTimestamp;
	}

	public String getRmRouteMasterId() {
		return rmRouteMasterId;
	}

	public boolean isRmShortRoute() {
		return rmShortRoute;
	}

	public Integer getRmApproxDistance() {
		return rmApproxDistance;
	}

	public boolean isRmRoute3t() {
		return rmRoute3t;
	}

	public Float getRmSedanIsp() {
		return rmSedanIsp;
	}

	public Float getRmSuvIsp() {
		return rmSuvIsp;
	}

	public boolean isRmIsactive() {
		return rmIsactive;
	}

}