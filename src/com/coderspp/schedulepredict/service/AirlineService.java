/**
 * 
 */
package com.coderspp.schedulepredict.service;

import java.util.List;

import com.coderspp.schedulepredict.model.Airline;

/**
 * @author Deepak
 *
 */
public interface AirlineService {

	public List<Airline> addAirlines();

	public List<Airline> getAll();

}
