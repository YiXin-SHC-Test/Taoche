package Yixin.Taoche.TestScripts;

import org.testng.Assert;
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
	@Test(priority = 1)
	public void StartHelpBuy_Test() {
		//HelpBuyPage helpBuyPage = new HelpBuyPage(driver);
		App_common app_common = new App_common();
		// 通过坐标，点击开启帮忙服务按钮
		app_common.tab(202, 350, driver);
		Assert.assertTrue(driver.getPageSource().contains("关闭"));
	}
}
