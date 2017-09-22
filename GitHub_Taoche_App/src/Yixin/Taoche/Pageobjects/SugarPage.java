package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class SugarPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public SugarPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回糖豆帮您贷款页面标题
	public WebElement HelpCredit_Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HelpCredit_Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_HelpCreditPage.Title"));
		return element;
	}

	// 返回糖豆帮您贷款页面返回按钮
	public WebElement HelpCredit_Back() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_HelpCreditPage.Back"));
		return element;
	}

	// 返回糖豆领券中心页面返回按钮
	public WebElement CouponPage_Back() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CouponPage_Back的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_CouponPage.Back"));
		return element;
	}

	// 返回糖豆领券中心页标题
	public WebElement CouponPage_Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CouponPage_Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.Sugar_CouponPage.Back"));
		return element;
	}
}
