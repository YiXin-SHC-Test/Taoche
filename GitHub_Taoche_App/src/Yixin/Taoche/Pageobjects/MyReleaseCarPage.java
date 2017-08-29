package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class MyReleaseCarPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public MyReleaseCarPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回发布二手车页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MyReleaseCarPage.Title"));
		return element;
	}

	// 返回发布二手车页面返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MyReleaseCarPage.BackBtn"));
		return element;
	}

	// 返回发布二手车页面同步按钮
	public WebElement SynchroBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SynchroBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MyReleaseCarPage.SynchroBtn"));
		return element;
	}

	// 返回发布二手车页面立即发布车源按钮
	public WebElement NowReleaseBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NowReleaseBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MyReleaseCarPage.NowReleaseBtn"));
		return element;
	}

	// 返回发布二手车页面"暂未发布车源"信息
	public WebElement NoCarMsg() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoCarMsg的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MyReleaseCarPage.NoCarMsg"));
		return element;
	}
}
