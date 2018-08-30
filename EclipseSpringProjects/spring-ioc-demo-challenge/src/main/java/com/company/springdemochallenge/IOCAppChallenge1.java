package com.company.springdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new FileSystemXmlApplicationContext(".\\src\\main\\resources\\beans-challenge.xml");
		
		City city = (City) ctxt.getBean("mycity");
		
		city.cityName();
		
		((FileSystemXmlApplicationContext)ctxt).close();		

	}

}
