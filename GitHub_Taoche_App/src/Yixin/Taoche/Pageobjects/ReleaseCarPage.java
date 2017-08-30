package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class ReleaseCarPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public ReleaseCarPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回同步车源页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Title"));
		return element;
	}

	// 返回同步车源页面BackBtn
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.BackBtn"));
		return element;
	}

	// 返回同步车源页面Photo1
	public WebElement Photo1() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo1的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo1"));
		return element;
	}

	// 返回同步车源页面Photo2
	public WebElement Photo2() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo2的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo2"));
		return element;
	}

	// 返回同步车源页面Photo3
	public WebElement Photo3() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo3的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo3"));
		return element;
	}

	// 返回同步车源页面Photo4
	public WebElement Photo4() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo4的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo4"));
		return element;
	}

	// 返回同步车源页面Photo5
	public WebElement Photo5() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo5的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo5"));
		return element;
	}

	// 返回同步车源页面Photo6
	public WebElement Photo6() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Photo6的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.Photo6"));
		return element;
	}

	// 返回同步车源页面"下一步"按钮
	public WebElement NextBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NextBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.NextBtn"));
		return element;
	}

	// 返回同步车源页面"进入拍照"按钮
	public WebElement TakePhoto() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于TakePhoto的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.TakePhoto"));
		return element;
	}

	// 返回同步车源页面"进入相册"按钮
	public WebElement PhotoFromPhone() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于PhotoFromPhone的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SaleCarPage.PhotoFromPhone"));
		return element;
	}
}
