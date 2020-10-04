package SourceCode;

import org.junit.Test;

public class Barcode {

	/*
	 * 
	 */

	public boolean checkValidBarCode(int i) {
		return true;

	}

	/*
	 * with blow code we are checking given number is same or not
	 */

	public boolean checkValidBarCodeWithCondition(int i) {

		if (i == 1234567890) {
			return true;
		}
		return false;
	}

	/*
	 * With below code we are checking ISBN numbers is valid or not
	 */

	public boolean checkValidISBNNumber(String isbn) {

		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += isbn.charAt(i) * (10 - i);
		}
		if (total % 11 == 0) {

			return true;
		} else {
			return false;
		}

	}

	/*
	 * With below code we are checking ISBN numbers is valid or not first we are
	 * First we are checking length is 10 or not
	 */

	public boolean checkValidISBNNumberWithLengthCondition(String isbn) {

		if (isbn.length() != 10)
			throw new NumberFormatException("ISBN number must be 10 numbers long");

		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += isbn.charAt(i) * (10 - i);
		}
		if (total % 11 == 0) {

			return true;
		} else {
			return false;
		}

	}

	/*
	 * With below code we are checking ISBN numbers is valid or not first we are
	 * First we are checking length is 10 or not and then we are checking given
	 * input string is numbers are not
	 */

	public boolean checkValidISBNNumberWithLengthConditionANDNumberOrNot(String isbn) {

		if (isbn.length() != 10)
			throw new NumberFormatException("ISBN number must be 10 numbers long");

		int total = 0;
		for (int i = 0; i < 10; i++) {

			if (!Character.isDigit(isbn.charAt(i)))
				throw new NumberFormatException("ISBN number can only contain numaric digits");
			total += isbn.charAt(i) * (10 - i);
		}
		if (total % 11 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
