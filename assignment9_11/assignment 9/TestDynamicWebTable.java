package assignment8_11;

public class TestDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		DynamicWebTable dwt = new DynamicWebTable();
		// Calling all the functions
		dwt.loadURL();
		dwt.searchElement();
		dwt.closePage();
	}

}
