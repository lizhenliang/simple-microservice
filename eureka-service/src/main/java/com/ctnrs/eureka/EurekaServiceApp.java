/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务启动类
 *
 * @author zibin
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApp.class, args);
	}
}
