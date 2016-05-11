/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderspp.schedulepredict.model.Weather;
import com.coderspp.schedulepredict.service.WeatherService;
import com.coderspp.schedulepredict.service.impl.WeatherServiceImpl;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author pragatiunde1990
 *
 */
@Controller
@RequestMapping(value = "/weather", method = RequestMethod.GET)
public class WeatherController {

	@Autowired
	private WeatherService weatherService = new WeatherServiceImpl();

	@RequestMapping(value = "/get/", method = RequestMethod.GET)
	@ApiOperation(value = "get weather info for given lat and longitude")
	public ResponseEntity<List<Weather>> getWeather(
			@ApiParam(value = "lat", required = true) @RequestParam(value = "lat", required = true) final String lat,
			@ApiParam(value = "lon", required = true) @RequestParam(value = "lon", required = true) final String lon) {

		List<Weather> weathers = new ArrayList<>();
		System.out.println("Inside weather controller");
		weathers = weatherService.getWeather(Double.parseDouble(lat), Double.parseDouble(lon));
		ResponseEntity<List<Weather>> response = new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/sample/", method = RequestMethod.GET)
	private ResponseEntity<JSONObject> getSample() {

		String url = "http://api.openweathermap.org/data/2.5/forecast?lat=-6.081689&lon=145.391881&appid=ba3db35b7e9f702af52b2a0bc95558d5";
		String apiKey = "&appid=ba3db35b7e9f702af52b2a0bc95558d5";
		ResponseEntity<JSONObject> response = null;
		URL weatherURL;
		InputStream stream;
		JSONObject json = new JSONObject();
		String jsonStream = new String();
		Scanner scanner;
		Object object;
		JSONParser parser = new JSONParser();
		JSONArray jsonArray;
		List<Weather> wearherList = new ArrayList<>();

		try {
			weatherURL = new URL(url);
			stream = weatherURL.openStream();
			scanner = new Scanner(stream);
			while (scanner.hasNext()) {
				jsonStream = jsonStream + scanner.nextLine();

			}
			System.out.println("-------------");
			System.out.println();
			System.out.println(jsonStream);
			System.out.println();
			System.out.println("-------------");
			// String s="{\"thisis\": \"pragati\"}";
			object = parser.parse(jsonStream);
			JSONObject jo = (JSONObject) object;
			response = new ResponseEntity<JSONObject>(jo, HttpStatus.OK);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/all/", method = RequestMethod.GET)
	public ResponseEntity<List<ArrayList<Weather>>> getAll() {
		List<ArrayList<Weather>> weatherList = weatherService.getAll();
		ResponseEntity<List<ArrayList<Weather>>> response = new ResponseEntity<List<ArrayList<Weather>>>(weatherList,
				HttpStatus.OK);
		return response;
		
	}

}
