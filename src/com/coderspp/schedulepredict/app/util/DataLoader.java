/**
 * 
 */
package com.coderspp.schedulepredict.app.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderspp.schedulepredict.model.Airport;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author Deepak
 *
 */

@Controller
@RequestMapping(value = "/sync")
public class DataLoader {

	@Autowired
	private DataLoaderService dataLoaderService = new DataLoaderServiceImpl();

	@RequestMapping(value = "/airports", method = RequestMethod.POST)
	@ApiOperation(value = "Add new Airports to the airports repository", notes = "Create records into the AIRPORT table")
	public ResponseEntity<List<Airport>> syncAirports() {

		ResponseEntity<List<Airport>> responseEntity = new ResponseEntity<List<Airport>>(
				dataLoaderService.syncAirportData(), HttpStatus.CREATED);
		return responseEntity;
	}

}
