package com.flight_reservation_app_5.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_5.Repository.flightRepository;
import com.flight_reservation_app_5.entity.flight;

@Controller
public class flightController {
	@Autowired
	private flightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("departureDate") @DateTimeFormat(pattern="MM/dd/yyyy") Date departureDate,ModelMap model) {
		List<flight> findflights= flightRepo.findFlights(from,to,departureDate);
model.addAttribute("findflights",  findflights);
		return "displayFlights";
		
	}
}

