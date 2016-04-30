/**
 * 
 */
package com.coderspp.schedulepredict.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderspp.schedulepredict.dao.AirlineDao;
import com.coderspp.schedulepredict.model.Airline;
import com.coderspp.schedulepredict.service.AirlineService;

/**
 * @author Deepak
 *
 */
@Service
public class AirlineServiceImpl implements AirlineService {

	@Autowired
	private AirlineDao airlineDao;

	private static final String airlineDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/airlines.dat";

	@Transactional(rollbackFor = IOException.class)
	public List<Airline> addAirlines() {

		List<Airline> newAirlines = new ArrayList<>();
		List<Airline> oldAirlines = airlineDao.findAll();
		URL url;
		InputStream inputStream = null;
		Scanner scanner = null;
		String[] tokens = null;

		try {
			url = new URL(airlineDataURL);
			inputStream = url.openStream();
			scanner = new Scanner(inputStream);
			while (scanner.hasNext()) {
				tokens = scanner.nextLine().split(",");
				Airline airline = new Airline();
				airline.setOfid(Integer.parseInt(tokens[0]));
				airline.setName(tokens[1].replace("\"", ""));
				airline.setAlias(tokens[2].replace("\"", ""));
				airline.setIata(tokens[3].replace("\"", ""));
				airline.setIcao(tokens[4].replace("\"", ""));
				airline.setCallSign(tokens[5].replace("\"", ""));
				airline.setCountry(tokens[6].replace("\"", ""));
				airline.setActive(tokens[7].replace("\"", "").charAt(0));
				if (!oldAirlines.contains(airline)) {
					newAirlines.add(airline);
					airlineDao.saveAndFlush(airline);
				}
			}
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		return newAirlines;
	}

	@Override
	public List<Airline> getAll() {
		List<Airline> airlines = airlineDao.findAll();
		return airlines;
	}

}
