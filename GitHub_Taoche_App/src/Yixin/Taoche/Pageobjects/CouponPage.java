package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class CouponPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public CouponPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回糖豆领券中心页面标题
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HelpCredit_Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_CouponPage.Title"));
		return element;
	}

	// 返回糖豆领券中心返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HelpCredit_Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_CouponPage.Back"));
		return element;
	}
}
