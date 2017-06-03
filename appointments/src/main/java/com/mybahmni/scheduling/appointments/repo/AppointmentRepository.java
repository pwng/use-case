package com.mybahmni.scheduling.appointments.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mybahmni.scheduling.appointments.model.Appointment;

@RepositoryRestResource(collectionResourceRel = "appt", path = "appt")
public interface AppointmentRepository  extends PagingAndSortingRepository<Appointment, Long> {
	List<Appointment> findByTimeSlot(String timeSlot);
}