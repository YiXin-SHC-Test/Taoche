package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class SetPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public SetPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回页面Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.Title"));
		return element;
	}

	// 返回页面左上角的返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.BackBtn"));
		return element;
	}

	// 返回清楚图片缓存元素
	public WebElement CleanCache() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CleanCache的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.CleanCache"));
		return element;
	}

	// 返回确认删除缓存图片
	public WebElement VerifyClean() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于VerifyClean的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.VerifyClean"));
		return element;
	}

	// 返回暂不删除缓存图片按钮
	public WebElement NoClean() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoClean的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.NoClean"));
		return element;
	}

	// 返回检查更新元素
	public WebElement Update() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Update的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.Update"));
		return element;
	}

	// 返回当前版本
	public WebElement CurrentVersion() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CurrentVersion的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.CurrentVersion"));
		return element;
	}

	// 返回分享给好友
	public WebElement Share() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Share的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.Share"));
		return element;
	}

	// 返回关于
	public WebElement About() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于About的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.About"));
		return element;
	}

	// 返回退出按钮
	public WebElement Exit() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Exit的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.Exit"));
		return element;
	}

	// 返回当前系统版本
	public WebElement GetVersion() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于GetVersion的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.GetVersion"));
		return element;
	}

	// 返回分享弹出层的标题
	public WebElement ShareBoxTitle() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ShareBoxTitle的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.ShareBoxTitle"));
		return element;
	}

	// 返回分享弹出层底部取消按钮
	public WebElement CancelShare() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CancelShare的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SetPage.CancelShare"));
		return element;
	}
}
