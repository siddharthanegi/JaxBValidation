package com.test.main;

import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Component;

import com.test.service.UnmarshalService;

@Component
public class Tester {
	
	@Autowired
	@Qualifier("unmarshalService")
	private UnmarshalService unmarshalService;
	

	public Object getObject(String sourceXML) throws XmlMappingException, IOException{
		
		return unmarshalService.unmarshal(new StreamSource("src/main/resources/testxml.xml"));
	}

}
