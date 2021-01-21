/**
 * <p>Company: http://www.ctnrs.com/</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关应用.
 * @author zibin
 */
@SpringBootApplication
public class GatewayServiceApp {

  public static void main(String[] args) throws Exception {
      SpringApplication.run(GatewayServiceApp.class, args);
  }
}
