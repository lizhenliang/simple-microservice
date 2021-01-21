/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * 首页控制层
 *
 * @author zibin
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String getFreeMarkerIndex(HttpServletRequest request) {

		return "index";
	}

}
