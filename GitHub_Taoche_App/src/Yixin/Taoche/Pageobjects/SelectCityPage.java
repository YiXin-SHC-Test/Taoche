package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class SelectCityPage {
	private WebElement element = null;
	// private List<WebElement> elements = null;

	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public SelectCityPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回城市页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.Title"));
		return element;
	}

	// 返回城市页面返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.BackBtn"));
		return element;
	}

	// 返回城市全国
	public WebElement Quanguo() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Quanguo的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.Quanguo"));
		return element;
	}

	// 返回城市北京
	public WebElement Beijing() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Beijing的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.Beijing"));
		return element;
	}

	// 返回城市安徽
	public WebElement Anhui() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Anhui的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.Anhui"));
		return element;
	}

	// 返回城市阜阳
	public WebElement Fuyang() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Fuyang的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.Fuyang"));
		return element;
	}

	// 返回当前被选择的城市
	public WebElement Selected_City() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SelectCityPage的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SelectCityPage.SelectedCiy"));
		return element;
	}
}
