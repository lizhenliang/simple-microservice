/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 库存控制层
 *
 * @author zibin
 */
@Controller
@Slf4j
public class OrderController {
	@RequestMapping("/queryOrderListPage")
	public String queryuserListPage(ModelMap model) {
		log.info("----------------请求访问查询订单列表页面--------------->");
		return "orderList";
	}
}
