package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

// 评估结果界面
public class EvaluateResultPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public EvaluateResultPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回车辆评估页按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.SearchInput_xpath"));
		return element;
	}

	// 返回车辆评估结果页标题
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluateResultPage.Title"));
		return element;
	}

	// 返回车辆评估结果页车源标题结果
	public WebElement CarResult() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarResult的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluateResultPage.CarResult"));
		return element;
	}

	// 返回车辆评估结果页车源数据结果
	public WebElement MsgResult() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于MsgResult的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluateResultPage.MsgResult"));
		return element;
	}
	
	// 
}
