package com.test.service;

import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Service;

@Service("unmarshalService")
public class UnmarshalServiceImpl implements UnmarshalService {

	@Autowired
	private Unmarshaller unmarshaller;
	
	@Override
	public Object unmarshal(StreamSource xmlInputSource) throws XmlMappingException, IOException {
		// TODO Auto-generated method stub
		return unmarshaller.unmarshal(xmlInputSource);
	}


}
