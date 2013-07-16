package com.test.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="shiporder")
public class ShipOrder {

		@XmlElement(name="orderperson")
		private String orderperson;
	
		private ShipTo shipto;

		private List<Item> item;
		
			
		public String getOrderPerson() {
			return orderperson;
		}
		public void setOrderPerson(String orderPerson) {
			this.orderperson = orderPerson;
		}
		public ShipTo getShipto() {
			return shipto;
		}
		public void setShipto(ShipTo shipto) {
			this.shipto = shipto;
		}
		public List<Item> getItem() {
			return item;
		}
		public void setItem(List<Item> items) {
			this.item = items;
		}
		

	}


