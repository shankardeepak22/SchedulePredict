/**
 * 
 */
package com.coderspp.schedulepredict.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coderspp.schedulepredict.model.Airport;

/**
 * @author Deepak
 *
 */

public interface AirportDao extends JpaRepository<Airport, UUID> {

	@Query(nativeQuery = true, value = "SELECT * FROM AIRPORT")
	List<Airport> getAll();

	@Query(value = "SELECT * FROM AIRPORT WHERE IATA = ?1", nativeQuery = true)
	List<Airport> getByIATO(String iato);

}
