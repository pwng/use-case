package com.mybahmni.scheduling.appointments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id ;
	
	private String timeSlot ;
	private Long patientID ;
	
	public Appointment(String timeSlot, Long patientID) {
		super();
		this.timeSlot = timeSlot;
		this.patientID = patientID;
	}

	public Appointment() {
		super();
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", timeSlot=" + timeSlot + ", patientID=" + patientID + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Long getPatientID() {
		return patientID;
	}

	public void setPatientID(Long patientID) {
		this.patientID = patientID;
	}
}
