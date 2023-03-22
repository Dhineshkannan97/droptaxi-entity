package com.droptaxi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "com.droptaxi.entity.VEHICLETYPEMASTER")
@Table(name = "VEHICLE_TYPE_MASTER")
public class VehicleTypeMaster {

	@Id
	@Column(name = "\"VTM_VEHICLE_TYPEID\"", nullable = false)
	private String vtmVehicleTypeid;
	@Column(name = "\"VTM_TAXI_TYPE\"", nullable = false)
	private String vtmTaxiType;
	@Column(name = "\"VTM_VEHICLE_TYPE\"", nullable = false)
	private String vtmVehicleType;
	@Column(name = "\"VTM_WEIGHTAGE\"", nullable = true)
	private Integer vtmWeightage;
	@Column(name = "\"VTM_SEATING_CAPACITY\"", nullable = false)
	private Integer vtmSeatingCapacity;
	@Column(name = "\"VTM_COMFORT_SQUEEZE\"", nullable = false)
	private String vtmComfortSqueeze;
	@Column(name = "\"VTM_RATE_PER_KM\"", nullable = true)
	private Float vtmRatePerKm;
	@Column(name = "\"VTM_RT_RATE_PER_KM\"", nullable = true)
	private Float vtmRtRatePerKm;
	@Column(name = "\"VTM_BASE_CHARGE\"", nullable = false)
	private Float vtmBaseCharge;
	@Column(name = "\"VTM_FAC_CHARGE\"", nullable = false)
	private Float vtmFacCharge;
	@Column(name = "\"VTM_RT_BASE_CHARGE\"", nullable = false)
	private Float vtmRtBaseCharge;
	@Column(name = "\"VTM_RT_FAC_CHARGE\"", nullable = false)
	private Float vtmRtFacCharge;
	@Column(name = "\"VTM_WAITINGCHARGE_PER_MIN\"", nullable = false)
	private Float vtmWaitingchargePerMin;
	@Column(name = "\"VTM_AVAILABLE_ROUNDTRIP\"", nullable = false)
	private boolean vtmAvailableRoundtrip;
	@Column(name = "\"VTM_AVAILABLE_DROPTRIP\"", nullable = false)
	private boolean vtmAvailableDroptrip;
	@Column(name = "\"VTM_ISACTIVE\"", nullable = false)
	private boolean vtmIsactive;

	public Float getVtmRatePerKm() {
		return vtmRatePerKm;
	}

	public String getVtmVehicleTypeid() {
		return vtmVehicleTypeid;
	}

	public boolean isVtmIsactive() {
		return vtmIsactive;
	}

	public Float getVtmRtRatePerKm() {
		return vtmRtRatePerKm;
	}

}