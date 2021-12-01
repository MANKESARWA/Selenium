package assignment8_11;

public class TestStaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		StaticWebTable swt = new StaticWebTable();
		
		//calling all the fuctions 
		swt.loadURL();
		swt.printTable();
		// implicit wait to sync the page and look for the functionality.
		Thread.sleep(10000);
		swt.closePage();

	}

}
