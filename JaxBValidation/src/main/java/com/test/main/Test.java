package com.test.main;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;

import com.test.enrollmentModel.Enrollments;

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
		Marshaller marshaller=(Marshaller) ctx.getBean("marshaller");
		
//		ShipOrder shipOrder=(ShipOrder) tester.getObject("src/main/resources/testxml.xml");
//		System.out.println(shipOrder.getOrderPerson());
//		PreValidate validator=new PreValidate(shipOrder);
//		validator.checkValidity();
		
		Enrollments enrollments=(Enrollments) tester.getObject("src/main/resources/sample.xml");
		if(enrollments!=null)
			System.out.println(enrollments.getEnrollment().iterator().next().getSponsorEIN());
		
		
		marshaller.marshal(enrollments, new StreamResult(new FileOutputStream("src/main/resources/un.xml")));

	}

	

}
