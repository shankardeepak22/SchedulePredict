/**
 * 
 */
package com.coderspp.schedulepredict.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import com.coderspp.schedulepredict.util.Uuid;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Component
@Entity
@Table(name = "FLIGHT")
public class Flight {

	@Id
	@Column(name = "UUID", nullable = false, unique = true)
	@GenericGenerator(name = "UuidIdentifierGenerator", strategy = "com.coderspp.schedulepredict.util.UuidIdentifierGenerator", parameters = {})
	@GeneratedValue(generator = "UuidIdentifierGenerator")
	@Type(type = "com.coderspp.schedulepredict.util.UuidUserType")
	private Uuid uuid;

	@Column(name = "INDETIFIED_BY")
	private String identifiedBy;

	@Column(name = "DEPARTURE")
	private String departureAirportIATO;

	@Column(name = "ARRIVAL")
	private String arrivalAirportIATO;

	@Column(name = "AIRCRAFT_TYPE")
	private int aircraftTypeCode;

	@Column(name = "DEPARTURE_TERMINAL")
	private int departureTerminal;

	@Column(name = "ARRIVAL_TERMINAL")
	private int arrivalTerminal;

	/**
	 * @return the identifiedBy
	 */
	public String getIdentifiedBy() {
		return identifiedBy;
	}

	/**
	 * @param identifiedBy
	 *            the identifiedBy to set
	 */
	public void setIdentifiedBy(String identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	/**
	 * @return the departureAirportIATO
	 */
	public String getDepartureAirportIATO() {
		return departureAirportIATO;
	}

	/**
	 * @param departureAirportIATO
	 *            the departureAirportIATO to set
	 */
	public void setDepartureAirportIATO(String departureAirportIATO) {
		this.departureAirportIATO = departureAirportIATO;
	}

	/**
	 * @return the arrivalAirportIATO
	 */
	public String getArrivalAirportIATO() {
		return arrivalAirportIATO;
	}

	/**
	 * @param arrivalAirportIATO
	 *            the arrivalAirportIATO to set
	 */
	public void setArrivalAirportIATO(String arrivalAirportIATO) {
		this.arrivalAirportIATO = arrivalAirportIATO;
	}

	/**
	 * @return the aircraftTypeCode
	 */
	public int getAircraftTypeCode() {
		return aircraftTypeCode;
	}

	/**
	 * @param aircraftTypeCode
	 *            the aircraftTypeCode to set
	 */
	public void setAircraftTypeCode(int aircraftTypeCode) {
		this.aircraftTypeCode = aircraftTypeCode;
	}

	/**
	 * @return the departureTerminal
	 */
	public int getDepartureTerminal() {
		return departureTerminal;
	}

	/**
	 * @param departureTerminal
	 *            the departureTerminal to set
	 */
	public void setDepartureTerminal(int departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	/**
	 * @return the arrivalTerminal
	 */
	public int getArrivalTerminal() {
		return arrivalTerminal;
	}

	/**
	 * @param arrivalTerminal
	 *            the arrivalTerminal to set
	 */
	public void setArrivalTerminal(int arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	/**
	 * @return the uuid
	 */
	public Uuid getUuid() {
		return uuid;
	}

}
