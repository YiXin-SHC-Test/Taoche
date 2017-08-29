package Yixin.Taoche.TestScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.CarDetailPage;
import Yixin.Taoche.Pageobjects.CollectionPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class Collection_Test extends App_BaseCase {
	@Test(priority = 0)
	public void CollectionIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		CollectionPage collectionPage = new CollectionPage(driver);
		homePage.Mine().click();
		minePage.Collect().click();
		try {
			Assert.assertTrue(collectionPage.Title().isDisplayed());
			Assert.assertTrue(collectionPage.BackBtn().isEnabled());
			if (collectionPage.CarList().size() > 0) {
				Assert.assertTrue(driver.getPageSource().contains("编辑"));
			} else {
				Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
			}
			collectionPage.BackBtn().click();
			Log.info("收藏页面验证成功");
			Reporter.log("收藏页面验证成功");
		} catch (AssertionError e) {
			Log.error("收藏页面验证失败：" + e);
			Reporter.log("收藏页面验证失败：" + e);
		}
	}

	@Test(priority = 1)
	public void CollectionEdit_Test() throws Exception {
		CollectionPage collectionPage = new CollectionPage(driver);
		MinePage minePage = new MinePage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		minePage.Collect().click();
		WaitUtil.sleep(1000);
		Log.startTestCase("开始执行收藏页编辑操作");
		try {
			// 如果收藏列表中车源数量大于1，点击编辑按钮
			if (collectionPage.CarList().size() > 1) {
				collectionPage.EditBtn().click();
				// 界面显示全选按钮和选择框
				Assert.assertTrue(collectionPage.SelectAllBtn().isDisplayed());
				Assert.assertTrue(collectionPage.CancelBtn().isDisplayed());
				Assert.assertTrue(collectionPage.DeleteBtn().isDisplayed());
				WaitUtil.sleep(1000);
				// 点击取消按钮
				collectionPage.CancelBtn().click();
				collectionPage.BackBtn().click();
				Assert.assertTrue(collectionPage.EditBtn().isDisplayed());
				minePage.Collect().click();
				// 点击编辑按钮，选择第一条数据执行删除操作
				collectionPage.EditBtn().click();
				collectionPage.CheckBtn().get(0).click();
				collectionPage.DeleteBtn().click();
				Assert.assertTrue(collectionPage.EditBtn().isDisplayed());

			} else if (collectionPage.CarList().size() == 1) {
				// 列表中只有一条数据时，通过全选执行删除
				collectionPage.EditBtn().click();
				// 界面显示全选按钮和选择框
				Assert.assertTrue(collectionPage.SelectAllBtn().isDisplayed());
				Assert.assertTrue(collectionPage.CancelBtn().isDisplayed());
				Assert.assertTrue(collectionPage.DeleteBtn().isDisplayed());
				// 点击全选按钮，界面返回"全不选"按钮
				collectionPage.SelectAllBtn().click();
				Assert.assertTrue(collectionPage.NoSelectBtn().isDisplayed());
				// 点击删除按钮
				collectionPage.DeleteBtn().click();
				// 界面返回暂无车源收藏
				Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
			} else {
				// 收藏界面中无数据信息，去列表中选择一个车源执行收藏操作
				collectionPage.BackBtn().click();
				minePage.OldCar().click();
				WaitUtil.waitWebelement_ById(driver,
						"com.taoche.yixin.app:id/imv_car_image_list");
				// 进入列表中第一条数据信息
				oldCarListPage.image_list().get(0).click();
				WaitUtil.sleep(2000);
				CarDetailPage carDetailPage = new CarDetailPage(driver);
				// 执行收藏操作
				carDetailPage.CollectBtn().click();
				carDetailPage.BackBtn().click();
				// 回到收藏页面执行验证
				oldCarListPage.Mine().click();
				minePage.Collect().click();
				// 验证收藏页面有数据
				Assert.assertTrue(collectionPage.CarList().size() > 0);
				// 执行删除操作
				collectionPage.EditBtn().click();
				collectionPage.SelectAllBtn().click();
				collectionPage.DeleteBtn().click();
				// 验证界面中无数据信息
				Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
				Log.endTestCase("收藏页编辑操作执行结束");
				Reporter.log("收藏页编辑操作执行结束");
			}
		} catch (AssertionError e) {
			Log.error("收藏页面验证失败：" + e);
			Reporter.log("收藏页面验证失败：" + e);
		}
	}
}
