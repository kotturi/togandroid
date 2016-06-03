package com.tog.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Setup {
	
	//AppiumDriver<WebElement> driver;
	AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void configuration() throws MalformedURLException
	{
		File app = new File("E:\\Jyothi_Windows_Backup\\apk\\TOG\\TOG_community.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
 		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 		capabilities.setCapability("deviceName","00771695054e2b67");//02232934307b86fc   00771695054e2b67
 		//capabilities.setCapability("deviceName", "emulator-5554"); 
 		capabilities.setCapability("platformversion","6.0.1");
 		capabilities.setCapability("platformName", "Android");
 		capabilities.setCapability("package", "com.tog.togcommunity");
		capabilities.setCapability("Activity", "com.tog.togcommunity.SplashActivity");
		capabilities.setCapability("app", app.getAbsolutePath());
		   driver= new AndroidDriver<WebElement>( new URL("http://127.0.0.1:4723/wd/hub"), capabilities) ;
			
		   
		   String appId="com.tog.togcommunity";
		   System.out.println(driver.isAppInstalled(appId));
		   
		/*
		if (driver.isAppInstalled("com.tog.togcommunity")) {
			System.out.println("App is already installed on your phone");
		} else {
			System.out.println("App is not currently installed on your phone");
		}*/
	}
	/*@Test
	public void test()
	{
		System.out.println("Hiiii");
	}*/
}