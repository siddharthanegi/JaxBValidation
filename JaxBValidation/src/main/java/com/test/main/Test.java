package com.test.main;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import com.test.model.ShipOrder;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws XmlMappingException 
	 */
	public static void main(String[] args) throws XmlMappingException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
		Unmarshaller unmarshaller=(Unmarshaller) ctx.getBean("unmarshaller");
		ShipOrder shipOrder=(ShipOrder) unmarshaller.unmarshal(new StreamSource(new FileInputStream("src/main/resources/testxml.xml")));
		//StreamSource xml=new StreamSource("src/main/resources/testxml.xml");
		
		System.out.println(shipOrder.getItem().iterator().next().getQuantity());
		

	}

	

}
