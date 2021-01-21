/**
 * LegendShop微服务商城系统
 * ©版权所有,并保留所有权利。
 */
package com.ctnrs.stock.api.client;


import com.ctnrs.basic.core.util.R;
import com.ctnrs.stock.api.constant.StockServiceNameConstant;
import com.ctnrs.stock.api.model.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存服务远程调用客户端
 *
 * @author zibin
 */
@FeignClient(StockServiceNameConstant.STOCK_SERVICE)
public interface StockServiceClient {

	@GetMapping("/stock/findStockByProductId/{productId}")
	R<Stock> findStockByProductId(@PathVariable("productId") Long productId);

	@PostMapping("/stock/deductionStock")
	R<Boolean> deductionStock(@RequestParam(value = "productId") Long productId,
							  @RequestParam(value = "count") int count
	);
}
