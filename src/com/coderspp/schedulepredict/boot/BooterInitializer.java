/**
 * 
 */
package com.coderspp.schedulepredict.boot;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.coderspp.schedulepredict.security.SecurityConfig;

/**
 * @author Deepak Ravi Shankar
 * 
 */
public class BooterInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { DispatcherServlet.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
