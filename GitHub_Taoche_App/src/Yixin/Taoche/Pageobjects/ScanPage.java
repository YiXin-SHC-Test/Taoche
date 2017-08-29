package Yixin.Taoche.Pageobjects;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class ScanPage {
	private WebElement element = null;
	private List<WebElement> elements = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public ScanPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.Title"));
		return element;
	}

	// 返回页面左上角返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.BackBtn"));
		return element;
	}

	// 当列表中有数据时，返回页面右上角的编辑按钮
	public WebElement EditBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于EditBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.EditBtn"));
		return element;
	}

	// 当列表中没有数据时，返回没有车源信息的提示信息
	public WebElement EmptyMsg() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于EmptyMsg的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.EmptyMsg"));
		return element;
	}

	// 当列表中有数据，点击编辑按钮后，返回全选按钮
	public WebElement SelectAllBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SelectAllBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.SelectAllBtn"));
		return element;
	}

	// 当列表中有数据，点击全选按钮后，返回全不选
	public WebElement NoSelectBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoSelectBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.NoSelectBtn"));
		return element;
	}

	// 当列表中有数据，点击编辑按钮后，返回每个车源后面的单选框
	public List<WebElement> DeleteIconList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SelectAllBtn的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.ScanPage.DeleteIconList"));
		return elements;
	}

	// 当列表中有数据，点击编辑按钮后，返回底部删除按钮
	public WebElement DeleteBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DeleteBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.DeleteBtn"));
		return element;
	}

	// 当列表中有数据，点击编辑按钮后，返回底部取消按钮
	public WebElement CancelBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CancelBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ScanPage.CancelBtn"));
		return element;
	}

	// 当列表中有数据，获取车源的图片信息
	public List<WebElement> CarImageList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarImageList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.ScanPage.CarImageList"));
		return elements;
	}

	// 当列表中有数据，获取车源的名称信息
	public List<WebElement> CarNameList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarNameList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.ScanPage.CarNameList"));
		return elements;
	}

	// 当列表中有数据，获取车源的价格信息
	public List<WebElement> CarPriceList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarPriceList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.ScanPage.CarPriceList"));
		return elements;
	}

	// 当列表中有数据，获取车源的行项目信息
	public List<WebElement> ItemList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ItemList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.ScanPage.ItemList"));
		return elements;
	}
}
