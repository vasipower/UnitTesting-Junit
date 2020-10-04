package SourceCode;

import org.junit.Test;

public class ValidateBarcode {

	public boolean checkValidBarCode(int i) {
		return true;

	}

	public boolean checkValidBarCodeWithCondition(int i) {

		if (i == 1234567890) {
			return true;
		}
		return false;
	}

}
