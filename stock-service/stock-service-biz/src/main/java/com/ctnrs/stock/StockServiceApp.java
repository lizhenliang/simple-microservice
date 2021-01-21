/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 商品服务启动类
 *
 * @author zibin
 */
@SpringBootApplication
@MapperScan(basePackages="com.ctnrs.stock.mapper")
public class StockServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(StockServiceApp.class, args);
    }
}
