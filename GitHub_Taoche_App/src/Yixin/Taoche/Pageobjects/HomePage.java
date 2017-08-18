package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class HomePage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public HomePage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回首页中的搜索输入框
	public WebElement SearchInput() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.SearchInput_xpath"));
		return element;
	}

	// 返回首页左上角定位
	public WebElement Location() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Location的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Location"));
		return element;
	}

	// 返回首页中的"更多筛选条件"
	public WebElement MoreSearch() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于MoreSearch的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.moreSearch"));
		return element;
	}

	// 返回首页中底部导航栏-首页
	public WebElement Homepage() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Homepage的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.homepage"));
		return element;
	}

	// 返回首页中底部导航栏-新车
	public WebElement Newcar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Newcar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.newcar"));
		return element;
	}

	// 返回首页中底部导航栏-二手车
	public WebElement Oldcar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Oldcar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.oldcar"));
		return element;
	}

	// 返回首页中底部导航栏-分期
	public WebElement Diffedate() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Diffedate的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.diffedate"));
		return element;
	}

	// 返回首页中底部导航栏-我的
	public WebElement Mine() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Mine的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.mine"));
		return element;
	}

	// 返回首页上方各品牌车信息
	public WebElement Brand(By by, String Xapth) {
		element = driver.findElement(by.xpath(Xapth));
		return element;
	}

	// 返回首页的"猜你喜欢"
	public WebElement Favourite() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.favourite"));
		return element;
	}

	// 返回首页的超值二手车下面的"淘车认证车"
	public WebElement AuthorCar_OldCar() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.AuthorCar_OldCar"));
		return element;
	}
}
