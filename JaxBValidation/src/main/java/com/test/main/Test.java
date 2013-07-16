package com.test.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.XmlMappingException;

import com.test.model.ShipOrder;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws XmlMappingException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws XmlMappingException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
		Tester tester=(Tester) ctx.getBean("tester");
		//Tester t=new Tester();
		ShipOrder shipOrder=(ShipOrder) tester.getObject("src/main/resources/testxml.xml");
		//StreamSource xml=new StreamSource("src/main/resources/testxml.xml");
		
		System.out.println(shipOrder.getOrderPerson());
		

	}

	

}
