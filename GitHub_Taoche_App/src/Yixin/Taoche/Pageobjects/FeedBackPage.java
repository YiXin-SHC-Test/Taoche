package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class FeedBackPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public FeedBackPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回同步车源页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.FeedbackPage.Title"));
		return element;
	}

	// 返回同步车源页面返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.FeedbackPage.BackBtn"));
		return element;
	}

	// 返回同步车源页面历史反馈按钮
	public WebElement HistoryFeedBack() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HistoryFeedBack的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.FeedbackPage.HistoryFeedBack"));
		return element;
	}
}
