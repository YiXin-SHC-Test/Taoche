package Yixin.Taoche.Modules;

import io.appium.java_client.AppiumDriver;
import Yixin.Taoche.Pageobjects.HomePage;

public class OldCarList_BaseCase {
	public static void OldCarList_Execute(AppiumDriver driver) throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.Oldcar().click();
	}
}
