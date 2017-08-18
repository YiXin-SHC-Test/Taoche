package Yixin.Taoche.TestScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Pageobjects.HomePage;
import Yixin.Taoche.Util.Log;
import Yixin.Taoche.Util.WaitUtil;

public class Startup_Test extends App_BaseCase {

	public static Logger logger = Logger.getLogger(Startup_Test.class);

	@Test
	public void Test_Startup() throws Exception {
		Log.startTestCase("启动APP");
		Log.startTestCase("进入APP首页");
		WaitUtil.sleep(2000);
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(driver.getPageSource().contains("请输入品牌或车型"));
		Assert.assertTrue(homePage.Location().isEnabled());
		Assert.assertTrue(homePage.Mine().isEnabled());
		Assert.assertTrue(homePage.MoreSearch().isEnabled());
		Assert.assertTrue(homePage.Oldcar().isEnabled());

		Log.endTestCase("进入APP首页");
	}
}
