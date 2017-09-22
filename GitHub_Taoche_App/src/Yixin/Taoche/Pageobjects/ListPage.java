package Yixin.Taoche.Pageobjects;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class ListPage {
	private WebElement element = null;
	private List<WebElement> elements = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public ListPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回列表页中的左上角返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.BackBtn"));
		return element;
	}

	// 返回列表页中的搜索输入框
	public WebElement SearchInput() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.SearchInput"));
		return element;
	}

	// 返回列表页的切换城市按钮
	public WebElement Location() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Location"));
		return element;
	}

	// 返回列表页上方的"淘车认证"筛选条件
	public WebElement AuthCar() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.AuthCar"));
		return element;
	}

	// 返回列表页上方的"排序"筛选条件
	public WebElement Order() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Order"));
		return element;
	}

	// 返回列表页上方的"品牌"筛选条件
	public WebElement Brand() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Brand"));
		return element;
	}

	// 返回列表页上方的"价格"筛选条件
	public WebElement Price() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Price"));
		return element;
	}

	// 返回列表页上方的"筛选"按钮
	public WebElement Shaixuan() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Shaixuan"));
		return element;
	}

	// 返回列表页下方的滑块"全部"按钮
	public WebElement Bottom_all() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Bottom_all"));
		return element;
	}

	// 返回列表页下方的滑块"淘车认证"按钮
	public WebElement Bottom_Auth() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Bottom_Auth"));
		return element;
	}

	// 返回排序按钮下返回的下拉列表信息，暂时只取第一个值:价格最低
	public WebElement Cheapest() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Cheapest"));
		return element;
	}

	// 返回品牌按钮下返回的下拉列表信息，取值热门品牌/不限品牌/猜你喜欢/关闭
	public WebElement HotBrand() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.HotBrand"));
		return element;
	}

	// 返回品牌页底部关闭按钮
	public WebElement Close_Brand() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Close_Brand"));
		return element;
	}

	// 返回价格按钮下返回的下拉列表信息，暂时只取8-10万
	public WebElement Price8() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Price"));
		return element;
	}

	// 返回筛选按钮下返回的列表信息，热门推荐/质保/完成按钮
	// 热门推荐
	public WebElement HotCommend() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.HotCommend"));
		return element;
	}

	// 质保
	public WebElement Quality() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Quality"));
		return element;
	}

	// 完成
	public WebElement Done_btn() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.Done_btn"));
		return element;
	}

	// 获取列表页车源图片信息
	public List<WebElement> Page_list() throws Exception {
		elements = driver.findElements(objectMap
				.getLocator("taoche.ListPage.image_list"));
		return elements;
	}

	// 获取列表页淘车认证图片信息
	public WebElement AuthCarPic() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.AuthCarPic"));
		return element;
	}

	// 获取列表页中淘车认证图片中的删除icon
	public WebElement AuthCarPicClose() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.ListPage.AuthCarPicClose"));
		return element;
	}
}
