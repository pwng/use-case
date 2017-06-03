package com.mybahmni.scheduling.appointments.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybahmni.scheduling.appointments.model.Appointment;

@RestController
@RequestMapping("/")
public class AppointmentController {
    @RequestMapping(value="/appointments",method=RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam("slot") Optional<String> timeSlot) {
    	    if(timeSlot.isPresent()) {
    	    		System.err.println(timeSlot.get());
    	    } else {
	    		System.err.println("no timeslot");
    	    }
        return new ArrayList<Appointment>() ;
    }
}
