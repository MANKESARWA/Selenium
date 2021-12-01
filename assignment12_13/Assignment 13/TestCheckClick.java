package assignment12_13;

public class TestCheckClick {

	public static void main(String[] args) throws InterruptedException {
		 
		CheckClick ck = new CheckClick();
		ck.loadURL();
		ck.differentClick();
		ck.takeOutput();
		Thread.sleep(2000);
		ck.closePage();
		

	}

}
