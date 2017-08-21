package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class OldListSearchPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public OldListSearchPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回二手车车源列表页中的搜索输入框
	public WebElement SearchInput() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.SearchInput"));
		return element;
	}

	// 返回二手车车源列表页中的取消按钮
	public WebElement Cancle() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Cancle的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.Cancle"));
		return element;
	}

	// 返回二手车车源列表页中的下拉框元素
	public WebElement DropList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DropList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.DropList"));
		return element;
	}

	// 返回二手车车源列表页中的下拉框元素的第一个元素
	public WebElement DropList_1() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DropList_1的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.DropList_1"));
		return element;
	}

	// 返回二手车车源列表页中的下拉框元素的第二个元素
	public WebElement DropList_2() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DropList_2的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.DropList_2"));
		return element;
	}

	// 返回二手车车源列表页中的"热门搜索"
	public WebElement HotSearch() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HotSearch的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.HotSearch"));
		return element;
	}

	// 返回二手车车源列表页中的"品牌认证车"
	public WebElement Brand() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Brand的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.Brand"));
		return element;
	}

	// 返回二手车车源列表页中的"准新车"
	public WebElement NewCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NewCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldListSearchPage.NewCar"));
		return element;
	}
}
