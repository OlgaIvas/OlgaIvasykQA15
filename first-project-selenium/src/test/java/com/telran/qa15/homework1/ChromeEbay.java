package com.telran.qa15.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChromeEbay {
  WebDriver wed;

  @BeforeMethod
  public void setUp(){
    wed = new ChromeDriver();
    wed.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  @Test
  public void openSite(){
    wed.navigate().to("https://www.ebay.com/");
    wed.findElement(By.linkText("Sign in")).click();
    wed.findElement(By.name("userid")).sendKeys("@gmail.com");//it work with real email
    wed.findElement(By.name("pass")).sendKeys("********");//it works with real pass
    wed.findElement(By.id("sgnBt")).click();
  }
  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(2000);
    //wed.quit();
  }
}
