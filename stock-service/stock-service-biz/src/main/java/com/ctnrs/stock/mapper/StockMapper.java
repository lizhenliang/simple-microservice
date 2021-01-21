/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.stock.mapper;

import com.ctnrs.stock.api.model.Stock;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StockMapper {

	@Select("select s.id,s.prod_id as prodId, s.sales_stock AS salesStock,s.real_stock AS realStock FROM stock s WHERE prod_id = #{productId}")
	Stock findStockByProductId(@Param("productId") Long productId);

	@Update("update stock set real_stock=real_stock-#{count} where prod_id = #{productId}")
	Long deductionStock(@Param("productId") Long productId,@Param("count") int count);

}
