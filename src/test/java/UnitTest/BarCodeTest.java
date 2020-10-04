package UnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import SourceCode.ValidateBarcode;

public class BarCodeTest {

	@Test
	public void checkValidBarCode() {
		ValidateBarcode validator = new ValidateBarcode();

		boolean result = validator.checkValidBarCode(1234567890);
		assertTrue(result);

	}

	@Test
	public void checkInValidBarCode() {
		ValidateBarcode validator = new ValidateBarcode();

		boolean result = validator.checkValidBarCode(123456);

		assertFalse(result);
	}

	// Testing with condition -Passing Valid condition

	@Test
	public void checkValidBarCodeWithCondition() {
		ValidateBarcode validator = new ValidateBarcode();

		boolean result = validator.checkValidBarCodeWithCondition(1234567890);
		assertTrue(result);

	}

	// Passing Invalid condition
	@Test
	public void checkInValidBarCodeWithCondition() {
		ValidateBarcode validator = new ValidateBarcode();

		boolean result = validator.checkValidBarCodeWithCondition(123456789);
		assertTrue(result);

	}

}
