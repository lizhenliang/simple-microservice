/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.product.api.model;

import lombok.Data;

/**
 * 商品的实体
 *
 * @author zibin
 */
@Data
public class Product {

	private Long id;

	private String productName;

	private Double price;

	private Long stock;
}
