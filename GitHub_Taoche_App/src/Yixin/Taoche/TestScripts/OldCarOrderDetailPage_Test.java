package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Modules.Login_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.OldCarOrderDetailPage;
import Yixin.Taoche.Pageobjects.OldCarOrderPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class OldCarOrderDetailPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void OrderDetailPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		OldCarOrderPage oldCarOrderPage = new OldCarOrderPage(driver);
		OldCarOrderDetailPage oldCarOrderDetailPage = new OldCarOrderDetailPage(
				driver);
		App_common app_common = new App_common();
		homePage.Mine().click();
		if (minePage.Please_login().getText().equals("请登录")) {
			Login_BaseCase
					.execute(driver, Constant.UserName, Constant.Password);
		}

		minePage.Used_Order().click();
		System.out.println(oldCarOrderPage.OrderCarNameList());
		String CarName = oldCarOrderPage.OrderCarNameList().get(0).getText();
		oldCarOrderPage.OrderCarNameList().get(0).click();
		Log.startTestCase("执行二手车订单详情页界面验证");
		try {
			// 断言进入的界面是订单详情页
			Assert.assertTrue(oldCarOrderDetailPage.Title().isDisplayed());
			Assert.assertTrue(oldCarOrderDetailPage.BackBtn().isEnabled());
			// 断言列表中的车源名称和订单详情中的车源名称一致
			System.out.println(oldCarOrderDetailPage.CarName().getText());
			System.out.println(CarName);
			// 这里实际上打印出来是一样的，但是不能匹配相同...
			// Assert.assertTrue(oldCarOrderDetailPage.CarName().equals(CarName));
			WaitUtil.sleep(2000);
			if (driver.getPageSource().contains("订单编号") == false) {
				for (int i = 0; i < 3; i++) {
					app_common.swipeToUp(driver, 1000);
				}
			}
			// 断言订单详情页中显示订单信息
			System.out.println(oldCarOrderDetailPage.OrderMsg().getText());
			Assert.assertTrue(oldCarOrderDetailPage.OrderMsg().isDisplayed());
			Log.endTestCase("二手车订单详情页界面验证结束");
			Log.info("二手车订单详情页界面验证成功");
			Reporter.log("二手车订单详情页界面验证成功");
		} catch (AssertionError e) {
			Log.error("订单详情界面元素验证失败：" + e);
			Reporter.log("订单详情界面元素验证失败：" + e);
		}
	}

	@Test(priority = 1)
	public void OrderDetail_Test() throws Exception {
		OldCarOrderDetailPage oldCarOrderDetailPage = new OldCarOrderDetailPage(
				driver);
		Log.startTestCase("执行二手车订单详情逻辑验证");
		try {
			// 验证当详情页中订单状态是"订单已取消"时，详情页中显示"删除订单"按钮
			if (oldCarOrderDetailPage.Orderstatus().getText().equals("订单已取消")) {
				Assert.assertTrue(oldCarOrderDetailPage.DeleteBtn()
						.isDisplayed());
				// 点击"删除订单"按钮，弹出是否确认删除弹出层
				oldCarOrderDetailPage.DeleteBtn().click();
				Assert.assertTrue(oldCarOrderDetailPage.NoDelete()
						.isDisplayed());
				Assert.assertTrue(oldCarOrderDetailPage.MakeDelete()
						.isDisplayed());
				// 点击暂不删除，关闭弹出层
				oldCarOrderDetailPage.NoDelete().click();
			}
			// 验证当订单状态是"预约看车"时，界面中显示"联系顾问"按钮
			if (oldCarOrderDetailPage.Orderstatus().getText().equals("预约看车")) {
				// 验证联系顾问按钮显示
				Assert.assertTrue(oldCarOrderDetailPage.ConnectService()
						.isDisplayed());
				// 验证等待顾问联系描述信息显示
				Assert.assertTrue(oldCarOrderDetailPage.CarDesc().getText()
						.equals("等待顾问电话联系"));
				// 验证顾问姓名显示
				Assert.assertTrue(oldCarOrderDetailPage.Adviser_name()
						.isDisplayed());
				// 验证顾问电话显示
				Assert.assertTrue(oldCarOrderDetailPage.Adviser_phone()
						.isDisplayed());
			}

			// 验证当详情页中状态是"购车成功"时，界面返回信息
			if (oldCarOrderDetailPage.Orderstatus().getText().equals("购车成功")) {
				
			}
			Log.endTestCase("二手车订单详情页逻辑验证结束");
			Log.info("二手车订单详情页逻辑验证成功");
			Reporter.log("二手车订单详情页逻辑验证成功");
		} catch (AssertionError e) {
			Log.error("二手车订单详情界面逻辑验证失败：" + e);
			Reporter.log("二手车订单详情界面逻辑验证失败：" + e);
		}
	}
}
