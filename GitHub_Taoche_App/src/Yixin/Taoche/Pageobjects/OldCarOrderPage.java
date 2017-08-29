package Yixin.Taoche.Pageobjects;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class OldCarOrderPage {
	private WebElement element = null;
	private List<WebElement> elements = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public OldCarOrderPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回我的二手车订单界面的Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于please_login的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderPage.Title"));
		return element;
	}

	// 返回我的二手车订单界面的返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderPage.BackBtn"));
		return element;
	}

	// 返回订单列表的图片列表
	public List<WebElement> OrderPicList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderPicList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.OrderPicList"));
		return elements;
	}

	// 返回订单列表的车源名称列表
	public List<WebElement> OrderCarNameList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderCarNameList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.OrderCarNameList"));
		return elements;
	}

	// 返回订单列表的订单状态列表
	public List<WebElement> OrderStatusList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderStatusList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.OrderStatusList"));
		return elements;
	}

	// 返回订单列表的订单价格列表
	public List<WebElement> OrderCarPriceList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderCarPriceList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.OrderCarPriceList"));
		return elements;
	}

	// 返回订单列表的订单车源里程列表
	public List<WebElement> MileageList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于MileageList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.MileageList"));
		return elements;
	}

	// 返回我的二手车订单界面的删除按钮
	public List<WebElement> DeleteBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DeleteBtn的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarOrderPage.DeleteBtn"));
		return elements;
	}

	// 返回我的二手车订单界面的确认删除按钮
	public WebElement MakeDelete() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于MakeDelete的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderPage.MakeDelete"));
		return element;
	}

	// 返回我的二手车订单界面的暂不删除按钮
	public WebElement NoDelete() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoDelete的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderPage.NoDelete"));
		return element;
	}

	// 返回我的二手车订单界面的暂无订单
	public WebElement NoOrder() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoOrder的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderPage.NoOrder"));
		return element;
	}
}
