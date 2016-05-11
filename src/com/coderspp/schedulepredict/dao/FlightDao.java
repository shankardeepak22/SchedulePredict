package com.coderspp.schedulepredict.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coderspp.schedulepredict.model.Flight;
import com.coderspp.schedulepredict.util.Uuid;

@Repository
public interface FlightDao extends JpaRepository<Flight, Uuid> {

	@Query(value = "SELECT * FROM FLIGHT WHERE INDETIFIED_BY = ?1", nativeQuery = true)
	List<Flight> getFlightByIdentifier(String identifiedBy);

}
