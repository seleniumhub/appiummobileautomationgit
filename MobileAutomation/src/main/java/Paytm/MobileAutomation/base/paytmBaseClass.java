package Paytm.MobileAutomation.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mongodb.diagnostics.logging.Logger;

import Paytm.MobileAutomation.Testcases.PaytmLoginTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class paytmBaseClass {
	
	public  AppiumDriver driver;
	public static AppiumDriverLocalService services;
	public Properties 	prop;
	
public 	paytmBaseClass() throws Throwable {
    Properties 	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:/Users/Admin/git/appiummobileautomationgit/MobileAutomation/src/main/java/Paytm/MobileAutomation/config/paytmconfig.properties");
	prop.load(ip);
}



	public void AppiumCapabilities () throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("platformVersion", "5.0.0");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("deviceName", "Micromax Q380");
		 cap.setCapability("udid", "0123456789ABCDEF");
		 //cap.setCapability("appPackage", "30672ff9 u0 net.one97.paytm");
		 //cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		 
		 cap.setCapability("appPackage", "net.one97.paytm");
		cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		 cap.setCapability("FullReset", "true");
		cap.setCapability("adbExecTimeout", "20000");
		  URL apppiumurl = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new AndroidDriver<MobileElement>(apppiumurl,cap);
		  Thread.sleep(2000);
	     // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
		 System.out.println("Application launched");
	}

	
	public static void appiumserverstart()
	{
		
		String NodePath ="C:/Program Files/nodejs/node.exe";
		String AppiumMainjsPath ="C:/Program Files/Appium/resources/app/node_modules/appium/build/lib/main.js";
	// AppiumDriverLocalService services ;
	 SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	 AppiumDriverLocalService  services = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
			 .usingDriverExecutable(new File(NodePath))
			 .withAppiumJS(new File (AppiumMainjsPath))
			.withIPAddress("127.0.0.1")
			 .usingPort(4723));
	//services.stop();
	services.start();
	 //services.stop();
	 
	}
	
	public void screenshots() throws InterruptedException, IOException
	{
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target/Screenshot/PayasiaMobScreenshot.jpg"));
	}


	public  static void  appiumserverstop()
	{	
	if (services.isRunning()==true )
	      {
	        services.stop();
	        System.out.println("running servers are shut down");
	}


	
	}}
