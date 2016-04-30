/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderspp.schedulepredict.model.Airline;
import com.coderspp.schedulepredict.service.AirlineService;
import com.coderspp.schedulepredict.service.impl.AirlineServiceImpl;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author Deepak
 *
 */
@Controller
@RequestMapping(value = "/airline")
public class AirlineController {

	@Autowired
	AirlineService airlineService = new AirlineServiceImpl();

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ApiOperation(value = "Controller to add new airlines to the AIRLINE database", notes = "Creates new records in the AIRLINE table.")
	public ResponseEntity<List<Airline>> add() {

		List<Airline> airlines = airlineService.addAirlines();

		ResponseEntity<List<Airline>> response = new ResponseEntity<List<Airline>>(airlines, HttpStatus.CREATED);

		return response;

	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<List<Airline>> get() {
		List<Airline> airlines = airlineService.getAll();
		ResponseEntity<List<Airline>> response = new ResponseEntity<>(airlines, HttpStatus.OK);
		return response;
	}

}
