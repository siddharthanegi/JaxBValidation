package com.test.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.XmlMappingException;

import com.test.model.ShipOrder;
import com.test.validate.PreValidate;

class Test {

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
		ShipOrder shipOrder=(ShipOrder) tester.getObject("src/main/resources/testxml.xml");
		System.out.println(shipOrder.getOrderPerson());
		PreValidate validator=new PreValidate(shipOrder);
		validator.checkValidity();

	}

	

}
