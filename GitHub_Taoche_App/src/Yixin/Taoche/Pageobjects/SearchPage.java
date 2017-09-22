package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class SearchPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public SearchPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回搜索页面输入框
	public WebElement Input() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SearchPage.Input"));
		return element;
	}

	// 返回搜索页面"取消"按钮
	public WebElement CancelBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CancleBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SearchPage.CancleBtn"));
		return element;
	}

	// 返回热门搜索标题
	public WebElement HotSearhTitle() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HotSearhTitle的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SearchPage.HotSearhTitle"));
		return element;
	}

	// 返回热门搜索区域
	public WebElement HotSearchGridView() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HotSearchGridView的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SearchPage.HotSearchGridView"));
		return element;
	}

	// 返回输入宝马后，下拉列表中的宝马x1
	public WebElement BMW_X1() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BMW_X1的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SearchPage.SearchList_BMWx1"));
		return element;
	}
}
