package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class CarDetailPage {
	private WebElement element = null;
	private List<WebElement> elements = null;

	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public CarDetailPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回详情页中的返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于backbtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.backbtn"));
		return element;
	}

	// 返回详情页中的收藏按钮
	public WebElement CollectBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于collectbtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.collectbtn"));
		return element;
	}

	// 返回详情页中的分享按钮
	public WebElement ShareBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于sharebtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.sharebtn"));
		return element;
	}

	// 返回详情页中的车源图片
	public WebElement Gallery_image() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于gallery_image的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.gallery_image"));
		return element;
	}

	// 返回详情页中的车源名称
	public WebElement CarName() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于carname的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.carname"));
		return element;
	}

	// 返回详情页中的车源信息
	public WebElement CarMsg() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于carmsg的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.carmsg"));
		return element;
	}

	// 返回详情页中的车源价格
	public WebElement Price() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于price的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CarDetailPage.price"));
		return element;
	}
}
