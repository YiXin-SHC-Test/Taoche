package Yixin.Taoche.TestScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.CollectionPage;
import Yixin.Taoche.Pageobjects.EvaluatePage;
import Yixin.Taoche.Pageobjects.HelpBuyPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Pageobjects.OldListSearchPage;
import Yixin.Taoche.Pageobjects.SaleCarPage;
import Yixin.Taoche.Pageobjects.SelectCityPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.Reg_Num;
import Yixin.Taoche.Util.WaitUtil;

public class OldCarListPage_Test extends App_BaseCase {

	// 进入二手车列表页验证界面元素
	@Test(priority = 0)
	public void OldCarList() throws Exception {
		Log.startTestCase("进入淘车二手车列表页");
		HomePage homePage = new HomePage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		homePage.Oldcar().click();
		WaitUtil.sleep(2000);
		try {
			Assert.assertTrue(oldCarListPage.Location().isEnabled());
			System.out.println("界面Title是:" + oldCarListPage.Title().getText());
			Assert.assertEquals(oldCarListPage.Title().getText(), "二手车");
			Assert.assertTrue(oldCarListPage.Search().isEnabled());
			Assert.assertTrue(oldCarListPage.HelpBuy().isEnabled());
			Assert.assertTrue(oldCarListPage.Evaluate().isEnabled());
			Assert.assertTrue(oldCarListPage.SaleCar().isEnabled());
			Assert.assertTrue(oldCarListPage.Collection().isEnabled());
			Assert.assertTrue(oldCarListPage.AuthCar().isEnabled());
			Assert.assertTrue(oldCarListPage.BtnSort().isEnabled());
			Assert.assertTrue(oldCarListPage.ImvSort().isEnabled());
			Assert.assertTrue(oldCarListPage.ImvBrand().isEnabled());
			Assert.assertTrue(oldCarListPage.BtnBrand().isEnabled());
			Assert.assertTrue(oldCarListPage.BtnPrice().isEnabled());
			Assert.assertTrue(oldCarListPage.ImvPrice().isEnabled());
			Assert.assertTrue(oldCarListPage.list_screen().isEnabled());
			Assert.assertTrue(oldCarListPage.imv_screen().isEnabled());
			Assert.assertTrue(oldCarListPage.image_list().size() > 0);
			Log.info("Msg:二手车列表页面显示正确");
			Reporter.log("Msg:二手车列表页面显示正确");
		} catch (AssertionError e) {
			Log.error("error:二手车列表页面显示错误" + e);
			Reporter.log("error:二手车列表页面显示错误" + e);
		}
		Log.endTestCase("二手车列表页验证完成");
	}

	// 操作二手车列表页位置元素
	@Test(priority = 1, enabled = false)
	public void Select_Location() throws Exception {
		Log.startTestCase("二手车列表页选择区域操作");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		SelectCityPage selectCityPage = new SelectCityPage(driver);
		try {
			oldCarListPage.Location().click();
			Assert.assertTrue(selectCityPage.Beijing().isDisplayed());
			Assert.assertEquals(selectCityPage.Title().getText(), "城市");
			Assert.assertTrue(driver.getPageSource().contains("安徽"));
			Log.info("Msg:选择城市界面显示正确");
			Reporter.log("Msg:选择城市界面显示正确");
		} catch (AssertionError e) {
			Log.error("error:选择城市界面显示错误" + e);
			Reporter.log("error:选择城市界面显示错误" + e);
		}
		Log.endTestCase("验证选择区域界面完成");
	}

	// 选择一个城市返回到二手车车源列表页面
	@Test(priority = 2, enabled = false)
	public void Select_city() throws Exception {
		Log.startTestCase("城市界面选择'北京'");
		SelectCityPage selectCityPage = new SelectCityPage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		try {
			selectCityPage.Selected_City().click();
			Assert.assertEquals(oldCarListPage.Title().getText(), "二手车");
			Assert.assertTrue(oldCarListPage.image_list().size() > 0);
			Log.info("Msg:选择城市流程正确");
			Reporter.log("Msg:选择城市流程正确");
		} catch (Exception e) {
			Log.error("error:选择城市流程错误" + e);
			Reporter.log("error:选择城市流程错误" + e);
		}
		Log.endTestCase("返回二手车车源列表");
	}

	// 选择帮买二手车
	@Test(priority = 3, enabled = false)
	public void Help_buy() throws Exception {
		Log.startTestCase("进入帮买二手车界面");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		HelpBuyPage helpBuyPage = new HelpBuyPage(driver);
		try {
			oldCarListPage.HelpBuy().click();
			WaitUtil.sleep(3000);
			Assert.assertEquals(helpBuyPage.Title().getText(), "帮买服务");
			/*
			 * Assert.assertTrue(driver.getPageSource().contains("请选择购车预算"));
			 * Assert.assertTrue(driver.getPageSource().contains("提交"));
			 */
			Log.info("Msg:帮忙二手车界面显示正确");
			Reporter.log("Msg:帮忙二手车界面显示正确");
		} catch (AssertionError e) {
			Log.error("error:帮忙二手车界面显示错误" + e);
			Reporter.log("error:帮忙二手车界面显示错误" + e);
		}
		helpBuyPage.BackBtn().click();
		WaitUtil.sleep(2000);
		Log.endTestCase("退出帮买二手车界面");
	}

	// 进入车辆估价界面
	@Test(priority = 4, enabled = false)
	public void Evaluate() throws Exception {
		Log.startTestCase("进入车辆评估界面");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		EvaluatePage evaluatePage = new EvaluatePage(driver);
		try {
			oldCarListPage.Evaluate().click();
			WaitUtil.sleep(2000);
			Assert.assertEquals(evaluatePage.Title().getText(), "估车");
			Log.info("Msg:车辆评估界面显示正确");
			Reporter.log("Msg:车辆评估界面显示正确");
		} catch (AssertionError e) {
			Log.error("error:车辆评估界面显示错误" + e);
			Reporter.log("error:车辆评估界面显示错误" + e);
		}
		Log.endTestCase("退出车辆评估界面");
		evaluatePage.BackBtn().click();
	}

	// 进入我要卖车界面
	@Test(priority = 5, enabled = false)
	public void SaleCar() throws Exception {
		Log.startTestCase("进入我要卖车界面");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		SaleCarPage saleCarPage = new SaleCarPage(driver);
		try {
			oldCarListPage.SaleCar().click();
			WaitUtil.sleep(2000);
			Assert.assertEquals(saleCarPage.Title().getText(), "卖车");
			Assert.assertTrue(driver.getPageSource().contains("自己网上卖"));
			Log.info("Msg:我要卖车界面显示正确");
			Reporter.log("Msg:我要卖车界面显示正确");
		} catch (AssertionError e) {
			Log.error("error:我要卖车界面显示错误" + e);
			Reporter.log("error:我要卖车界面显示错误" + e);
		}
		Log.endTestCase("退出卖车界面");
		saleCarPage.BackBtn().click();
	}

	// 进入车源收藏界面
	@Test(priority = 6, enabled = false)
	public void Collection() throws Exception {
		Log.startTestCase("进入收藏界面");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		CollectionPage collectionPage = new CollectionPage(driver);
		try {
			oldCarListPage.Collection().click();
			Assert.assertEquals(collectionPage.Title().getText(), "我收藏的二手车");
			Assert.assertTrue(collectionPage.CarList().isDisplayed());
			Assert.assertTrue(collectionPage.DealerList().isDisplayed());
			Log.info("Msg:车源收藏页显示正确");
			Reporter.log("Msg:车源收藏页显示正确");
		} catch (AssertionError e) {
			Log.error("error:车源收藏页面显示错误");
			Reporter.log("error:车源收藏页面显示错误" + e);
		}
		WaitUtil.sleep(2000);
		Log.endTestCase("退出收藏界面");
		collectionPage.BackBtn().click();
	}

	// 在二手车车源列表页执行搜索操作
	@Test(priority = 7, enabled = false)
	public void Search() throws Exception {
		Log.startTestCase("二手车车源列表页执行查询操作");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		OldListSearchPage oldListSearchPage = new OldListSearchPage(driver);
		try {
			oldCarListPage.Search().click();
			Assert.assertEquals(oldListSearchPage.HotSearch().getText(), "热门搜索");
			Assert.assertTrue(oldListSearchPage.Brand().isDisplayed());
			Assert.assertTrue(oldListSearchPage.NewCar().isEnabled());
			Log.info("Msg:二手车车源列表页显示正确");
			Reporter.log("Msg:二手车车源列表页显示正确");
		} catch (AssertionError e) {
			Log.error("error:二手车车源列表页显示错误");
			Reporter.log("error:二手车车源列表页显示错误");
		}
		oldListSearchPage.Cancle().click();
		WaitUtil.sleep(2000);
	}

	// 二手车车源列表页，筛选"淘车认证"车源
	@Test(priority = 8, enabled = false)
	public void OrderByAuth() throws Exception {
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		try {
			oldCarListPage.AuthCar().click();
			WaitUtil.sleep(5000);
			Assert.assertTrue(oldCarListPage.AuthCar().isSelected());
			Assert.assertTrue(oldCarListPage.AuthMark().size() > 0);

			// 恢复筛选全部
			oldCarListPage.Bottom_all().click();
			WaitUtil.sleep(2000);
			Assert.assertFalse(oldCarListPage.AuthCar().isSelected());
			Log.info("Msg:淘车认证筛选执行成功");
			Reporter.log("Msg:淘车认证筛选执行成功");
		} catch (AssertionError e) {
			Log.error("error:淘车认证筛选执行失败");
			Reporter.log("error:淘车认证筛选执行失败");
		}
	}

	// 二手车车源列表页，根据排序-价格最低筛选车源
	@Test(priority = 9)
	public void OrderBySort() throws Exception {
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		// App_common app_common = new App_common();
		oldCarListPage.ImvSort().click();
		WaitUtil.sleep(2000);
		try {
			oldCarListPage.ByLowPrice().click();
			// app_common.swipeToUp(driver, 2000);
			List<WebElement> PriceList = oldCarListPage.price_list();
			// 得出下一条车源的价格大于前一条车源的价格·
			double Num1 = Double.parseDouble(Reg_Num.getNum(PriceList.get(0)
					.getText()));
			double Num2 = Double.parseDouble(Reg_Num.getNum(PriceList.get(1)
					.getText()));
			Assert.assertTrue(Num1 < Num2);
			Log.info("Msg:根据价格最低筛选车源查询成功");
			Reporter.log("Msg:根据价格最低筛选车源查询成功");
		} catch (AssertionError e) {
			Log.error("error:根据价格最低筛选车源查询失败" + e);
			Reporter.log("error:根据价格最低筛选车源查询失败" + e);
		}
	}

	// 二手车车源列表页，根据时间排序
	@Test(priority = 10, enabled = false)
	public void OrderByTime() throws Exception {
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		try {
			oldCarListPage.ImvSort().click();
			WaitUtil.sleep(2000);
			oldCarListPage.ByHighPrice().click();

			List<WebElement> PriceList = oldCarListPage.price_list();
			// 得出下一条车源的价格大于前一条车源的价格·
			double Num1 = Double.parseDouble(Reg_Num.getNum(PriceList.get(0)
					.getText()));
			double Num2 = Double.parseDouble(Reg_Num.getNum(PriceList.get(1)
					.getText()));
			Assert.assertTrue(Num1 > Num2);
			Log.info("Msg:根据价格最低筛选车源查询成功");
			Reporter.log("Msg:根据价格最低筛选车源查询成功");
		} catch (AssertionError e) {
			Log.error("error:根据价格最低筛选车源查询失败" + e);
			Reporter.log("error:根据价格最低筛选车源查询失败" + e);
		}
	}
}
