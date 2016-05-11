/**
 * 
 */
package com.coderspp.schedulepredict.service;

import java.util.ArrayList;
import java.util.List;

import com.coderspp.schedulepredict.model.Weather;

/**
 * @author pragatiunde1990
 *
 */
public interface WeatherService {
	public List<Weather> getWeather(double lat, double lng);

	public List<ArrayList<Weather>> getAll();

}