/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 门户启动类
 * @author zibin
 */
@SpringBootApplication
@EnableFeignClients("com.ctnrs")
public class PortalServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(PortalServiceApp.class);
	}
}
