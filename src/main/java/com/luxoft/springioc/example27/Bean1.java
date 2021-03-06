package com.luxoft.springioc.example27;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.Connection;

public class Bean1 implements InitializingBean, DisposableBean {

	private Connection connection;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet for Ex1TestBean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy for Ex1TestBean");
	}
	
	public void init() {
		System.out.println("User custom init method for Ex1TestBean");
	}
	
	public void cleanup() {
		System.out.println("User custom cleanup method for Ex1TestBean");
	}


}
