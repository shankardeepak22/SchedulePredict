/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderspp.schedulepredict.model.Flight;
import com.coderspp.schedulepredict.service.FlightService;
import com.coderspp.schedulepredict.service.impl.FlightServiceImpl;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Controller
@RequestMapping(value = "/flight")
public class FlightController {
	@Autowired
	private FlightService flightService = new FlightServiceImpl();

	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	@ApiOperation(value = "Add a new flight to the flight database", httpMethod = "POST", response = Flight.class)
	public ResponseEntity<Flight> addNewFlight(@RequestBody final Flight flight) {

		Flight newFlight = null;
		newFlight = flightService.addNewFlight(flight);
		ResponseEntity<Flight> response = new ResponseEntity<Flight>(newFlight, HttpStatus.CREATED);
		return response;
	}

	@RequestMapping(value = "/get/", method = RequestMethod.GET)
	@ApiParam(value = "get the flight info for a required flight")
	public ResponseEntity<Flight> getFlightByIdentifier(
			@ApiParam(value = "flightNumber", required = true) @RequestParam(value = "flightNumber", required = true) final String identifier) {
		Flight flight = flightService.getFlightByIdentifier(identifier);
		ResponseEntity<Flight> response = new ResponseEntity<Flight>(flight, HttpStatus.OK);
		return response;
	}

}
