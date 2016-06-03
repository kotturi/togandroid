package com.tog.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Registration extends Setup {
	
	public static final String data="E:\\Jyothi_Windows_Backup\\TOG_Register.xls";
	
	@Test(priority=1)
	public void registration() throws InterruptedException
	{
		//Install the app checkout in Reset in Appium 
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.MINUTES);
		if(driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).isDisplayed())
		{
		driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/take_aLookBtn")).click();
        //driver.findElement(By.id("com.tog.togcommunity:id/activation_code_e_txt")).click();
		//driver.findElement(By.id("com.tog.togcommunity:id/activation_code_e_txt")).sendKeys("ASDY-2376-SFCT-4915");
		driver.findElement(By.id("com.tog.togcommunity:id/activate_app_view")).click();
		}
		else
		{
			System.out.println("App is already install in the Device....");
		}
		
		System.out.println("Wait");
		Thread.sleep(2000);
		driver.findElement(By.id("com.tog.togcommunity:id/register_new_user_txt_view")).click();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tog.togcommunity:id/first_name_e_txt")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/first_name_e_txt")).sendKeys("Jyothi");
		driver.findElement(By.id("com.tog.togcommunity:id/last_name_e_txt")).sendKeys("Kotturi");
		driver.findElement(By.id("com.tog.togcommunity:id/email_addr_e_txt")).sendKeys("Jyothi.kotturi@popcornapps.com");
		driver.hideKeyboard();
		driver.findElement(By.id("com.tog.togcommunity:id/pwd_e_txt")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/pwd_e_txt")).sendKeys("popcorn@");
		driver.hideKeyboard();
		driver.findElement(By.id("com.tog.togcommunity:id/phone_number_e_txt")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/phone_number_e_txt")).sendKeys("9912917894");
		driver.hideKeyboard();
		driver.scrollTo("CONTINUE");
		driver.findElement(By.id("com.tog.togcommunity:id/termscondnCheckbox")).click();
		driver.findElement(By.id("com.tog.togcommunity:id/continue_btn")).click();
	}
	@Test(priority=2)
	public void ProfileSetup() throws InterruptedException
	{
		
	}
}
