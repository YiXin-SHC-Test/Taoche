package Yixin.Taoche.TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.EvaluatePage;
import Yixin.Taoche.Pageobjects.EvaluateResultPage;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class Evaluate_Test extends App_BaseCase {

	// 先进入二手车车源列表页，再进入车辆估计界面

	@Test(priority = 0)
	public void EvaluatePage_Test() throws Exception {
		Log.startTestCase("验证估车界面");
		HomePage homePage = new HomePage(driver);
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		try {
			homePage.Oldcar().click();
			WaitUtil.sleep(2000);
			oldCarListPage.Evaluate().click();

			EvaluatePage evaluatePage = new EvaluatePage(driver);
			Assert.assertTrue(evaluatePage.Title().isDisplayed());
			Assert.assertTrue(evaluatePage.BackBtn().isEnabled());
			Assert.assertEquals(evaluatePage.txtHasCount().getText(), "实时精准报价");
			Assert.assertTrue(evaluatePage.txtPercent().isDisplayed());
			//Assert.assertTrue(evaluatePage.Imv_buy().isEnabled());
			Assert.assertTrue(evaluatePage.Imv_sale().isEnabled());
			Assert.assertTrue(evaluatePage.Car_type().isEnabled());
			Assert.assertTrue(evaluatePage.CarDate().isEnabled());
			Assert.assertTrue(evaluatePage.Kilometer().isEnabled());
			Assert.assertTrue(evaluatePage.Submit().isEnabled());
			Log.endTestCase("估车界面验证通过");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void Evaluate_execute_Test() throws Exception {
		// 默认是车主选项
		EvaluatePage evaluatePage = new EvaluatePage(driver);
		EvaluateResultPage evaluateResultPage = new EvaluateResultPage(driver);
		Log.startTestCase("执行测试行情评估");
		evaluatePage.Car_type().click();
		WaitUtil.sleep(2000);
		evaluatePage.Select_Brand().click();
		//System.out.println(driver.get);

		//driver.switchTo().activeElement();
		evaluatePage.Select_BrandType().click();
		evaluatePage.Select_Car().click();

		evaluatePage.CarDate().click();
		evaluatePage.TimeSure().click();

		evaluatePage.Kilometer().sendKeys("1");
		evaluatePage.Submit().click();

		WaitUtil.sleep(3000);

		Assert.assertEquals(evaluateResultPage.Title().getText(), "卖家评估");
		Assert.assertTrue(evaluateResultPage.CarResult().isDisplayed());
		Assert.assertTrue(evaluateResultPage.MsgResult().isDisplayed());
	}
}
