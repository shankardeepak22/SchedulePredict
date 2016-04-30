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

import com.coderspp.schedulepredict.dao.AirportDao;
import com.coderspp.schedulepredict.model.Airport;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Controller
@RequestMapping(value = "/airports")
public class AirportController {

	@Autowired
	AirportDao airportDao;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<List<Airport>> getAllAirports() {
		List<Airport> airports = airportDao.findAll();
		ResponseEntity<List<Airport>> response = new ResponseEntity<List<Airport>>(airports, HttpStatus.OK);
		return response;

	}

}
