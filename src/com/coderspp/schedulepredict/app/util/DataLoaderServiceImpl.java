package com.coderspp.schedulepredict.app.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderspp.schedulepredict.dao.AirportDao;
import com.coderspp.schedulepredict.model.Airport;

@Service
public class DataLoaderServiceImpl implements DataLoaderService {

	private static final String airportDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat";
	private static final String airlineDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/airlines.dat";
	private static final String routesDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/routes.dat";
	private static final Logger logger = Logger.getLogger(DataLoaderServiceImpl.class);

	@Autowired
	AirportDao airportDao;
	// private static final String scheduleDataURL = "";

	@Transactional(rollbackFor = IOException.class)
	public List<Airport> syncAirportData() {
		logger.debug("Now syncing the Airport data with " + airlineDataURL + "...");

		List<Airport> newAirports = new ArrayList<>();
		List<Airport> oldAirports = airportDao.findAll();
		URL url;
		InputStream inputStream = null;
		Scanner scanner = null;
		String[] tokens = null;
		try {
			url = new URL(airportDataURL);
			inputStream = url.openStream();
			scanner = new Scanner(inputStream);
			while (scanner.hasNext()) {

				tokens = scanner.nextLine().split(",");
				Airport airport = new Airport();
				airport.setOfid(Integer.valueOf(tokens[0]));
				airport.setName(tokens[1].replace("\"", ""));
				if (tokens.length > 12) {
					tokens[2] = tokens[2] + tokens[3];
					airport.setCity(tokens[2].replace("\"", ""));
					airport.setCountry(tokens[4].replace("\"", ""));
					airport.setIata(tokens[5].replace("\"", ""));
					airport.setIcao(tokens[6].replace("\"", ""));
					airport.setLatitude(Double.valueOf(tokens[7]));
					airport.setLongitude(Double.valueOf(tokens[8]));
					airport.setAltitude(Float.valueOf(tokens[9]));
					airport.setTimeZone(Float.valueOf(tokens[10]));
					airport.setDst(tokens[11].replace("\"", ""));
					airport.setTimeZoneTZ(tokens[12].replace("\"", ""));
				} else {
					airport.setCity(tokens[2].replace("\"", ""));
					airport.setCountry(tokens[3].replace("\"", ""));
					airport.setIata(tokens[4].replace("\"", ""));
					airport.setIcao(tokens[5].replace("\"", ""));
					airport.setLatitude(Double.valueOf(tokens[6]));
					airport.setLongitude(Double.valueOf(tokens[7]));
					airport.setAltitude(Float.valueOf(tokens[8]));
					airport.setTimeZone(Float.valueOf(tokens[9]));
					airport.setDst(tokens[10].replace("\"", ""));
					airport.setTimeZoneTZ(tokens[11].replace("\"", ""));
				}

				if (!oldAirports.contains(airport)) {
					newAirports.add(airport);
					airportDao.saveAndFlush(airport);
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

		return newAirports;

	}

	public void syncAirlineData() {

	}

	public void syncRoutesData() {

	}

}
