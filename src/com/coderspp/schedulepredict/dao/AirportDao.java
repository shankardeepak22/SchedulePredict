/**
 * 
 */
package com.coderspp.schedulepredict.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderspp.schedulepredict.model.Airport;

/**
 * @author Deepak
 *
 */
@Repository
public interface AirportDao extends JpaRepository<Airport, UUID> {

}
