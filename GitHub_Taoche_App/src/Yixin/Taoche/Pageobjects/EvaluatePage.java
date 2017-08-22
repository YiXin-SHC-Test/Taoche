package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

// 评估界面
public class EvaluatePage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public EvaluatePage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回车辆评估页标题
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SearchInput的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Title"));
		return element;
	}

	// 返回车辆评估页返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.BackBtn"));
		return element;
	}

	// 返回车辆评估页精准报价描述
	public WebElement txtHasCount() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于txtHasCount的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.txtHasCount"));
		return element;
	}

	// 返回车辆评估页准确率
	public WebElement txtPercent() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于txtPercent的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.txtPercent"));
		return element;
	}

	// 返回车辆评估页车主元素
	public WebElement Imv_sale() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Imv_sale的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.imv_sale"));
		return element;
	}

	// 返回车辆评估页买家元素
	public WebElement Imv_buy() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Imv_buy的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Imv_buy"));
		return element;
	}

	// 返回车辆评估页进入选择车款入口元素
	public WebElement Car_type() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Car_type的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Car_type"));
		return element;
	}

	// 返回车辆评估页车型选择 选择"奥迪"
	public WebElement Select_Brand() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Select_Brand的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Select_Brand"));
		return element;
	}

	// 返回车辆评估页车型选择 选择"奥迪A4L"
	public WebElement Select_BrandType() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Select_BrandType的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Select_BrandType"));
		return element;
	}

	// 返回车辆评估页车型选择 选择具体车款
	public WebElement Select_Car() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Select_Car的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Select_Car"));
		return element;
	}

	// 返回车辆评估页车型选择 上牌日期入口
	public WebElement CarDate() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarDate的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.CarDate"));
		return element;
	}

	// 返回车辆评估页车型选择 上牌日期确定按钮
	public WebElement TimeSure() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Time的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Time"));
		return element;
	}

	// 返回车辆评估页行驶里程输入框
	public WebElement Kilometer() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Kilometer的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Kilometer"));
		return element;
	}

	// 返回车辆评估页"立即评估"按钮
	public WebElement Submit() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Submit的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.EvaluatePage.Submit"));
		return element;
	}
}
