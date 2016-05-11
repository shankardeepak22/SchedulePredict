/**
 * 
 */
package com.coderspp.schedulepredict.service;

import com.coderspp.schedulepredict.model.Flight;

/**
 * @author Deepak
 *
 */
public interface FlightService {
	
	Flight addNewFlight(Flight flight);
	Flight getFlightByIdentifier(String identifier);

}
