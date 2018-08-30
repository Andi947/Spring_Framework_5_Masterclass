package com.company.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.springdemo.domain.HumanResourcesDept;
import com.company.springdemo.domain.Organization;

public class DIConstructorApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		HumanResourcesDept hrDept = (HumanResourcesDept) ctx.getBean("myhrdept");
		
		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		//Print organization details
//		System.out.println(org);
//		
//		System.out.println(org.corporateService());
		
		System.out.println(hrDept.hiringStatus(5500));
		
		// close the application context (container)
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
