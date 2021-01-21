/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.api.model;

import lombok.Data;

import java.util.Date;

/**
 * 订单的实体
 *
 * @author zibin
 */
@Data
public class Order {

	private Long id;

	private String orderNumber;

	private String orderProductName;

	private Double orderPrice;

	private int count;

	private Date buyDate;
}
