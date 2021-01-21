/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.mapper;

import com.ctnrs.order.api.model.Order;
import com.ctnrs.product.api.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * 订单的数据层mapper
 * @author zibin
 */
public interface OrderMapper {
	@Insert("INSERT INTO orders (order_number,order_product_name,order_price,COUNT,buy_date) VALUES  (#{orderNumber},#{orderProductName},#{orderPrice},#{count},#{buyDate})")
	int submitOrder(@Param("orderNumber") String orderNumber,@Param("orderProductName") String orderProductName,@Param("orderPrice")  Double orderPrice,@Param("count") int count,@Param("buyDate") Date buyDate);

	@Select("select o.id,o.order_number as orderNumber,o.order_product_name as orderProductName,o.order_price as orderPrice,o.count,o.buy_date as buyDate from orders o")
	List<Order> queryAllOrder();
}
