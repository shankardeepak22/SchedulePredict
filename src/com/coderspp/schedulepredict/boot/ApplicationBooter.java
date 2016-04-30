/**
 * 
 */
package com.coderspp.schedulepredict.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Deepak Ravi Shankar
 * 
 */
public class ApplicationBooter implements WebApplicationInitializer {

	String[] contexts = new String[] { "classpath:Contexts/applicationContext.xml",
			"classpath:Contexts/root-context.xml" };

	@Override
	public void onStartup(ServletContext container) {

		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		System.out.println("Loading contexts...");
		appContext.setConfigLocations(contexts);
		System.out.println("Contexts loaded");
		ServletRegistration.Dynamic registration = container.addServlet("schedulePredictDispatcher",
				new DispatcherServlet(appContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

	}
}
