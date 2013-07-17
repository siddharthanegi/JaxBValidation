package com.test.validate;

public class Validator {

	public static boolean validateName(String name) {

		if (name.matches("[a-zA-Z]+")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateNumber(String number) {

		if (number.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean validateDecimalNumbers(String dmal){
		
		if(dmal.matches("[0-9]+(.[0-9][0-9]?)?")){
			return true;
		}
		else
			return false;
	}

}
