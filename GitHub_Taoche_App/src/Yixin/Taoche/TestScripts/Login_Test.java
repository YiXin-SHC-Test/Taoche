package Yixin.Taoche.TestScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Yixin.Taoche.Modules.App_BaseCase;
import Yixin.Taoche.Modules.Login_BaseCase;
import Yixin.Taoche.Util.Constant;
import Yixin.Taoche.Util.Log;

public class Login_Test extends App_BaseCase {
	public static Logger logger = Logger.getLogger(Startup_Test.class);

	@Test
	public void Login() throws Exception {
		Log.startTestCase("启动APP");
		Log.startTestCase("进入APP首页");
		Login_BaseCase.execute(driver, Constant.UserName, Constant.Password);
		Assert.assertTrue(driver.getPageSource().contains("易鑫用户"));
	}
}
