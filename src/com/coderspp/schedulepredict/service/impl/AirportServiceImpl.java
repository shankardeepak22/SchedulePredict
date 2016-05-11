/**
 * 
 */
package com.coderspp.schedulepredict.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderspp.schedulepredict.dao.AirportDao;
import com.coderspp.schedulepredict.model.Airport;
import com.coderspp.schedulepredict.service.AirportService;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportDao airportDao;

	@Override
	public Airport getAirportByIATO(String iato) {
		List<Airport> airports = new ArrayList<>();
		airports = airportDao.getByIATO(iato);
		return airports.get(0);
	}

}
