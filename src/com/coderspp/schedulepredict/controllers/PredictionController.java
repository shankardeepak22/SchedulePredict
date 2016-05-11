/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coderspp.schedulepredict.model.Airport;
import com.coderspp.schedulepredict.model.Flight;
import com.coderspp.schedulepredict.model.Prediction;
import com.coderspp.schedulepredict.model.Weather;
import com.coderspp.schedulepredict.service.AirportService;
import com.coderspp.schedulepredict.service.FlightService;
import com.coderspp.schedulepredict.service.WeatherService;
import com.coderspp.schedulepredict.service.impl.AirportServiceImpl;
import com.coderspp.schedulepredict.service.impl.FlightServiceImpl;
import com.coderspp.schedulepredict.service.impl.WeatherServiceImpl;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author Deepak
 *
 */
@Controller
@RequestMapping(value = "/predict")
public class PredictionController {

	@Autowired
	private AirportService AirportService = new AirportServiceImpl();

	@Autowired
	private FlightService flightService = new FlightServiceImpl();

	@Autowired
	private WeatherService weatherSerice = new WeatherServiceImpl();

	@RequestMapping(method = RequestMethod.GET)
	public String getPrediction(
			@ApiParam(value = "flightNumber", required = true) @RequestParam(value = "flightNumber", required = true) final String flightNumber,
			@ApiParam(value = "date", required = false) @RequestParam(value = "date", required = false) final String date,
			Model model) {

		Flight flight = flightService.getFlightByIdentifier(flightNumber);

		if (flight.getArrivalAirportIATO() == null || flight.getDepartureAirportIATO() == null) {

			model.addAttribute("status", 404);

		} else {
			Airport departureAirport = AirportService.getAirportByIATO(flight.getDepartureAirportIATO());
			Airport arrivalAirport = AirportService.getAirportByIATO(flight.getArrivalAirportIATO());

			List<Weather> weatherList = weatherSerice.getWeather(departureAirport.getLatitude(),
					departureAirport.getLongitude());
			String prediction = "No Prediction";
			model.addAttribute("flightNumber", flightNumber);
			model.addAttribute("departureFrom", flight.getDepartureAirportIATO());
			model.addAttribute("arrival", flight.getArrivalAirportIATO());

			List<Prediction> predictions = new ArrayList<>();
			int pid = 0;
			for (Weather weather : weatherList) {

				int wid = weather.getWeather_id();
				System.out.println("Weather: " + weather.getWeather_description());
				if (wid == 803 || wid == 800 || wid == 801 || wid == 802) {
					prediction = "No delay Expected";
					pid = 0;
				}
				if (wid == 502) {
					prediction = "Delay expected due to " + weather.getWeather_description();
					pid = 1;
				}
				if (wid == 500 || wid == 600 || wid == 804 || wid == 501) {
					prediction = "Turbulence Expected due to " + weather.getWeather_description()
							+ ". No delay expected";
					pid = 2;
				}
				if (wid == 601) {
					prediction = "Delay expected due to " + weather.getWeather_description();
					pid = 1;
				}
				Prediction predict = new Prediction(weather.getDate(), prediction, pid);
				predictions.add(predict);
			}

			model.addAttribute("predictions", predictions);
		}
		return "prediction";
	}

}
