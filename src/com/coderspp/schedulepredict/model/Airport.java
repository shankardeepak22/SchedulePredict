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
@Table(name = "AIRPORT")
public class Airport {

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

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "IATA")
	private String iata;

	@Column(name = "ICAO")
	private String icao;

	@Column(name = "LATITUDE")
	private double latitude;

	@Column(name = "LONGITUDE")
	private double longitude;

	@Column(name = "ALTITUDE")
	private float altitude;

	@Column(name = "TIMEZONE")
	private float timeZone;

	@Column(name = "DST")
	private String dst;

	@Column(name = "TIMEZONE_TZ")
	private String timeZoneTZ;

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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the altitude
	 */
	public float getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude
	 *            the altitude to set
	 */
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	/**
	 * @return the timeZone
	 */
	public float getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone
	 *            the timeZone to set
	 */
	public void setTimeZone(float timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the dst
	 */
	public String getDst() {
		return dst;
	}

	/**
	 * @param dst
	 *            the dst to set
	 */
	public void setDst(String dst) {
		this.dst = dst;
	}

	/**
	 * @return the timeZoneTZ
	 */
	public String getTimeZoneTZ() {
		return timeZoneTZ;
	}

	/**
	 * @param timeZoneTZ
	 *            the timeZoneTZ to set
	 */
	public void setTimeZoneTZ(String timeZoneTZ) {
		this.timeZoneTZ = timeZoneTZ;
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
		result = prime * result + Float.floatToIntBits(altitude);
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dst == null) ? 0 : dst.hashCode());
		result = prime * result + ((iata == null) ? 0 : iata.hashCode());
		result = prime * result + ((icao == null) ? 0 : icao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ofid;
		result = prime * result + Float.floatToIntBits(timeZone);
		result = prime * result + ((timeZoneTZ == null) ? 0 : timeZoneTZ.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		Airport other = (Airport) obj;
		if (Float.floatToIntBits(altitude) != Float.floatToIntBits(other.altitude))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dst == null) {
			if (other.dst != null)
				return false;
		} else if (!dst.equals(other.dst))
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
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ofid != other.ofid)
			return false;
		if (Float.floatToIntBits(timeZone) != Float.floatToIntBits(other.timeZone))
			return false;
		if (timeZoneTZ == null) {
			if (other.timeZoneTZ != null)
				return false;
		} else if (!timeZoneTZ.equals(other.timeZoneTZ))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}
