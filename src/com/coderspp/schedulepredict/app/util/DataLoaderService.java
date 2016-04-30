package com.coderspp.schedulepredict.app.util;

import java.util.List;

import com.coderspp.schedulepredict.model.Airport;

public interface DataLoaderService {

	public List<Airport> syncAirportData();

	public void syncAirlineData();

	public void syncRoutesData();

}
