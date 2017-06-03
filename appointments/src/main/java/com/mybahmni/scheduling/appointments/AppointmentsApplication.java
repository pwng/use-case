package com.mybahmni.scheduling.appointments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mybahmni.scheduling.appointments.model.Appointment;
import com.mybahmni.scheduling.appointments.repo.AppointmentRepository;

@SpringBootApplication
public class AppointmentsApplication implements CommandLineRunner {

	@Autowired
	private AppointmentRepository appointmentRepo ;
	
	public static void main(String[] args) {
		SpringApplication.run(AppointmentsApplication.class, args);
	}
	@Override
	public void run(String... args) {
		appointmentRepo.save(new Appointment("2017-08-08",1L)) ;
		appointmentRepo.save(new Appointment("2017-08-08",2L)) ;
	}
}
