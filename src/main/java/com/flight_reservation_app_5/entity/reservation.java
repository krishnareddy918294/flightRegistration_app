package com.flight_reservation_app_5.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class reservation  extends AbstractEntity{
	private  boolean checkedin;
	private int numberofbags;
	
	@OneToOne
	private passenger passengerid;
	
	@OneToOne
	private flight flightid;
	public boolean isCheckedin() {
		return checkedin;
	}
	public void setCheckedin(boolean checkedin) {
		this.checkedin = checkedin;
	}
	public int getNumberofbags() {
		return numberofbags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberofbags = numberofbags;
	}
	public passenger getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(passenger passengerid) {
		this.passengerid = passengerid;
	}
	public flight getFlightid() {
		return flightid;
	}
	public void setFlightid(flight flightid) {
		this.flightid = flightid;
	}
	
}
	
