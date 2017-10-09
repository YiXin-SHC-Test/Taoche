package Yixin.Taoche.TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HelpBuyPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class HelpBuyPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void HelpBuyIndex_Test() {
		Log.startTestCase("执行验证帮买服务界面");
		HomePage homePage = new HomePage(driver);
		HelpBuyPage helpBuyPage = new HelpBuyPage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		try {
			homePage.Oldcar().click();
			WaitUtil.sleep(2000);
			oldCarListPage.HelpBuy().click();

			Set<String> Handelse = driver.getContextHandles();
			for (String handel : Handelse) {
				System.out.println(handel);
			}

			driver.context("WEBVIEW_com.taoche.yixin.app");
			driver.findElement(By.id("a_price")).click();
			WaitUtil.sleep(2000);
			driver.findElement(By.xpath(".//*[text()='5-8万']")).click();

			WaitUtil.sleep(30000);
			Assert.assertEquals(helpBuyPage.Title().getText(), "帮买服务");
			Assert.assertTrue(helpBuyPage.BackBtn().isEnabled());
			Assert.assertTrue(helpBuyPage.ShareBtn().isEnabled());

			Log.endTestCase("验证帮买服务界面结束");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 通坐标定位位置信息
	@Test(priority = 1, enabled = false)
	public void StartHelpBuy_Test() throws Exception {
		HelpBuyPage helpBuyPage = new HelpBuyPage(driver);
		App_common app_common = new App_common();
		// 通过坐标，点击开启帮忙服务按钮
		try {
			app_common.tab(300, 350, driver);
			Assert.assertTrue(driver.getPageSource().contains("关闭"));
			helpBuyPage.BackBtn().click();
			Log.info("帮买页面跳转验证成功");
			Reporter.log("帮买页面跳转验证成功");
		} catch (AssertionError e) {
			Log.error("帮买页面跳转验证失败：" + e);
			Reporter.log("帮买页面跳转验证失败：" + e);
		}
	}

	// 验证帮买界面，分享弹出层
	@Test(priority = 2, enabled = false)
	public void HelpBuy_ShareBox() throws Exception {
		HelpBuyPage helpBuyPage = new HelpBuyPage(driver);
		helpBuyPage.ShareBtn().click();
		WaitUtil.sleep(2000);
		Assert.assertTrue(helpBuyPage.ShareboxTitle().isDisplayed());
		Assert.assertTrue(helpBuyPage.CancleBtn().isDisplayed());
		Assert.assertTrue(driver.getPageSource().contains("微信"));
		Assert.assertTrue(driver.getPageSource().contains("新浪"));
		Assert.assertTrue(driver.getPageSource().contains("QQ"));
		helpBuyPage.CancleBtn().click();
		helpBuyPage.BackBtn().click();
	}
}
