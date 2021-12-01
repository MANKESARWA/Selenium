package assignment6_8;

public class TestingHandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		
		HandlingAlert ha = new HandlingAlert();
		
		///Opening the url
		ha.loadURL();
		//handling the alert with Ok
		ha.alertWithOk();
		Thread.sleep(2000);//to see the alert.
		//handling the alert with Cancel
		ha.alertWithCancel();
		Thread.sleep(2000);//to see the alert.
		//handling the alert with Text
		ha.alertWithText();
		Thread.sleep(10000);
		
		//Closing the browser.
		ha.quitBrowser();

	}

}
