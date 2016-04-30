/**
 * 
 */
package com.coderspp.schedulepredict.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.knappsack.swagger4springweb.controller.ApiDocumentationController;

/**
 * @author Deepak
 *
 */
@Controller
@RequestMapping(value = "/documentation")
public class DocumentationController extends ApiDocumentationController {

	public DocumentationController() {
		setBaseControllerPackage("com.coderspp.schedulepredict");
		setBaseModelPackage("com.coderspp.schedulepredict.model");
		setApiVersion("v1");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String documentation() {
		return "swagger";
	}

}
