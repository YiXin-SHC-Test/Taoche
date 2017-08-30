package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.MinePage;
import Yixin.Taoche.Pageobjects.MyReleaseCarPage;
import Yixin.Taoche.Pageobjects.ReleaseCarPage;
import Yixin.Taoche.Pageobjects.SynchroPage;
import Yixin.Taoche.Util.App_common;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class MyReleaseCarPage_Test extends App_BaseCase {
	@Test(priority = 0)
	public void MyReleaseCarPageIndex_Test() throws Exception {
		HomePage homePage = new HomePage(driver);
		MinePage minePage = new MinePage(driver);
		MyReleaseCarPage myReleaseCarPage = new MyReleaseCarPage(driver);
		homePage.Mine().click();
		Log.startTestCase("开始执行我发布的二手车界面元素验证");
		// 操作滑动页面类
		App_common app_common = new App_common();
		app_common.swipeToUp(driver, 1000);
		try {

			Assert.assertTrue(minePage.Release().isDisplayed());
			minePage.Release().click();
			// 断言界面中显示Title，同步车源，返回按钮，发布按钮
			Assert.assertTrue(myReleaseCarPage.SynchroBtn().isDisplayed());
			Assert.assertTrue(myReleaseCarPage.NowReleaseBtn().isDisplayed());
			Assert.assertTrue(myReleaseCarPage.Title().getText()
					.equals("我发布的二手车"));
			if (driver.getPageSource().contains("暂未")) {
				Assert.assertTrue(myReleaseCarPage.NoCarMsg().isDisplayed());
			} else {
				System.out.println("暂时没有数据");
			}
			Log.endTestCase("我发布的二手车界面验证结束");
			Log.info("我发布的二手车界面验证成功");
			Reporter.log("我发布的二手车界面元素验证成功");
		} catch (AssertionError e) {
			Log.error("我发布的二手车界面验证失败:" + e);
			Reporter.log("我发布的二手车界面验证失败:" + e);
		}
	}

	@Test(priority = 1)
	public void SynchroCarPage_Test() throws Exception {
		SynchroPage synchroPage = new SynchroPage(driver);
		MyReleaseCarPage myReleaseCarPage = new MyReleaseCarPage(driver);
		// 在"我发布的二手车"界面，点击"同步车源"按钮，验证同步车源界面
		Log.startTestCase("执行同步车源界面验证");
		myReleaseCarPage.SynchroBtn().click();
		try {
			// 验证界面中标题/返回按钮/手机输入框/验证码输入框/获取验证码按钮/提交按钮都正常显示
			Assert.assertTrue(synchroPage.Title().isDisplayed());
			Assert.assertTrue(synchroPage.BackBtn().isEnabled());
			Assert.assertTrue(synchroPage.PhoneText().isDisplayed());
			Assert.assertTrue(synchroPage.CheckCodeText().isDisplayed());
			Assert.assertTrue(synchroPage.CheckCodeBtn().isEnabled());
			Assert.assertTrue(synchroPage.SubmitBtn().isDisplayed());
			Log.endTestCase("同步车源界面元素验证结束");
			Log.info("同步车源界面验证成功");
			Reporter.log("同步车源界面元素验证成功");
		} catch (AssertionError e) {
			Log.error("同步车源界面验证失败" + e);
			Reporter.log("同步车源界面验证失败" + e);
		}
	}

	@Test(priority = 2)
	public void SynchroCarCheck_Test() throws Exception {
		SynchroPage synchroPage = new SynchroPage(driver);
		Log.startTestCase("执行同步车源页面逻辑验证");
		try {
			// 不输入手机号和验证码，直接点击提交按钮
			synchroPage.SubmitBtn().click();
			WaitUtil.sleep(1000);
			// 验证手机号不能为空 获取不到toast信息
			// Assert.assertEquals(driver.switchTo().alert().getText(),
			// "请输入手机号码");
			// 验证手机号格式不对
			synchroPage.PhoneText().sendKeys("13");
			synchroPage.SubmitBtn().click();
			// Assert.assertTrue("");
			// 输入正确的手机号，错误的验证码
			synchroPage.PhoneText().clear();
			// Constant.UserName
			synchroPage.PhoneText().sendKeys("");
			synchroPage.CheckCodeText().clear();
			synchroPage.CheckCodeText().sendKeys("123456");
			synchroPage.SubmitBtn().click();
			// 提示验证码不正确
			// Assert.assertTrue("");
			synchroPage.CheckCodeText().clear();
			// 点击获取验证码按钮
			synchroPage.CheckCodeBtn().click();
			WaitUtil.sleep(2000);
			// 验证发送验证码按钮不可用
			Assert.assertFalse(synchroPage.CheckCodeBtn().isEnabled());

			synchroPage.BackBtn().click();
			Log.info("同步车源页面逻辑验证成功");
			Reporter.log("同步车源页面逻辑验证成功");
		} catch (AssertionError e) {
			Log.error("同步车源页面逻辑验证失败：" + e);
			Reporter.log("同步车源页面逻辑验证失败：" + e);
		}
		Log.endTestCase("同步车源页面逻辑验证结束");
	}

	@Test(priority = 3)
	public void SaleCarPage_Test() throws Exception {
		MyReleaseCarPage myReleaseCarPage = new MyReleaseCarPage(driver);
		ReleaseCarPage releaseCarPage = new ReleaseCarPage(driver);
		Log.startTestCase("执行发布车源页面验证");
		try {
			if (myReleaseCarPage.NoCarMsg().isDisplayed()) {
				// 从我发布的二手车界面点击"立即发布车源"按钮进入"卖车"界面
				myReleaseCarPage.NowReleaseBtn().click();
				// 验证卖车界面标题/返回按钮/选择图片/下一步按钮都显示
				Assert.assertTrue(releaseCarPage.Title().isDisplayed());
				Assert.assertTrue(releaseCarPage.BackBtn().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo1().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo2().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo3().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo4().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo5().isEnabled());
				Assert.assertTrue(releaseCarPage.Photo6().isEnabled());
				Assert.assertFalse(releaseCarPage.NextBtn().isEnabled());
				Log.endTestCase("卖车界面元素验证结束");
				Log.info("卖车界面元素验证成功");
				Reporter.log("卖车界面元素验证成功");
			}
		} catch (AssertionError e) {
			Log.error("卖车界面元素验证失败" + e);
			Reporter.log("卖车界面元素验证失败" + e);
		}
	}

	@Test(priority = 4)
	public void SaleCar_Test() throws Exception {
		ReleaseCarPage releaseCarPage = new ReleaseCarPage(driver);
		releaseCarPage.Photo1().click();
		releaseCarPage.PhotoFromPhone().click();
		//
	}
}
