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
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class Collection_Test extends App_BaseCase {
	@Test(priority = 0)
	public void CollectionIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		CollectionPage collectionPage = new CollectionPage(driver);
		homePage.Oldcar().click();
		WaitUtil.sleep(2000);
		Log.startTestCase("执行收藏页面验证");
		oldCarListPage.Collection().click();
		try {
			Assert.assertEquals(collectionPage.Title().getText(), "我收藏的二手车");
			Assert.assertTrue(collectionPage.BackBtn().isEnabled());
			List<WebElement> CarList = collectionPage.CarList();
			if (CarList.size() > 0) {
				// 当收藏的车源列表里数据大于0时，编辑按钮显示
				Assert.assertTrue(collectionPage.EditBtn().isDisplayed());
			} else {
				// 否则显示"暂无车源收藏"
				Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
			}
			collectionPage.BackBtn().click();
			Log.info("收藏页面验证成功");
			Reporter.log("收藏页面验证成功");
		} catch (Exception e) {
			Log.error("收藏页面验证失败");
			Reporter.log("收藏页面验证失败");
		}
		Log.endTestCase("收藏页面验证结束");
	}

	@Test(priority = 1)
	public void CollectionEdit_Test() throws Exception {
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		CollectionPage collectionPage = new CollectionPage(driver);
		WaitUtil.sleep(2000);
		oldCarListPage.Collection().click();
		System.out.println(collectionPage.CarList().get(0).getText());
		if (collectionPage.CarList().size() > 0) {
			collectionPage.EditBtn().click();
			WaitUtil.sleep(3000);
			// 点击编辑按钮后，验证全选按钮盒单选按钮显示
			Assert.assertTrue(collectionPage.SelectAllBtn().isDisplayed());
			Assert.assertTrue(collectionPage.CheckBtn().isDisplayed());
			// 验证删除和取消按钮显示
			Assert.assertTrue(collectionPage.CancleBtn().isDisplayed());
			Assert.assertFalse(collectionPage.DeleteBtn().isEnabled());
			collectionPage.CancleBtn().click();
			// 点击取消按钮，验证显示出编辑按钮
			Assert.assertTrue(collectionPage.EditBtn().isDisplayed());
			// 点击编辑按钮，全选，执行删除操作
			collectionPage.EditBtn().click();
			WaitUtil.sleep(1000);
			collectionPage.SelectAllBtn().click();
			collectionPage.DeleteBtn().click();
			// 删除全部信息后，验证界面返回暂无车源信息
			Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
		} else {
			// 无车源时，界面显示暂无车源提示信息
			Assert.assertTrue(collectionPage.None_CarList().isDisplayed());
			// 返回列表页
			collectionPage.BackBtn().click();
			// 进入第一个详情，执行收藏操作
			// OldCarListPage oldCarListPage = new OldCarListPage(driver);
			// 进入列表中第一个车源
			oldCarListPage.image_list().get(0).click();

			CarDetailPage carDetailPage = new CarDetailPage(driver);
			// 获取该车的名称
			String CarName = carDetailPage.CarName().getText();
			// 执行收藏操作
			carDetailPage.CollectBtn().click();
			carDetailPage.BackBtn().click();
			WaitUtil.sleep(3000);
			oldCarListPage.Collection().click();
			String CarName_Collected = collectionPage.CarNameList().get(0)
					.getText();
			// 验证操作收藏的车源名称和车源列表里的一样
			Assert.assertEquals(CarName, CarName_Collected);
		}
	}

}
