/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.product.controller;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import com.ctnrs.product.api.model.Product;
import com.ctnrs.product.mapper.ProductMapper;
import com.ctnrs.stock.api.client.StockServiceClient;
import com.ctnrs.stock.api.model.Stock;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品的服务控制层
 *
 * @author zibin
 */
@AllArgsConstructor
@RestController
public class ProductController {

	private final ProductMapper productMapper;

	private final StockServiceClient stockServiceClient;

	/**
	 * 根据商品id查询商品
	 *
	 * @return
	 */
	@GetMapping("/findByProductId/{productId}")
	public R<Product> findByProductId(@PathVariable Long productId) {
		Product product = productMapper.findByProductId(productId);
		return ResResultManager.setResultSuccess(product);
	}


	/**
	 * 查询所有商品
	 *
	 * @return
	 */
	@GetMapping("/queryAllProduct")
	public R<List<Product>> findByProductId() {
		List<Product> productList = productMapper.queryAllProduct();
		for (Product prod:productList) {
			R<Stock> stockResult = stockServiceClient.findStockByProductId(prod.getId());
			prod.setStock(stockResult.getResult().getRealStock());
		}
		return ResResultManager.setResultSuccess(productList);
	}
}
