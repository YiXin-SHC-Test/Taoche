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

	// 返回首页轮播图
	public WebElement Flush_Pic() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Flush_Pic的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Flush_Pic"));
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

	// 返回首页糖豆区域
	public WebElement SugarBanner() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.SugarBanner"));
		return element;
	}

	// 返回首页糖豆-帮您贷款
	public WebElement Sugar_HelpCredit() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Sugar_HelpCredit"));
		return element;
	}

	// 返回首页糖豆-二手车估价
	public WebElement Sugar_Evaluate() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Sugar_Evaluate"));
		return element;
	}

	// 返回首页糖豆-高价卖车
	public WebElement Sugar_SaleCar() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Sugar_SaleCar"));
		return element;
	}

	// 返回首页糖豆-领券中心
	public WebElement Sugar_Coupon() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Sugar_Coupon"));
		return element;
	}

	// 冲屏页广告 关闭按钮
	public WebElement CloseAd() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.Advertisement_close"));
		return element;
	}

	// 首页二手车Tab选项
	public WebElement Tab_oldcar() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.tab_oldcar"));
		return element;
	}

	// 首页浮球图标
	public WebElement FloatBall() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.FloatBall"));
		return element;
	}

	// 分期Tab页下面的查看全部链接按钮
	public WebElement Checkall() throws Exception {
		element = driver.findElement(objectMap
				.getLocator("taoche.HomePage.checkall"));
		return element;
	}
}
