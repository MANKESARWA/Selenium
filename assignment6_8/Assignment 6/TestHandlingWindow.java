package assignment6_8;

public class TestHandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		
		HandlingWindow hw = new HandlingWindow();
		
		//Loading the URL.
		hw.loadURL();
		//Opening the different windows.
		hw.openDiffWindow();
		//Switching/get title/Closing the individual tab.
		hw.switchToAllTab();
		//Wait for 10000 millisecond.
		Thread.sleep(10000);
		//Closing the browser.
		hw.quitWindow();
		
	}

}
