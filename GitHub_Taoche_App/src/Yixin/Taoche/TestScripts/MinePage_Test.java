package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.LoginPage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.SetPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class MinePage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void MineIndexPage_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		homePage.Mine().click();
		try {
			Assert.assertEquals(minePage.Title().getText(), "我的");
			Assert.assertTrue(minePage.SetBtn().isEnabled());
			Assert.assertEquals(minePage.Used_Order().getText(), "我的二手车订单");
			Assert.assertEquals(minePage.Collect().getText(), "我收藏的二手车");
			Assert.assertTrue(minePage.Scan().isEnabled());
			Assert.assertTrue(minePage.Release().isDisplayed());
			App_common app_common = new App_common();
			app_common.swipeToUp(driver, 1000);
			Assert.assertTrue(minePage.Feedback().isDisplayed());
			Log.info("我的页面验证结束");
			Reporter.log("我的页面验证结束");
		} catch (AssertionError e) {
			Log.error("我的页面验证失败：" + e);
			Reporter.log("我的页面验证失败" + e);
		}
	}

	@Test(priority = 1)
	public void IsLogin() throws Exception {
		MinePage minePage = new MinePage(driver);
		String IsLoginText = minePage.Please_login().getText();
		LoginPage loginPage = new LoginPage(driver);
		if (IsLoginText.equals("请登录")) {
			minePage.Please_login().click();
			Assert.assertEquals(loginPage.Title().getText(), "手机快捷登录");
			loginPage.Closebtn().click();
			WaitUtil.sleep(2000);
			minePage.Used_Order().click();
			Assert.assertEquals(loginPage.Title().getText(), "手机快捷登录");
		} else {
			Assert.assertEquals(minePage.Please_login().getText(), "易鑫用户");
		}
	}

	@Test(priority = 2)
	public void SetBtn_Test() throws Exception {
		MinePage minePage = new MinePage(driver);
		SetPage setPage = new SetPage(driver);
		App_common app_common = new App_common();
		app_common.swipeToDown(driver, 1000);
		minePage.SetBtn().click();
		try {
			Assert.assertEquals(setPage.Title().getText(), "设置");
			Assert.assertTrue(setPage.BackBtn().isEnabled());
			Assert.assertTrue(setPage.CleanCache().isEnabled());
			Assert.assertTrue(setPage.Update().isEnabled());
			Assert.assertTrue(setPage.CurrentVersion().isEnabled());
			Assert.assertTrue(setPage.Share().isEnabled());
			Assert.assertTrue(setPage.About().isEnabled());
			Assert.assertTrue(setPage.Exit().isEnabled());
			setPage.BackBtn().click();
			Log.info("设置页面验证结束");
			Reporter.log("设置页面验证结束");
		} catch (AssertionError e) {
			Log.error("设置页面验证失败:" + e);
			Reporter.log("设置页面验证失败:" + e);
		}
	}
}
