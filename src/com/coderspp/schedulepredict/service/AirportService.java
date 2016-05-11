/**
 * 
 */
package com.coderspp.schedulepredict.service;

import com.coderspp.schedulepredict.model.Airport;

/**
 * @author Deepak
 *
 */
public interface AirportService {

	Airport getAirportByIATO(String iato);

}
