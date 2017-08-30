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

			// 　如果用户未登录，先执行登录操作，再验证二手车订单列表界面
			if (minePage.Please_login().getText().equals("请登录")) {
				minePage.Used_Order().click();
				Login_BaseCase.execute(driver, Constant.UserName,
						Constant.Password);
				WaitUtil.sleep(3000);
				// 验证二手车订单列表页面标题
				Assert.assertEquals(oldCarOrderPage.Title().getText(),
						"我的二手车订单");
				WaitUtil.sleep(2000);
				// 判断二手车订单列表中是否有订单数据
				if (driver.getPageSource().contains("暂无")) {
					// 没有数据时，验证返回"暂无淘车认证车订单"相关提示信息
					Assert.assertTrue(oldCarOrderPage.NoOrder().isDisplayed());
				} else {
					// 有数据时，验证二手车订单列表数量大于0
					Assert.assertTrue(oldCarOrderPage.OrderCarNameList().size() > 0);
					// 获取界面中第一个删除订单按钮，并点击
					oldCarOrderPage.DeleteBtn().get(0).click();
					// 弹出是否确认删除界面
					Assert.assertTrue(oldCarOrderPage.MakeDelete()
							.isDisplayed());
					Assert.assertTrue(oldCarOrderPage.NoDelete().isDisplayed());

					// 点击暂不删除
					oldCarOrderPage.NoDelete().click();

					// 向上滑动页面，验证订单列表里数量较多时出现分页的情况。暂定向上滑动5次
					App_common app_common = new App_common();
					for (int i = 0; i < 5; i++) {
						app_common.swipeToUp(driver, 1000);
					}
				}
			} else {
				// 用户已登录状态，直接进入二手车订单列表界面验证
				Assert.assertTrue(minePage.Used_Order().isDisplayed());
				minePage.Used_Order().click();
				// 验证二手车订单列表页面标题
				Assert.assertEquals(oldCarOrderPage.Title().getText(),
						"我的二手车订单");
				if (driver.getPageSource().contains("暂无")) {
					// 二手车订单列表中没有数据，验证列表信息
					Assert.assertTrue(oldCarOrderPage.NoOrder().isDisplayed());
				} else {
					// 二手车订单列表中有数据时，验证订单列表数量大于0
					Assert.assertTrue(oldCarOrderPage.OrderCarNameList().size() > 0);
					// 获取界面中第一个删除订单按钮，并点击
					oldCarOrderPage.DeleteBtn().get(0).click();
					// 弹出是否确认删除界面
					Assert.assertTrue(oldCarOrderPage.MakeDelete()
							.isDisplayed());
					Assert.assertTrue(oldCarOrderPage.NoDelete().isDisplayed());

					// 点击暂不删除
					oldCarOrderPage.NoDelete().click();
					// 点击暂不删除，删除订单仍显示在二手车订单列表中
					Assert.assertTrue(oldCarOrderPage.DeleteBtn().get(0)
							.isDisplayed());

					// 向上滑动页面，验证订单列表里数量较多时出现分页的情况。暂定向上滑动5次
					App_common app_common = new App_common();
					for (int i = 0; i < 5; i++) {
						app_common.swipeToUp(driver, 1000);
					}

					// 向下滑动同样次数，返回列表顶部
					for (int i = 0; i < 5; i++) {
						app_common.swipeToDown(driver, 1000);
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

	@Test(priority = 1)
	public void OldCarOrderStatus_Test() throws Exception {
		OldCarOrderPage oldCarOrderPage = new OldCarOrderPage(driver);
		if (oldCarOrderPage.MileageList().size() > 0) {
			// 当页面中描述包含"提交意向"时，验证界面中包含"等待客服电话联系"
			if (driver.getPageSource().contains("提交意向")) {
				Assert.assertTrue(driver.getPageSource().contains("等待客服电话联系"));
			}
			// 当页面中包含"订单已取消"描述时，验证界面中包含"删除订单"按钮
			if (driver.getPageSource().contains("订单已取消")) {
				Assert.assertTrue(oldCarOrderPage.DeleteBtn().size() > 0);
			}
			// 当页面中包含"购车成功"描述时，验证界面中包含"祝用车愉快~"提示信息，
			if (oldCarOrderPage.Success().isDisplayed()) {
				Assert.assertTrue(oldCarOrderPage.SuccessMsg().isDisplayed());
				Assert.assertTrue(oldCarOrderPage.CheckReportBtn()
						.isDisplayed());
				Assert.assertTrue(oldCarOrderPage.ApplyServiceBtn()
						.isDisplayed());
			}
			// 当页面中包含"预约看车"描述时，界面返回联系顾问按钮和等待顾问电话联系提示信息
			if (oldCarOrderPage.WatchCar().isDisplayed()) {
				Assert.assertTrue(oldCarOrderPage.ConnectBtn().isDisplayed());
				Assert.assertTrue(oldCarOrderPage.WaitForConnectMsg()
						.isDisplayed());
			}
		}
	}
}
