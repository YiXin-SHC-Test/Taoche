package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class MinePage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public MinePage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回个人中心中的页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于please_login的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Title"));
		return element;
	}

	// 返回个人中心中的请登录链接按钮
	public WebElement Please_login() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于please_login的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.please_login"));
		return element;
	}

	// 返回个人中心的设置按钮
	public WebElement SetBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SetBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.SetBtn"));
		return element;
	}

	// 返回个人中心中的二手车订单入口
	public WebElement Used_Order() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SetBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Used_Order"));
		return element;
	}

	// 返回个人中心中的我的收藏入口
	public WebElement Collect() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Collect的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Collect"));
		return element;
	}

	// 返回个人中心中的我浏览的二手车入口
	public WebElement Scan() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Scan的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Scan"));
		return element;
	}

	// 返回个人中心中的我发布的二手车入口
	public WebElement Release() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Release的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Release"));
		return element;
	}

	// 返回个人中心中的意见反馈入口
	public WebElement Feedback() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Feedback的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.Feedback"));
		return element;
	}

	// 已登录用户返回"易鑫用户"信息
	public WebElement UserName() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Feedback的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.UserName"));
		return element;
	}

	// 返回底部导航-二手车
	public WebElement OldCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OldCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.MinePage.OldCar"));
		return element;
	}
}
