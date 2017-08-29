package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Modules.Login_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.OldCarOrderPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class OldCarOrderPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void OldCarOrderPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		OldCarOrderPage oldCarOrderPage = new OldCarOrderPage(driver);
		homePage.Mine().click();
		try {
			Assert.assertTrue(minePage.Used_Order().isDisplayed());

			if (minePage.Please_login().getText().equals("请登录")) {
				minePage.Used_Order().click();
				Login_BaseCase.execute(driver, Constant.UserName,
						Constant.Password);
				WaitUtil.sleep(3000);
				// 验证二手车订单列表页面标题
				Assert.assertEquals(oldCarOrderPage.Title().getText(),
						"我的二手车订单");
			} else {
				Assert.assertTrue(minePage.Used_Order().isDisplayed());
				minePage.Used_Order().click();
				// 验证二手车订单列表页面标题
				Assert.assertEquals(oldCarOrderPage.Title().getText(),
						"我的二手车订单");
				if (driver.getPageSource().contains("暂无")) {
					Assert.assertTrue(oldCarOrderPage.NoOrder().isDisplayed());
				} else {
					Assert.assertTrue(oldCarOrderPage.OrderCarNameList().size() > 0);
					// 获取界面中第一个删除订单按钮，并点击
					oldCarOrderPage.DeleteBtn().get(0).click();
					// 弹出是否确认删除界面
					Assert.assertTrue(oldCarOrderPage.MakeDelete()
							.isDisplayed());
					Assert.assertTrue(oldCarOrderPage.NoDelete().isDisplayed());

					// 点击暂不删除
					oldCarOrderPage.NoDelete().click();

					App_common app_common = new App_common();
					for (int i = 0; i < 5; i++) {
						app_common.swipeToUp(driver, 1000);
					}
				}
			}
			Log.info("二手车订单列表验证成功");
			Reporter.log("二手车订单列表验证成功");
		} catch (AssertionError e) {
			Log.error("二手车订单列表验证失败：" + e);
			Reporter.log("二手车订单列表验证失败：" + e);
		}
	}
}
