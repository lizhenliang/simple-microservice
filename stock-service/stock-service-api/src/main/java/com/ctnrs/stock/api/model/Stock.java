/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.stock.api.model;

import lombok.Data;

/**
 * 库存的实体
 * @author zibin
 */
@Data
public class Stock {

	/**
	 * id
	 */
	private Long id;

	/**
	 * 商品id
	 */
	private Long prodId;

	/***
	 * 销售库存
	 */
	private Long salesStock;

	/***
	 * 真实库存
	 */
	private Long realStock;
}
