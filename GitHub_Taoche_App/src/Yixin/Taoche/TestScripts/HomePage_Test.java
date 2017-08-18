package Yixin.Taoche.TestScripts;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.ListPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

// 首页默认定位北京，有淘车认证选项
public class HomePage_Test extends App_BaseCase {
	public static Logger logger = Logger.getLogger(HomePage_Test.class);
	App_common app_common = new App_common();
	// ListPage listPage = new ListPage(driver);
	Constant constant = new Constant();

	// 测试首页点击每个品牌跳转页面
	@Test(priority = 0)
	public void Index_PinPai() throws Exception {
		Log.startTestCase("启动APP");
		Log.startTestCase("进入APP首页");
		// 遍历首页品牌信息，分别点击每个品牌验证跳转界面是否正确
		for (int i = 0; i < constant.Pinpai.length; i++) {
			ListPage listPage = new ListPage(driver);
			driver.findElement(
					By.xpath("//android.widget.TextView[@text=" + "'"
							+ constant.Pinpai[i] + "'" + "]")).click();
			System.out.println("当前定位的元素是:" + constant.Pinpai[i]);
			WaitUtil.sleep(3000);
			try {
				System.out.println("当前定位的元素是:" + constant.Pinpai[i]);
				// 当点击"更多"时，跳转到的是品牌筛选页面
				if (constant.Pinpai[i] == "更多") {
					listPage.HotBrand();
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
	@Test(priority = 1)
	public void QuickSearch() throws Exception {
		app_common.swipeToUp(driver, 2000);
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
	@Test(priority = 2)
	public void MoreSearch() throws Exception {
		HomePage homePage = new HomePage(driver);
		ListPage listPage = new ListPage(driver);
		homePage.MoreSearch().click();
		Assert.assertTrue(listPage.HotCommend().isEnabled());
		Assert.assertTrue(listPage.Quality().isEnabled());
		Assert.assertTrue(listPage.Done_btn().isEnabled());
	}

	// 超值二手车
	// 淘车认证车
	@Test(priority = 3)
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
	@Test(priority = 4)
	public void BrandCar() throws Exception {
		ListPage listPage = new ListPage(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='品牌认证车']"))
				.click();
		WaitUtil.sleep(2000);
		listPage.BackBtn().click();
	}

	// 超值二手车 准新车
	@Test(priority = 5)
	public void NewCar() throws Exception {
		ListPage listPage = new ListPage(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='准新车']"))
				.click();
		WaitUtil.sleep(2000);
		listPage.BackBtn().click();
	}

	// 猜你喜欢
	@Test(priority = 6)
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
