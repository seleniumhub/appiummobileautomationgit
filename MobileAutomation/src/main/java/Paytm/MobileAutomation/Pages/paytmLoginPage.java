package Paytm.MobileAutomation.Pages;

import java.io.IOException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Paytm.MobileAutomation.base.paytmBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class paytmLoginPage extends paytmBaseClass {
	
	public paytmLoginPage(AndroidDriver<WebElement> driver) throws Throwable {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
	
	
@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
public  MobileElement language;


@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button")
public MobileElement contunuebutton;


@AndroidFindBy(id ="net.one97.paytm:id/login_button")
public MobileElement LoginButton;

@AndroidFindBy(id= "net.one97.paytm:id/et_registered_mobile")
public MobileElement Mobile;



@AndroidFindBy(id= "net.one97.paytm:id/proceed_btn_login")
public MobileElement ProceedButton;

	
@AndroidFindBy(id= "net.one97.paytm:id/login_button")
public MobileElement loginButton;

@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
public MobileElement navigationDrawer;

@AndroidFindBy(id ="net.one97.paytm:id/ln_name_tv")
public MobileElement name;


public void paytmlogin() throws InterruptedException 
{
	System.out.println("Login TestCases");
	Thread.sleep(20000);
	language.click();
	//WebDriverWait wait=new WebDriverWait(driver, 50);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")));
	
	
//String S1 = language.getText();

	//System.out.println("Launguage Selected Successfully" + S1);
	
	System.out.println("clicked on selected language");
	contunuebutton.click();
	Thread.sleep(20000);
	loginButton.click();
	Thread.sleep(2000);
	Mobile.sendKeys("8744940399");
	Thread.sleep(2000);
	ProceedButton.click();
	Thread.sleep(200000);
	navigationDrawer.click();
	Thread.sleep(2000);
String s1 = name.getText();
System.out.println(s1);
	
	
	
}




}


