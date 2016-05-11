/**
 * 
 */
package com.coderspp.schedulepredict.app.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak
 *
 */
@Controller
@RequestMapping(value = "/error")
public class ErrorController {

	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public ModelAndView get404() {

		ModelAndView modelAndView = new ModelAndView("404");
		return modelAndView;
	}

	@RequestMapping(value = "/500", method = RequestMethod.GET)
	public ModelAndView get500() {

		ModelAndView modelAndView = new ModelAndView("500");
		return modelAndView;
	}

	@RequestMapping(value = "/401", method = RequestMethod.GET)
	public ModelAndView get401() {

		ModelAndView modelAndView = new ModelAndView("401");
		return modelAndView;
	}

}
