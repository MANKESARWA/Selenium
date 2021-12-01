package assignment6_8;

public class TestDatePicker {

	public static void main(String[] args) throws InterruptedException {

		DatePicker dp = new DatePicker();
		//Calling the functions 
		dp.loadURL();
		dp.settingFromTo();
		dp.datePicker();
		dp.setWeek();
		dp.setAirline();
		dp.setLanguage();
		dp.clickButton();
		Thread.sleep(10000);
		dp.closePage();

	}

}
