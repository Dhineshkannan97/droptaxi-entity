package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;


/**
 * The persistent class for the isp_master database table.
 * 
 */
@Data
@Entity(name = "com.droptaxi.entity.IspMaster")
@Table(name="isp_master")
public class IspMaster  {
	 

	@Id
	private int id;

	@Column(name="FROM_STATE")
	private String fromState;

	@Column(name="ISP_SEDAN_RATE")
	private float ispSedanRate;

	@Column(name="ISP_SUV_RATE")
	private float ispSuvRate;

	@Column(name="TO_STATE")
	private String toState;

 
 
 
	public float getIspSedanRate() {
		return this.ispSedanRate;
	}

	 
	public float getIspSuvRate() {
		return this.ispSuvRate;
	}


	public int getId() {
		return id;
	}


	public String getFromState() {
		return fromState;
	}


	public String getToState() {
		return toState;
	}


	public void setFromState(String fromState) {
		this.fromState = fromState;
	}


	public void setIspSedanRate(float ispSedanRate) {
		this.ispSedanRate = ispSedanRate;
	}


	public void setIspSuvRate(float ispSuvRate) {
		this.ispSuvRate = ispSuvRate;
	}


	public void setToState(String toState) {
		this.toState = toState;
	}

 
 
	 
 

 

}