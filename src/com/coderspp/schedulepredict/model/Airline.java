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
@Table(name = "AIRLINE")
public class Airline {

	@Id
	@Column(name = "UUID", nullable = false, unique = true)
	@GenericGenerator(name = "UuidIdentifierGenerator", strategy = "com.coderspp.schedulepredict.util.UuidIdentifierGenerator", parameters = {})
	@GeneratedValue(generator = "UuidIdentifierGenerator")
	@Type(type = "com.coderspp.schedulepredict.util.UuidUserType")
	private Uuid uuid;

	@Column(name = "OFID", nullable = false, unique = true)
	private int ofid;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ALIAS")
	private String alias;

	@Column(name = "IATA")
	private String iata;

	@Column(name = "ICAO")
	private String icao;

	@Column(name = "CALLSIGN")
	private String callSign;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "ACTIVE")
	private char active;

	/**
	 * @return the uuid
	 */
	public Uuid getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(Uuid uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the ofid
	 */
	public int getOfid() {
		return ofid;
	}

	/**
	 * @param ofid
	 *            the ofid to set
	 */
	public void setOfid(int ofid) {
		this.ofid = ofid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias
	 *            the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the iata
	 */
	public String getIata() {
		return iata;
	}

	/**
	 * @param iata
	 *            the iata to set
	 */
	public void setIata(String iata) {
		this.iata = iata;
	}

	/**
	 * @return the icao
	 */
	public String getIcao() {
		return icao;
	}

	/**
	 * @param icao
	 *            the icao to set
	 */
	public void setIcao(String icao) {
		this.icao = icao;
	}

	/**
	 * @return the callSign
	 */
	public String getCallSign() {
		return callSign;
	}

	/**
	 * @param callSign
	 *            the callSign to set
	 */
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the active
	 */
	public char getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(char active) {
		this.active = active;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + active;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((callSign == null) ? 0 : callSign.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((iata == null) ? 0 : iata.hashCode());
		result = prime * result + ((icao == null) ? 0 : icao.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ofid;

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (active != other.active)
			return false;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (callSign == null) {
			if (other.callSign != null)
				return false;
		} else if (!callSign.equals(other.callSign))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (iata == null) {
			if (other.iata != null)
				return false;
		} else if (!iata.equals(other.iata))
			return false;
		if (icao == null) {
			if (other.icao != null)
				return false;
		} else if (!icao.equals(other.icao))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ofid != other.ofid)
			return false;

		return true;
	}

}
