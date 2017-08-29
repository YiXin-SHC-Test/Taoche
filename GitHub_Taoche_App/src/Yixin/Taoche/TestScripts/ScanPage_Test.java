package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.CarDetailPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Pageobjects.ScanPage;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class ScanPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void ScanPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		ScanPage scanPage = new ScanPage(driver);
		Log.startTestCase("执行验证我浏览的二手车页面用例");
		homePage.Mine().click();
		WaitUtil.sleep(1000);
		try {
			minePage.Scan().click();
			// 验证跳转的页面正确
			Assert.assertEquals(scanPage.Title().getText(), "我浏览的二手车");
			// 验证返回按钮可用
			scanPage.BackBtn().click();
			Assert.assertTrue(minePage.Scan().isDisplayed());
			WaitUtil.sleep(2000);
			minePage.Scan().click();

			if (driver.getPageSource().contains("编辑")) {
				// 编辑按钮显示，证明列表中有数据
				Assert.assertTrue(scanPage.ItemList().size() >= 1);
				scanPage.EditBtn().click();
				// 点击了编辑按钮后，验证显示删除和取消按钮
				Assert.assertTrue(scanPage.DeleteBtn().isDisplayed());
				Assert.assertTrue(scanPage.CancelBtn().isDisplayed());
				Assert.assertTrue(scanPage.SelectAllBtn().isDisplayed());
				Assert.assertTrue(scanPage.DeleteIconList().size() >= 1);
				// 点击取消按钮后，验证界面显示"编辑"按钮
				scanPage.CancelBtn().click();
				Assert.assertTrue(scanPage.EditBtn().isDisplayed());
				// 验证返回按钮可用，最后回到"我的"页面
				scanPage.BackBtn().click();
				Log.endTestCase("我浏览的二手车页面验证成功");
				Reporter.log("我浏览的二手车页面验证成功");
			} else {
				// 列表中没有数据时，返回默认提示信息
				Assert.assertEquals(scanPage.EmptyMsg().getText(), "暂无浏览记录");
				// 验证返回按钮可用，最后回到"我的"页面
				scanPage.BackBtn().click();
				Assert.assertTrue(minePage.Scan().isDisplayed());
				Log.endTestCase("我浏览的二手车页面验证成功");
				Reporter.log("我浏览的二手车页面验证成功");
			}
		} catch (AssertionError e) {
			Log.error("我浏览的二手车页面验证失败：" + e);
			Reporter.log("我浏览的二手车页面验证失败：" + e);
		}
	}

	@Test(priority = 1)
	public void ScanPageDelete_Test() throws Exception {
		// HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		ScanPage scanPage = new ScanPage(driver);
		Log.startTestCase("执行验证我浏览的二手车页面用例");
		// 进入到我浏览的二手车页面
		minePage.Scan().click();
		WaitUtil.sleep(1000);

		try {
			// 如果列表中有已浏览的车源信息，则选取第一个执行删除操作
			if (scanPage.CarImageList().size() > 1) {
				// 进入浏览二手车界面后点击右上角的编辑按钮
				scanPage.EditBtn().click();
				scanPage.DeleteIconList().get(0).click();
				scanPage.DeleteBtn().click();
				// 如果列表中车源大于1辆，删除完一项后，列表中数据仍大于0
				Assert.assertTrue(scanPage.CarImageList().size() > 0);
				WaitUtil.sleep(2000);
				scanPage.BackBtn().click();
				Log.endTestCase("浏览的二手车界面编辑功能验证成功");
				Reporter.log("浏览的二手车界面编辑功能验证成功");
				// 浏览二手车界面只有1个车源信息
			} else if (scanPage.CarImageList().size() == 1) {
				// 进入浏览二手车界面后点击右上角的编辑按钮
				scanPage.EditBtn().click();
				scanPage.DeleteIconList().get(0).click();
				scanPage.DeleteBtn().click();
				WaitUtil.sleep(2000);
				// 点击删除按钮后，验证列表返回空
				Assert.assertTrue(scanPage.EmptyMsg().isDisplayed());
				Log.endTestCase("浏览的二手车界面编辑功能验证成功");
				Reporter.log("浏览的二手车界面编辑功能验证成功");
			} else {
				// 列表里为空，去浏览一个车源后返回该界面执行删除操作
				OldCarListPage oldCarListPage = new OldCarListPage(driver);
				scanPage.BackBtn().click();
				minePage.OldCar().click();
				// 等到列表中车源图片加载出来再执行相关操作
				WaitUtil.waitWebelement_ById(driver,
						"com.taoche.yixin.app:id/imv_car_image_list");
				WaitUtil.sleep(2000);

				// 进入详情页
				oldCarListPage.image_list().get(0).click();

				WaitUtil.sleep(2000);
				CarDetailPage carDetailPage = new CarDetailPage(driver);
				// 验证详情页中，返回按钮已经加载出来
				WaitUtil.waitWebelement_ById(driver,
						"com.taoche.yixin.app:id/base_title_iv_left_back");
				// 退出详情页，去我的界面重新进入浏览的二手车界面
				carDetailPage.BackBtn().click();
				oldCarListPage.Mine().click();
				minePage.Scan().click();
				WaitUtil.sleep(2000);
				scanPage.EditBtn().click();
				// 列表中只有一个车源，通过全选按钮执行删除
				scanPage.SelectAllBtn().click();
				// 断言勾选了全选后，按钮变成了"全不选"
				Assert.assertTrue(scanPage.NoSelectBtn().isDisplayed());
				// 执行删除操作后，界面里返回空列表信息
				scanPage.DeleteBtn().click();
				Assert.assertTrue(scanPage.EmptyMsg().isDisplayed());
				Log.endTestCase("浏览的二手车界面编辑功能验证成功");
				Reporter.log("浏览的二手车界面编辑功能验证成功");
			}
		} catch (AssertionError e) {
			Log.error("浏览的二手车界面编辑功能验证失败：" + e);
			Reporter.log("浏览的二手车界面编辑功能验证失败：" + e);
		}
	}
}
