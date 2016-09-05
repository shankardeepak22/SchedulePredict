/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak Ravi Shankar
 *
 */
@Controller
@RequestMapping(value = "/app")
public class AppController {

	private static final Logger logger = Logger.getLogger(AppController.class.getName());

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {

		logger.info("Client is: " + locale);
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}

	@RequestMapping(value = "/swagger", method = RequestMethod.GET)
	@Deprecated
	public ModelAndView swagger() {
		ModelAndView modelAndView = new ModelAndView("swagger");
		return modelAndView;
	}

	@RequestMapping(value = "/maps", method = RequestMethod.GET)
	public ModelAndView getMaps() {

		ModelAndView modelAndView = new ModelAndView("maps");
		return modelAndView;
	}

}
