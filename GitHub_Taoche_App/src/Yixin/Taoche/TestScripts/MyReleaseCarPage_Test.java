package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.MyReleaseCarPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Log;

public class MyReleaseCarPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void MyReleaseCarPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		MyReleaseCarPage myReleaseCarPage = new MyReleaseCarPage(driver);
		homePage.Mine().click();
		Log.startTestCase("开始执行我发布的二手车界面验证");
		// 操作滑动页面类
		App_common app_common = new App_common();
		app_common.swipeToUp(driver, 1000);
		try {

			Assert.assertTrue(minePage.Release().isDisplayed());
			minePage.Release().click();
			// 断言界面中显示Title，同步车源，返回按钮，发布按钮
			Assert.assertTrue(myReleaseCarPage.SynchroBtn().isDisplayed());
			Assert.assertTrue(myReleaseCarPage.NowReleaseBtn().isDisplayed());
			Assert.assertTrue(myReleaseCarPage.Title().getText()
					.equals("我发布的二手车"));
			if (driver.getPageSource().contains("暂未")) {
				Assert.assertTrue(myReleaseCarPage.NoCarMsg().isDisplayed());
			} else {
				System.out.println("暂时没有数据");
			}
			Log.endTestCase("我发布的二手车界面验证结束");
			Log.info("我发布的二手车界面验证成功");
			Reporter.log("我发布的二手车界面验证成功");
		} catch (AssertionError e) {
			Log.error("我发布的二手车界面验证失败:" + e);
			Reporter.log("我发布的二手车界面验证失败:" + e);
		}
	}
	
	@Test(priority = 1)
	public void SynchroCar_Test(){
		
	}
}
