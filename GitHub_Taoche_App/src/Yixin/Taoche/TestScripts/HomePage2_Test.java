package Yixin.Taoche.TestScripts;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.CouponPage;
import Yixin.Taoche.Pageobjects.EvaluatePage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.ListPage;
import Yixin.Taoche.Pageobjects.SaleCarPage;
import Yixin.Taoche.Pageobjects.SugarPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

// 首页默认定位北京，有淘车认证选项
public class HomePage2_Test extends App_BaseCase {
	public static Logger logger = Logger.getLogger(HomePage2_Test.class);
	App_common app_common = new App_common();
	// ListPage listPage = new ListPage(driver);
	Constant constant = new Constant();

	// 验证首页糖豆区域是否显示
	@Test(priority = 1)
	public void SugarBanner_Test() throws Exception {
		HomePage homePage = new HomePage(driver);

		try {
			if (homePage.CloseAd().isDisplayed()) {
				homePage.CloseAd().click(); // 如果启动APP时显示冲屏页广告，点击关闭按钮
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			homePage.Tab_oldcar().click(); // 当前默认定位在分期，点击切换到二手车Tab项下面
			try {
				Assert.assertTrue(homePage.SugarBanner().isDisplayed());
				Log.info("首页显示糖豆区域");
				Reporter.log("首页显示糖豆区域");
			} catch (AssertionError e) {
				Log.error("首页没显示糖豆区域");
				Reporter.log("首页显示糖豆区域");
			}
		}
	}

	// 验证首页新增糖豆跳转逻辑-帮您贷款
	@Test(priority = 2)
	public void Sugar_HelpCredit() throws Exception {
		HomePage homePage = new HomePage(driver);
		SugarPage sugarPage = new SugarPage(driver);
		try {
			if (homePage.Sugar_HelpCredit().isDisplayed()) {
				homePage.Sugar_HelpCredit().click();
				WaitUtil.sleep(3000);
				Assert.assertTrue(sugarPage.CouponPage_Title().isDisplayed());
				Assert.assertTrue(sugarPage.CouponPage_Back().isDisplayed());
				sugarPage.CouponPage_Back().click();
				Log.info("首页帮您贷款糖豆验证成功");
				Reporter.log("首页帮您贷款糖豆验证成功");
			}
		} catch (AssertionError e) {
			Log.error("首页帮您贷款糖豆验证失败:" + e);
			Reporter.log("首页帮您贷款糖豆验证失败:" + e);
		}
	}

	// 验证首页新增糖豆跳转逻辑-二手车估价
	@Test(priority = 3)
	public void Sugar_Evaluate() throws Exception {
		HomePage homePage = new HomePage(driver);
		EvaluatePage evaluatePage = new EvaluatePage(driver);
		try {
			if (homePage.Sugar_Evaluate().isDisplayed()) {
				homePage.Sugar_Evaluate().click();
				WaitUtil.sleep(3000);
				Assert.assertTrue(evaluatePage.Imv_buy().isDisplayed());
				Assert.assertTrue(evaluatePage.Submit().isEnabled());
				evaluatePage.BackBtn().click();
				Log.info("首页二手车估价糖豆验证成功");
				Reporter.log("首页二手车估价糖豆验证成功");
			}
		} catch (AssertionError e) {
			Log.error("首页二手车估价糖豆验证失败：" + e);
			Reporter.log("首页二手车估价糖豆验证失败：" + e);
		}
	}

	// 验证首页新增糖豆跳转逻辑-二手车估价
	@Test(priority = 4)
	public void Sugar_SaleCar() throws Exception {
		HomePage homePage = new HomePage(driver);
		SaleCarPage saleCarPage = new SaleCarPage(driver);
		try {
			if (homePage.Sugar_SaleCar().isDisplayed()) {
				homePage.Sugar_SaleCar().click();
				WaitUtil.sleep(5000);
				Assert.assertTrue(saleCarPage.Title().isDisplayed());
				Assert.assertTrue(saleCarPage.BackBtn().isEnabled());
				saleCarPage.BackBtn().click();
				Log.info("首页高价卖车糖豆验证成功");
				Reporter.log("首页高价卖车糖豆验证成功");
			}
		} catch (AssertionError e) {
			Log.error("首页高价卖车糖豆验证失败：" + e);
			Reporter.log("首页高价卖车糖豆验证失败：" + e);
		}
	}

	// 验证首页新增糖豆跳转逻辑-领券中心
	@Test(priority = 5)
	public void Sugar_Coupon() throws Exception {
		HomePage homePage = new HomePage(driver);
		CouponPage couponPage = new CouponPage(driver);
		try {
			if (homePage.Sugar_Coupon().isDisplayed()) {
				homePage.Sugar_Coupon().click();
				WaitUtil.sleep(3000);
				Assert.assertTrue(couponPage.Title().isDisplayed());
				Assert.assertTrue(couponPage.BackBtn().isEnabled());
				couponPage.BackBtn().click();
				Log.info("首页领券中心糖豆验证成功");
				Reporter.log("首页领券中心糖豆验证成功");
			}
		} catch (AssertionError e) {
			Log.error("首页领券中心糖豆验证失败：" + e);
			Reporter.log("首页领券中心糖豆验证失败： " + e);
		}
	}

	// 测试首页点击每个品牌跳转页面
	@Test(priority = 6)
	public void Index_PinPai() throws Exception {
		Log.startTestCase("启动APP");
		Log.startTestCase("进入APP首页");
		// 遍历首页品牌信息，分别点击每个品牌验证跳转界面是否正确
		for (int i = 0; i < constant.Pinpai.length; i++) {
			ListPage listPage = new ListPage(driver);
			driver.findElement(
					By.xpath("//android.widget.TextView[@text=" + "'"
							+ constant.Pinpai[i] + "'" + "]")).click();
			//System.out.println("当前定位的元素是:" + constant.Pinpai[i]);
			WaitUtil.sleep(3000);
			try {
				System.out.println("当前定位的元素是:" + constant.Pinpai[i]);
				// 当点击"更多"时，跳转到的是品牌筛选页面
				if (constant.Pinpai[i] == "更多") {
					//listPage.HotBrand();
					// 如果点击的是"更多"则进入品牌筛选
					Assert.assertTrue(listPage.HotBrand().isDisplayed());
					listPage.Close_Brand().click();
					WaitUtil.sleep(2000);
					listPage.BackBtn().click();
				} else {
					WebElement checkedItem = driver.findElement(By
							.xpath("//android.widget.TextView[contains(@text, "
									+ "'" + constant.Pinpai[i] + "'" + ")]"));
					WaitUtil.sleep(3000);
					Assert.assertTrue(listPage.Page_list().size() > 0);
					Assert.assertTrue(checkedItem.isDisplayed());
					listPage.BackBtn().click();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			// listPage.BackBtn().click();
		}
	}

	// 测试首页点击快速搜索时，跳转界面
	@Test(priority = 7)
	public void QuickSearch() throws Exception {
		//app_common.swipeToUp(driver, 2000);
		for (int i = 0; i < constant.QuickSearch.length; i++) {
			driver.findElement(
					By.xpath("//android.widget.TextView[@text=" + "'"
							+ constant.QuickSearch[i] + "'" + "]")).click();
			System.out.println("当前定位的元素是:" + constant.QuickSearch[i]);
			WaitUtil.sleep(3000);
			try {
				WebElement checkedItem = driver.findElement(By
						.xpath("//android.widget.TextView[contains(@text, "
								+ "'" + constant.QuickSearch[i] + "'" + ")]"));
				WaitUtil.sleep(3000);
				System.out.println("当前定位的元素是:" + constant.QuickSearch[i]);
				Assert.assertTrue(checkedItem.isDisplayed());
			} catch (Exception e) {
				e.printStackTrace();
			}
			ListPage listPage = new ListPage(driver);
			listPage.BackBtn().click();
		}
	}

	// 点击跟多筛选条件
	@Test(priority = 8)
	public void MoreSearch() throws Exception {
		HomePage homePage = new HomePage(driver);
		ListPage listPage = new ListPage(driver);
		homePage.MoreSearch().click();
		Assert.assertTrue(listPage.HotCommend().isEnabled());
		Assert.assertTrue(listPage.Quality().isEnabled());
		Assert.assertTrue(listPage.Done_btn().isEnabled());
		listPage.Done_btn().click(); // 关闭更多筛选条件的界面
	}

	// 超值二手车
	// 淘车认证车
	@Test(priority = 9)
	public void AuthorCar_OldCar() throws Exception {
		HomePage homePage = new HomePage(driver);
		ListPage listPage = new ListPage(driver);
		if (homePage.Location().getText() == "北京") {
			for (int i = 0; i < 10; i++) {
				app_common.swipeToUp(driver, 2000);
				WaitUtil.sleep(1000);
				if (homePage.AuthorCar_OldCar().isDisplayed()) {
					break;
				}
			}
			homePage.AuthorCar_OldCar().click();
			WaitUtil.sleep(2000);
			listPage.BackBtn().click();
		}
	}

	// 超值二手车 品牌认证车
	@Test(priority = 10)
	public void BrandCar() throws Exception {
		ListPage listPage = new ListPage(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='品牌认证车']"))
				.click();
		WaitUtil.sleep(2000);
		listPage.BackBtn().click();
	}

	// 超值二手车 准新车
	@Test(priority = 11)
	public void NewCar() throws Exception {
		ListPage listPage = new ListPage(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='准新车']"))
				.click();
		WaitUtil.sleep(2000);
		listPage.BackBtn().click();
	}

	// 猜你喜欢
	@Test(priority = 12)
	public void Favourite() throws Exception {
		for (int i = 0; i < 10; i++) {
			app_common.swipeToUp(driver, 2000);
			WaitUtil.sleep(1000);
			HomePage homePage = new HomePage(driver);
			if (homePage.Favourite().isDisplayed()) {
				break;
			}
		}
		List<WebElement> Pics = driver.findElements(By
				.id("com.taoche.yixin.app:id/imv_car_image"));
		Assert.assertTrue(Pics.size() > 0);
	}
}
