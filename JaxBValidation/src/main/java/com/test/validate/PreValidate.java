package com.test.validate;

import java.util.List;

import com.test.model.Item;
import com.test.model.ShipOrder;

public class PreValidate {
	
	private ShipOrder shipOrder;
	
	public PreValidate(ShipOrder shipOrder){
		this.shipOrder=shipOrder;
	}
	public void setShipOrder(ShipOrder shipOrder) {
		this.shipOrder = shipOrder;
	}
	public void checkValidity(){
		 boolean validOrderName=true,validAddress=true,validQuantity=true;
		 validOrderName=Validator.validateName(shipOrder.getOrderPerson());
		 System.out.println(validOrderName);
		 
		 List<Item> items=shipOrder.getItem();
		 for(Item item : items){
			 if(!Validator.validateNumber(item.getQuantity())){
				 validQuantity=false;
			 }
		 }
		 System.out.println(validQuantity);
	
	}

}
