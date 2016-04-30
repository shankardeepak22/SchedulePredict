package com.coderspp.schedulepredict.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderspp.schedulepredict.model.Airline;

/**
 * 
 * @author Deepak Ravi Shankar
 *
 */
@Repository
public interface AirlineDao extends JpaRepository<Airline, UUID> {

}
