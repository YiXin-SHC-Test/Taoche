package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class SynchroPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public SynchroPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回同步车源页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.Title"));
		return element;
	}

	// 返回同步车源页面返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.BackBtn"));
		return element;
	}

	// 返回同步车源页面手机号输入框
	public WebElement PhoneText() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于PhoneText的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.PhoneText"));
		return element;
	}

	// 返回同步车源页面手机验证码输入框
	public WebElement CheckCodeText() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CheckCodeText的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.CheckCodeText"));
		return element;
	}

	// 返回同步车源页面获取验证码按钮
	public WebElement CheckCodeBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CheckCodeBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.CheckCodeBtn"));
		return element;
	}

	// 返回同步车源页面提交按钮
	public WebElement SubmitBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SubmitBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SynchroPage.SubmitBtn"));
		return element;
	}
}
