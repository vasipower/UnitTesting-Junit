package UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import SourceCode.Barcode;

public class BarCodeTest {

	@Test
	public void checkValidBarCode() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidBarCode(1234567890);
		assertTrue(result);
	}

	@Test
	public void checkInValidBarCode() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidBarCode(123456);

		assertFalse(result);
	}

	/*
	 * Testing with condition -Passing Valid condition
	 */

	@Test
	public void checkValidBarCodeWithCondition() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidBarCodeWithCondition(1234567890);
		assertTrue(result);

	}

	/*
	 * Passing Invalid condition
	 */

	@Test
	public void checkInValidBarCodeWithCondition() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidBarCodeWithCondition(123456789);
		assertFalse(result);

	}

	/*
	 * Validate International Standard Book Number is valid or not
	 */

	@Test
	public void checkValidBookNumber() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumber("0491001304");
		assertTrue(result);

	}

	/*
	 * Passing Invalid condition
	 */

	@Test
	public void checkInValidBookNumber() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumber("0491011111104");
		assertFalse(result);

	}

	/*
	 * Validate International Standard Book Number is valid or not first we are
	 * checking the length
	 */

	@Test
	public void checkValidBookNumberWithLenght() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumberWithLengthCondition("0491001304");
		assertTrue(result);

	}

	/*
	 * Checking input string is string character and length is 9 should fail
	 */

	@Test
	public void checkValidBookNumberWithLengthAndNumberOrNot1() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumberWithLengthCondition("helloworl");
		assertTrue(result);

	}

	/*
	 * Passing Invalid condition first we are checking the length
	 */

	@Test
	public void checkInValidBookNumberWithLenght() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumberWithLengthCondition("049100130");
		assertFalse(result);

	}

	/*
	 * Checking input string is digit or not
	 */

	@Test
	public void checkValidBookNumberWithLengthAndNumberOrNot() {
		Barcode validator = new Barcode();

		boolean result = validator.checkValidISBNNumberWithLengthConditionANDNumberOrNot("helloworld");
		assertTrue(result);

	}

}
