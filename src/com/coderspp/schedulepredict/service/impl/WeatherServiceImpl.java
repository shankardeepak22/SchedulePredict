/**
 * 
 */
package com.coderspp.schedulepredict.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderspp.schedulepredict.dao.AirportDao;
import com.coderspp.schedulepredict.model.Airport;
import com.coderspp.schedulepredict.model.Weather;
import com.coderspp.schedulepredict.service.WeatherService;

/**
 * @author pragatiunde1990
 *
 */
@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	AirportDao airportDao;
	private String url = "http://api.openweathermap.org/data/2.5/forecast/daily?";
	private String origURI = "http://api.openweathermap.org/data/2.5/forecast/daily?";
	private String apiKey = "&cnt=10&mode=json&appid=ba3db35b7e9f702af52b2a0bc95558d5";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.coderspp.schedulepredict.service.WeatherService#getWeather()
	 */
	@Override
	public List<Weather> getWeather(double lat, double lng) {
		// String minUri = new String(url);
		url = url + "lat=" + String.valueOf(lat) + "&lon=" + String.valueOf(lng) + apiKey;
		URL weatherURL;
		InputStream stream;
		String jsonStream = new String();
		Scanner scanner;
		JSONObject jobject;
		Weather weather;
		List<Weather> weatherList = new ArrayList<>();

		try {
			System.out.println(url);
			weatherURL = new URL(url);
			stream = weatherURL.openStream();
			scanner = new Scanner(stream);
			weatherList = new ArrayList<Weather>();

			while (scanner.hasNext()) {
				jsonStream = jsonStream + scanner.nextLine();

			}
			jobject = new JSONObject(jsonStream);
			for (int i = 0; i < jobject.length(); i++) {
				weather = new Weather();
				weather.setLatitude(lat);
				weather.setLongitude(lng);
				JSONObject res = jobject.getJSONArray("list").getJSONObject(i);
				weather.setDate(new Date(res.getLong("dt") * 1000));
				weather.setTemp_min(res.getJSONObject("temp").getDouble("min"));
				weather.setTemp_max(res.getJSONObject("temp").getDouble("max"));
				weather.setPressure(res.getDouble("pressure"));
				//weather.setSea_level(res.getDouble("sea_level"));
				//weather.setGrnd_level(res.getJSONObject("main").getDouble("grnd_level"));
				weather.setHumidity(res.getDouble("humidity"));
				weather.setTemp_kf(res.getJSONObject("temp").getDouble("day"));
				//weather.setSea_level(res.getJSONObject("main").getDouble("sea_level"));
				weather.setWeather_id(res.getJSONArray("weather").getJSONObject(0).getInt("id"));
				weather.setWeather_main(res.getJSONArray("weather").getJSONObject(0).getString("main"));
				weather.setWeather_description(res.getJSONArray("weather").getJSONObject(0).getString("description"));
				weather.setCloud_per(res.getInt("clouds"));
				weather.setWind_speed(res.getDouble("speed"));
				weather.setWind_deg(res.getDouble("deg"));
				weatherList.add(i, weather);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			url = origURI;
		}
		return weatherList;

	}

	public static void main(String[] args) {
		WeatherServiceImpl dem = new WeatherServiceImpl();
		dem.getAll();
	}

	@Override
	public List<ArrayList<Weather>> getAll() {

		List<ArrayList<Weather>> weatherList = new ArrayList<>();
		List<Airport> airports = new ArrayList<>();
		airports = airportDao.getAll();

		for (Airport airport : airports) {
			System.out.println();
			ArrayList<Weather> weatherArray = new ArrayList<>();
			weatherArray = (ArrayList<Weather>) getWeather(airport.getLatitude(), airport.getLongitude());
			weatherList.add(weatherArray);
		}
		// TODO Auto-generated method stub
		return weatherList;
	}

} // TODO Auto-generated method stub
