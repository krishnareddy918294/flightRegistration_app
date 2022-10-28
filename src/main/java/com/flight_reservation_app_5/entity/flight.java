package com.flight_reservation_app_5.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class flight extends AbstractEntity{
	private String flightnumber;
	private String operatingairlineS;
	private String 	departurecity;
	private String arrivalcity;
	private Date dateOfDeparture;//java.util
	private Timestamp estimateDepartureTime;//java.sql
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOperatingairlineS() {
		return operatingairlineS;
	}
	public void setOperatingairlineS(String operatingairlineS) {
		this.operatingairlineS = operatingairlineS;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimateDepartureTime() {
		return estimateDepartureTime;
	}
	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.estimateDepartureTime = estimateDepartureTime;
	}
	
}