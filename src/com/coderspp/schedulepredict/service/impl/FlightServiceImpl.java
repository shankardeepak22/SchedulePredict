/**
 * 
 */
package com.coderspp.schedulepredict.service.impl;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderspp.schedulepredict.dao.FlightDao;
import com.coderspp.schedulepredict.model.Flight;
import com.coderspp.schedulepredict.service.FlightService;

/**
 * @author Deepak
 *
 */
@Service
public class FlightServiceImpl implements FlightService {
	private String googleQuery = "http://www.google.com/search?q=";
	Document googleResponse;
	private String resetString = "http://www.google.com/search?q=";

	@Autowired
	private FlightDao flightDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.coderspp.schedulepredict.service.FlightService#addNewFlight(com.
	 * coderspp.schedulepredict.model.Flight)
	 */
	@Override
	public Flight addNewFlight(Flight flight) {

		return flightDao.saveAndFlush(flight);
	}

	@Override
	public Flight getFlightByIdentifier(String identifier) {
		List<Flight> flights = flightDao.getFlightByIdentifier(identifier);
		Flight flight = null;
		if (flights == null || flights.size() == 0) {
			this.googleQuery += identifier;
			flight = new Flight();
			Element div;
			String route[], departure, arrival;

			try {
				this.googleResponse = Jsoup.connect(this.googleQuery)
						.userAgent(
								"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36")
						.referrer("http://www.google.com").get();

				Elements eles = googleResponse.getElementsByClass("vk_sh");
				div = eles.first();
				System.out.println(div);
				if (div == null) {
					flight.setArrivalAirportIATO(null);
					flight.setDepartureAirportIATO(null);
					return flight;
				}
				route = div.attr("data-route").split("-");
				departure = route[0];
				arrival = route[1];
				flight.setIdentifiedBy(identifier);
				flight.setArrivalAirportIATO(arrival);
				flight.setDepartureAirportIATO(departure);

				flight = flightDao.saveAndFlush(flight);
				return flight;

			} catch (IOException e) {

				e.printStackTrace();
			} finally {
				googleQuery = resetString;
			}
		} else {
			flight = flights.get(0);
		}
		return flight;
	}

}
