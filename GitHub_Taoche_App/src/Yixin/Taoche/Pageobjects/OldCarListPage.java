package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class OldCarListPage {
	private WebElement element = null;
	private List<WebElement> elements = null;

	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public OldCarListPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回二手车列表页选择区域位置
	public WebElement Location() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Location的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Location"));
		return element;
	}

	// 返回二手车列表页Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Title"));
		return element;
	}

	// 返回二手车列表页搜索按钮
	public WebElement Search() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Search的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Search"));
		return element;
	}

	// 返回二手车列表页帮买按钮
	public WebElement HelpBuy() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于HelpBuy的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.HelpBuy"));
		return element;
	}

	// 返回二手车列表页评估按钮
	public WebElement Evaluate() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Evaluate的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Evaluate"));
		return element;
	}

	// 返回二手车列表页我要卖车按钮
	public WebElement SaleCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SaleCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.SaleCar"));
		return element;
	}

	// 返回二手车列表页车源收藏按钮
	public WebElement Collection() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Collection的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Collection"));
		return element;
	}

	// 返回二手车筛选条件中淘车认证
	public WebElement AuthCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于AuthCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.AuthCar"));
		return element;
	}

	// 返回二手车筛选条件中排序
	public WebElement BtnSort() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BtnSort的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.BtnSort"));
		return element;
	}

	// 返回二手车筛选条件中排序图标
	public WebElement ImvSort() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ImvSort的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ImvSort"));
		return element;
	}

	// 定位价格最低排序的元素
	public WebElement ByLowPrice() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ByLowPrice的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ByLowPrice"));
		return element;
	}

	// 定位价格最高排序的元素
	public WebElement ByHighPrice() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ByHighPrice的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ByHighPrice"));
		return element;
	}

	// 定位时间最新的元素
	public WebElement ByNewTime() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ByNewTime的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ByNewTime"));
		return element;
	}

	// 返回二手车筛选条件中品牌
	public WebElement BtnBrand() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BtnBrand的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.BtnBrand"));
		return element;
	}

	// 返回二手车筛选条件中品牌图标
	public WebElement ImvBrand() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ImvBrand的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ImvBrand"));
		return element;
	}

	// 返回二手车筛选条件中价格
	public WebElement BtnPrice() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BtnPrice的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.BtnPrice"));
		return element;
	}

	// 返回二手车筛选条件中价格图标
	public WebElement ImvPrice() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ImvPrice的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ImvPrice"));
		return element;
	}

	// 返回二手车筛选条件中筛选
	public WebElement list_screen() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于list_screen的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.list_screen"));
		return element;
	}

	// 返回二手车筛选条件中筛选图标
	public WebElement imv_screen() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于imv_screen的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.imv_screen"));
		return element;
	}

	// 返回二手车筛选条件中淘车认证的全部按钮
	public WebElement Bottom_all() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Bottom_all的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Bottom_all"));
		return element;
	}

	// 返回二手车筛选条件中淘车认证的淘车认证按钮
	public WebElement Bottom_auth() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Bottom_auth的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.Bottom_auth"));
		return element;
	}

	// 返回二手车列表页图片列表
	public List<WebElement> image_list() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于image_list的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.image_list"));
		return elements;
	}

	// 返回二手车列表页淘车认证标识
	public List<WebElement> AuthMark() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于AuthMark的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.AuthMark"));
		return elements;
	}

	// 返回二手车列表价格列表
	public List<WebElement> price_list() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于price_list的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.price_list"));
		return elements;
	}

	// 返回二手车列表车源名称列表
	public List<WebElement> name_list() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于name_list的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.name_list"));
		return elements;
	}

	// 返回二手车列表车源年信息列表
	public List<WebElement> ontheyear_list() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ontheyear_list的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.ontheyear_list"));
		return elements;
	}

	// 返回二手车列表车源公里数信息列表
	public List<WebElement> mileage_list() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于mileage_list的定位方式和定位表达式
		elements = driver.findElements(objectMap
				.getLocator("taoche.OldCarListPage.mileage_list"));
		return elements;
	}

	// 返回二手车筛选条件中品牌页：不限品牌
	public WebElement NoBrand() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoBrand的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.NoBrand"));
		return element;
	}

	// 返回二手车筛选条件中价格：8-10万
	public WebElement ByPrice8() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ByPrice8的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ByPrice8"));
		return element;
	}

	// 返回筛选条件，点击后删除
	public WebElement ClosePrice8() throws Exception {
		//
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarListPage.ClosePrice8"));
		return element;
	}
}
