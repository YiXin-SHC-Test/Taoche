package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class CollectionPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public CollectionPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回收藏页标题
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.Title"));
		return element;
	}

	// 返回收藏页返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.BackBtn"));
		return element;
	}

	// 返回收藏页 车源列表上方标题
	public WebElement CarList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.CarList"));
		return element;
	}

	// 返回收藏页 经销商上方标题
	public WebElement DealerList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DealerList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.DealerList"));
		return element;
	}
}
