/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import com.ctnrs.order.api.model.Order;
import com.ctnrs.order.mapper.OrderMapper;
import com.ctnrs.product.api.client.ProductServiceClient;
import com.ctnrs.product.api.model.Product;
import com.ctnrs.stock.api.client.StockServiceClient;
import com.ctnrs.stock.api.model.Stock;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 订单的服务控制层
 *
 * @author zibin
 */
@RestController
@AllArgsConstructor
public class OrderController {

	private final StockServiceClient stockServiceClient;

	private final OrderMapper orderMapper;


	/**
	 * 查询所有订单
	 *
	 * @return
	 */
	@GetMapping("/queryAllOrder")
	public R<List<Order>> findByProductId() {
		List<Order> OrderList =orderMapper.queryAllOrder();
		return ResResultManager.setResultSuccess(OrderList);
	}

	/**
	 * 下单方法
	 *
	 * @return
	 */
	@PostMapping("/submitOrder")
	public R submitOrder(HttpServletRequest request,@RequestParam("productId") Long productId, @RequestParam("orderProductName") String orderProductName,@RequestParam("orderPrice") Double orderPrice, @RequestParam("count") int count) {
		String random = RandomUtil.randomString(16);
		//保存订单
		int orderId = orderMapper.submitOrder(random, orderProductName, orderPrice, count, DateUtil.date());
		//再扣除商品库存
		R<Boolean> result = stockServiceClient.deductionStock(productId, count);
		if (!result.getResult()) {
			return ResResultManager.setResultError("库存扣除异常，下单失败");
		}

		//返回结果
		return ResResultManager.setResultSuccess("下单成功！下单商品为：{}"+orderProductName);
	}
}
