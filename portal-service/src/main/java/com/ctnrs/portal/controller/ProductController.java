/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 商品控制层
 *
 * @author zibin
 */
@Controller
@AllArgsConstructor
@Slf4j
public class ProductController {

	@RequestMapping("/queryProductListPage")
	public String queryuserListPage(ModelMap model) {
		log.info("----------------请求访问查询商品列表页面--------------->");
		return "productList";
	}

}
