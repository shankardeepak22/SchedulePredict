/**
 * 
 */
package com.coderspp.schedulepredict.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Deepak Ravi Shankar
 *
 */
public class Prediction {

	private Date date;
	private String prediction;
	private String dateRep;
	private int pid;

	public Prediction(Date date, String prediction,int pid) {
		this.pid = pid;
		
		String dateFormat = "MM-dd-yyyy";
		this.prediction = prediction;
		this.date = date;
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		this.dateRep = sdf.format(this.date);
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
	 * @return the prediction
	 */
	public String getPrediction() {
		return prediction;
	}

	/**
	 * @param prediction
	 *            the prediction to set
	 */
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}

	/**
	 * @return the dateRep
	 */
	public String getDateRep() {
		return dateRep;
	}

	/**
	 * @param dateRep
	 *            the dateRep to set
	 */
	public void setDateRep(String dateRep) {
		this.dateRep = dateRep;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

}
