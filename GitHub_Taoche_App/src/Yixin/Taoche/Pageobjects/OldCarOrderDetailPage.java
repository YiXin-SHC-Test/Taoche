package Yixin.Taoche.Pageobjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import Yixin.Taoche.Util.ObjectMap;

public class OldCarOrderDetailPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的绝对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private AppiumDriver driver;

	public OldCarOrderDetailPage(AppiumDriver driver) {
		this.driver = driver;
	}

	// 返回订单详情页界面的Title
	public WebElement Title() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Title的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Title"));
		return element;
	}

	// 返回订单详情页界面的返回按钮
	public WebElement BackBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于BackBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.BackBtn"));
		return element;
	}

	// 返回订单详情页界面的订单状态
	public WebElement Orderstatus() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Orderstatus的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Orderstatus"));
		return element;
	}

	// 返回订单详情页界面的车源图片
	public WebElement CarPic() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarPic的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CarPic"));
		return element;
	}

	// 返回订单详情页界面的车源名称
	public WebElement CarName() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarName的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CarName"));
		return element;
	}

	// 返回订单详情页界面的车源价格
	public WebElement CarPrice() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarPrice的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CarPrice"));
		return element;
	}

	// 返回订单详情页界面的车源行驶公里
	public WebElement CarMileage() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarMileage的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CarMileage"));
		return element;
	}

	// 返回订单详情页界面的车源描述
	public WebElement CarDesc() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarDesc的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CarDesc"));
		return element;
	}

	// 返回订单详情页界面的删除按钮
	public WebElement DeleteBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DeleteBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.DeleteBtn"));
		return element;
	}

	// 返回订单详情页界面的暂不删除按钮
	public WebElement NoDelete() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于NoDelete的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.NoDelete"));
		return element;
	}

	// 返回订单详情页界面的确认删除按钮
	public WebElement MakeDelete() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于MakeDelete的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.MakeDelete"));
		return element;
	}

	// 返回订单详情页界面的订单信息:订单编号/下单时间/成交时间
	public WebElement OrderMsg() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderMsg的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.OrderMsg"));
		return element;
	}

	// 返回订单详情页界面的订单信息:查看复检报告按钮
	public WebElement CheckReportBtn() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CheckReportBtn的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.CheckReportBtn"));
		return element;
	}

	// 返回订单详情页界面的订单信息:申请售后按钮
	public WebElement ApplyService() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ApplyService的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.ApplyService"));
		return element;
	}

	// 返回订单详情页界面的订单信息:顾问姓名
	public WebElement Adviser_name() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ServiceName的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Adviser_name"));
		return element;
	}

	// 返回订单详情页界面的订单信息:顾问电话
	public WebElement Adviser_phone() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ServicePhone的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Adviser_phone"));
		return element;
	}

	// 返回订单详情页界面的订单信息:联系顾问按钮
	public WebElement ConnectService() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于ConnectService的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.ConnectService"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：提交意向
	public WebElement SubmitStatus() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SubmitStatus的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.SubmitStatus"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：分配顾问中
	public WebElement Distributing() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Distributing的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Distributing"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：预约看车
	public WebElement OrderCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.OrderCar"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：线下看车
	public WebElement OfflineCar() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OfflineCar的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.OfflineCar"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：预约复检
	public WebElement OrderCheck() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于OrderCheck的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.OrderCheck"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：复检完成
	public WebElement Checked() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Checked的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Checked"));
		return element;
	}

	// 返回订单详情页界面的订单流程信息：购车成功
	public WebElement SuccessBuy() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SuccessBuy的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.SuccessBuy"));
		return element;
	}

	// 返回订单详情页界面的金融状态：已申请
	public WebElement Credit_Apply() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_Apply的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Credit_Apply"));
		return element;
	}

	// 返回订单详情页界面的金融状态：待审核
	public WebElement Credit_WaitVerify() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_WaitVerify的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Credit_WaitVerify"));
		return element;
	}

	// 返回订单详情页界面的金融状态：审核中
	public WebElement Credit_Verifying() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_Verifying的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Credit_Verifying"));
		return element;
	}

	// 返回订单详情页界面的金融状态：审核完毕
	public WebElement Credit_Verified() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_Verified的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.OldCarOrderDetailPage.Credit_Verified"));
		return element;
	}

	// 返回订单详情页界面的金融状态：贷款成功
	public WebElement Credit_SuccessCredit() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_SuccessCredit的定位方式和定位表达式
		element = driver
				.findElement(objectMap
						.getLocator("taoche.OldCarOrderDetailPage.Credit_SuccessCredit"));
		return element;
	}

	// 返回订单详情页界面的金融状态：审核通过
	public WebElement Credit_SuccessCreditMsg() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Credit_SuccessCreditMsg的定位方式和定位表达式
		element = driver
				.findElement(objectMap
						.getLocator("taoche.OldCarOrderDetailPage.Credit_SuccessCreditMsg"));
		return element;
	}
}
