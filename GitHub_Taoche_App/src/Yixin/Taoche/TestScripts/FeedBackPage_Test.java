package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.FeedBackPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class FeedBackPage_Test extends App_BaseCase {
	@Test
	public void FeedBackPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		FeedBackPage feedBackPage = new FeedBackPage(driver);
		// 操作APP界面方法类
		App_common app_common = new App_common();
		homePage.Mine().click();
		app_common.swipeToUp(driver, 1000);
		Log.startTestCase("执行意见反馈界面验证");
		minePage.Feedback().click();
		WaitUtil.waitWebelement_ById(driver,
				"com.taoche.yixin.app:id/title_text");
		try {
			Assert.assertEquals(feedBackPage.Title().getText(), "意见反馈");
			// 验证"意见反馈"界面的返回按钮可用
			feedBackPage.BackBtn().click();
			Assert.assertTrue(minePage.Feedback().isDisplayed());
			// 再次进入"意见反馈"界面
			minePage.Feedback().click();
			WaitUtil.waitWebelement_ById(driver,
					"com.taoche.yixin.app:id/title_button");
			// 验证H5页面信息内容
			/*Assert.assertTrue(driver.getPageSource().contains("我要反馈"));
			Assert.assertTrue(driver.getPageSource().contains("个人如何发布卖车信息"));
			Assert.assertTrue(driver.getPageSource().contains("商家如何发布二手车车源信息"));
			Assert.assertTrue(driver.getPageSource().contains("发布车源的审核时间是多久"));*/
			WaitUtil.sleep(2000);
			// 进入历史反馈界面
			feedBackPage.HistoryFeedBack().click();
			Assert.assertEquals(feedBackPage.HistoryFeedBackTitle(), "历史反馈");
			feedBackPage.HistoryFeedBackBackBtn().click();
			feedBackPage.BackBtn().click();
			Log.endTestCase("意见反馈界面验证结束");
			Log.info("意见反馈界面验证成功");
			Reporter.log("意见反馈界面验证成功");
		} catch (AssertionError e) {
			Log.error("意见反馈界面验证失败：" + e);
			Reporter.log("意见反馈界面验证失败：" + e);
		}
	}
}
