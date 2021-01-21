/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.stock.controller;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import com.ctnrs.stock.api.model.Stock;
import com.ctnrs.stock.mapper.StockMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 库存的服务控制层
 *
 * @author zibin
 */
@AllArgsConstructor
@RestController
@RequestMapping("stock")
@Slf4j
public class StockController {

	private final StockMapper stockMapper;

	/**
	 * 根据商品id查询商品库存
	 *
	 * @return
	 */

	@GetMapping("/findStockByProductId/{productId}")
	public R<Stock> findStockByProductId(@PathVariable("productId") Long productId) {
		log.info("商品id为：{}", productId);
		Stock stock = stockMapper.findStockByProductId(productId);
		return ResResultManager.setResultSuccess(stock);
	}

	@PostMapping("/deductionStock")
	public R<Boolean> deductionStock(@RequestParam(value = "productId") Long productId,
									 @RequestParam(value = "count") int count
	) {
		Long result = stockMapper.deductionStock(productId, count);
		return ResResultManager.setResultSuccess(ResResultManager.toDaoResult(result));
	}
}
