package Yixin.Taoche.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Pageobjects.OldCarListPage;
import Yixin.Taoche.Pageobjects.SelectCityPage;
import Yixin.Taoche.Util.Log;
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
		Log.endTestCase("二手车列表页验证完成");
	}

	// 操作二手车列表页位置元素
	@Test
	public void Select_Location() throws Exception {
		Log.startTestCase("二手车列表页选择区域操作");
		OldCarListPage oldCarListPage = new OldCarListPage(driver);
		SelectCityPage selectCityPage = new SelectCityPage(driver);
		oldCarListPage.Location().click();
		Assert.assertTrue(selectCityPage.Beijing().isDisplayed());
		Assert.assertEquals(selectCityPage.Title(), "城市");
	}
}
