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
import org.springframework.web.bind.annotation.RequestParam;

import com.coderspp.schedulepredict.dao.AirportDao;
import com.coderspp.schedulepredict.model.Airport;
import com.coderspp.schedulepredict.service.AirportService;
import com.coderspp.schedulepredict.service.impl.AirportServiceImpl;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Controller
@RequestMapping(value = "/airports")
public class AirportController {

	@Autowired
	AirportDao airportDao;

	@Autowired
	AirportService airportService = new AirportServiceImpl();

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<List<Airport>> getAllAirports() {
		List<Airport> airports = airportDao.findAll();
		ResponseEntity<List<Airport>> response = new ResponseEntity<List<Airport>>(airports, HttpStatus.OK);
		return response;

	}

	@RequestMapping(value = "/get/iato", method = RequestMethod.GET)
	public ResponseEntity<Airport> getAirportByIATO(
			@RequestParam(value = "iato", required = true) @ApiParam(value = "iato", required = true) final String iato) {
		Airport airport = airportService.getAirportByIATO(iato);
		ResponseEntity<Airport> response = new ResponseEntity<Airport>(airport, HttpStatus.OK);
		return response;
	}

}
