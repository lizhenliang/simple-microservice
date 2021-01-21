/**
 * LegendShop微服务商城系统
 * ©版权所有,并保留所有权利。
 */
package com.ctnrs.order.api.client;


import com.ctnrs.basic.core.util.R;
import com.ctnrs.order.api.constant.OrderServiceNameConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 订单服务远程调用客户端
 *
 * @author zibin
 */
@FeignClient(OrderServiceNameConstant.ORDER_SERVICE)
public interface OrderServiceClient {

	/**
	 * 提交订单的远程调用
	 * @param productId
	 * @param count
	 * @return
	 */
	@PostMapping("order/submitOrder")
	R<String> submitOrder(@RequestParam("productId") Long productId, @RequestParam("count") int count);
}
