package Yixin.Taoche.Pageobjects;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class CollectionPage {
	private WebElement element = null;
	private List<WebElement> elements = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public CollectionPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回收藏页标题
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.Title"));
		return element;
	}

	// 返回收藏页返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.BackBtn"));
		return element;
	}

	// 返回收藏页编辑按钮
	public WebElement EditBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Edit的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.Edit"));
		return element;
	}

	// 返回收藏页编辑后的全选按钮
	public WebElement SelectAllBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SelectAll的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.SelectAll"));
		return element;
	}

	// 返回收藏页编辑后的单选按钮
	public WebElement CheckBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CheckBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.CheckBtn"));
		return element;
	}

	// 返回收藏页编辑后的底部删除按钮
	public WebElement DeleteBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DeleteBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.DeleteBtn"));
		return element;
	}

	// 返回收藏页编辑后的底部取消按钮
	public WebElement CancleBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CancleBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.CancleBtn"));
		return element;
	}

	// 返回收藏页 车源列表上方标题
	public WebElement CarList_Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.CarListTitle"));
		return element;
	}

	// 返回收藏页 经销商上方标题
	public WebElement DealerListTitle() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DealerList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.DealerList"));
		return element;
	}

	// 返回收藏页车源列表
	public List<WebElement> CarList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.CollectionPage.CarList"));
		return elements;
	}

	// 返回收藏页 车源列表无内容时的信息
	public WebElement None_CarList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于None_CarList的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.None_CarList"));
		return element;
	}

	// 返回收藏页 经销商列表无内容时的信息
	public WebElement None_Dealer() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于None_Dealer的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.CollectionPage.None_Dealer"));
		return element;
	}

	// 返回收藏页 车源名称信息
	public List<WebElement> CarNameList() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarNameList的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.CollectionPage.CarNameList"));
		return elements;
	}
}
