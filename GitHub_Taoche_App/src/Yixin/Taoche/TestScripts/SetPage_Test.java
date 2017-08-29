package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.AboutUsPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.SetPage;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class SetPage_Test extends App_BaseCase {
	@Test
	public void SetPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		SetPage setPage = new SetPage(driver);
		homePage.Mine().click();
		WaitUtil.sleep(1000);
		try {
			minePage.SetBtn().click();
			setPage.BackBtn().click();
			WaitUtil.sleep(2000);
			// 验证返回按钮可用
			Assert.assertEquals(minePage.Title().getText(), "我的");
			minePage.SetBtn().click();
			// 验证界面Title显示正确
			Assert.assertEquals(setPage.Title().getText(), "设置");
			setPage.CleanCache().click();
			// 验证清除缓存的确认和取消按钮可用
			Assert.assertTrue(setPage.VerifyClean().isEnabled());
			Assert.assertTrue(setPage.NoClean().isEnabled());
			setPage.NoClean().click();
			// 验证检查更新按钮可用
			Assert.assertTrue(setPage.Update().isEnabled());
			// 验证当前版本显示
			Assert.assertTrue(setPage.CurrentVersion().isDisplayed());
			// 验证当前版本是4.1.1
			Assert.assertEquals(setPage.GetVersion().getText(),
					Constant.CurrentVersion);
			// 点击分享按钮
			setPage.Share().click();
			WaitUtil.sleep(2000);
			// 验证分享弹出层的Title
			Assert.assertEquals(setPage.ShareBoxTitle().getText(), "选择要分享到的平台");
			setPage.CancelShare().click();
			// 验证关于我们按钮可用
			setPage.About().click();
			AboutUsPage aboutUsPage = new AboutUsPage(driver);
			// 点击关于按钮之后，界面跳转到关于我们界面
			Assert.assertEquals(aboutUsPage.Title().getText(), "关于我们");
			aboutUsPage.BackBtn().click();

			if (setPage.Exit().isDisplayed()) {
				System.out.println("退出");
				setPage.Exit().click();
				WaitUtil.sleep(2000);
				// 验证退出成功
				Assert.assertEquals(minePage.Please_login().getText(), "请登录");
			} else {
				setPage.BackBtn().click();
				WaitUtil.sleep(2000);
				// 验证未登录状态下，返回我的页面
				Assert.assertEquals(minePage.Please_login().getText(), "请登录");
			}

			Log.info("设置界面验证成功");
			Reporter.log("设置界面验证成功");
		} catch (AssertionError e) {
			Log.error("设置界面验证失败:" + e);
			Reporter.log("设置界面验证失败:" + e);
		}
	}
}
