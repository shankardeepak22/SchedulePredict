package com.coderspp.schedulepredict.app.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Demo {

	private static final String airportDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat";
	private static final String airlineDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/airlines.dat";
	private static final String routesDataURL = "https://raw.githubusercontent.com/jpatokal/openflights/master/data/routes.dat";

	// private static final String scheduleDataURL = "";
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) {
		String[] tokens = null;
		Scanner scanner = null;

		try {
			URL url = new URL(airportDataURL);
			InputStream inputStream = url.openStream();
			scanner = new Scanner(inputStream);
			while (scanner.hasNext()) {
				tokens = scanner.nextLine().split(",");
				/*
				 * for (String string : tokens) { System.out.println(string); }
				 */

				System.out.println(scanner.nextLine());

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
