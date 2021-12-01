package assignment12_13;

public class TestMouseHover {

	public static void main(String[] args) throws InterruptedException {
		 
		MouseHover mh = new MouseHover();
		mh.loadURL();
		mh.hover();
		mh.countTable();
//		mh.SwitchingWindows();
		Thread.sleep(3000);
		mh.closePage();
		

	}

}
