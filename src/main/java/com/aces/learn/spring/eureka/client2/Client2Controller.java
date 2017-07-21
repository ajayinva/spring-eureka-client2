/**
 * 
 */
package com.aces.learn.spring.eureka.client2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aagarwal
 *
 */
@RestController
public class Client2Controller {
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		return "Hello from Eureka Client2";
	}

}
