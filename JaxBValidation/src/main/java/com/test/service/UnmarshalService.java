package com.test.service;

import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.XmlMappingException;

public interface UnmarshalService {

	Object unmarshal(StreamSource xmlInputSource) throws XmlMappingException, IOException;
}
