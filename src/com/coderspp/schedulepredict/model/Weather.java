/**
 * 
 */
package com.coderspp.schedulepredict.model;

import java.util.Date;

/**
 * @author pragatiunde1990
 *
 */
public class Weather {

	

	private Double latitude;
	private Double longitude;
	private Date date;
	private Double temp;
	private Double temp_min;
	private Double temp_max;
	private Double pressure;
	private Double sea_level;
	private Double grnd_level;
	private Double humidity;
	private Double temp_kf;
	private Integer weather_id;
	private String weather_main;
	private String weather_description;
	private int cloud_per;
	private Double wind_speed;
	private Double wind_deg;

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the temp
	 */
	public Double getTemp() {
		return temp;
	}

	/**
	 * @param temp
	 *            the temp to set
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	/**
	 * @return the temp_min
	 */
	public Double getTemp_min() {
		return temp_min;
	}

	/**
	 * @param temp_min
	 *            the temp_min to set
	 */
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}

	/**
	 * @return the temp_max
	 */
	public Double getTemp_max() {
		return temp_max;
	}

	/**
	 * @param temp_max
	 *            the temp_max to set
	 */
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}

	/**
	 * @return the pressure
	 */
	public Double getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the sea_level
	 */
	public Double getSea_level() {
		return sea_level;
	}

	/**
	 * @param sea_level
	 *            the sea_level to set
	 */
	public void setSea_level(Double sea_level) {
		this.sea_level = sea_level;
	}

	/**
	 * @return the grnd_level
	 */
	public Double getGrnd_level() {
		return grnd_level;
	}

	/**
	 * @param grnd_level
	 *            the grnd_level to set
	 */
	public void setGrnd_level(Double grnd_level) {
		this.grnd_level = grnd_level;
	}

	/**
	 * @return the humidity
	 */
	public Double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the temp_kf
	 */
	public Double getTemp_kf() {
		return temp_kf;
	}

	/**
	 * @param temp_kf
	 *            the temp_kf to set
	 */
	public void setTemp_kf(Double temp_kf) {
		this.temp_kf = temp_kf;
	}

	/**
	 * @return the weather_id
	 */
	public Integer getWeather_id() {
		return weather_id;
	}

	/**
	 * @param weather_id
	 *            the weather_id to set
	 */
	public void setWeather_id(Integer weather_id) {
		this.weather_id = weather_id;
	}

	/**
	 * @return the weather_main
	 */
	public String getWeather_main() {
		return weather_main;
	}

	/**
	 * @param weather_main
	 *            the weather_main to set
	 */
	public void setWeather_main(String weather_main) {
		this.weather_main = weather_main;
	}

	/**
	 * @return the weather_description
	 */
	public String getWeather_description() {
		return weather_description;
	}

	/**
	 * @param weather_description
	 *            the weather_description to set
	 */
	public void setWeather_description(String weather_description) {
		this.weather_description = weather_description;
	}

	/**
	 * @return the cloud_per
	 */
	public int getCloud_per() {
		return cloud_per;
	}

	/**
	 * @param cloud_per
	 *            the cloud_per to set
	 */
	public void setCloud_per(int cloud_per) {
		this.cloud_per = cloud_per;
	}

	/**
	 * @return the wind_speed
	 */
	public Double getWind_speed() {
		return wind_speed;
	}

	/**
	 * @param wind_speed
	 *            the wind_speed to set
	 */
	public void setWind_speed(Double wind_speed) {
		this.wind_speed = wind_speed;
	}

	/**
	 * @return the wind_deg
	 */
	public Double getWind_deg() {
		return wind_deg;
	}

	/**
	 * @param wind_deg
	 *            the wind_deg to set
	 */
	public void setWind_deg(Double wind_deg) {
		this.wind_deg = wind_deg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weather [latitude=" + latitude + ", longitude=" + longitude + ", date=" + date + ", temp=" + temp
				+ ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", pressure=" + pressure + ", sea_level="
				+ sea_level + ", grnd_level=" + grnd_level + ", humidity=" + humidity + ", temp_kf=" + temp_kf
				+ ", weather_id=" + weather_id + ", weather_main=" + weather_main + ", weather_description="
				+ weather_description + ", cloud_per=" + cloud_per + ", wind_speed=" + wind_speed + ", wind_deg="
				+ wind_deg + "]";
	}
}
