package com.telran.qa15.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBasic {
  WebDriver drive;

  @BeforeMethod
  public void setUp(){
  drive = new ChromeDriver();
  drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
  //Thread.sleep(5000);
  }

  public void RefactorMethods() {
    // drive.quit();
  }

  public void pressLoupeInWiki() {
    drive.findElement(By.id("searchButton")).click();
  }

  public void searchJavaInWiki() {
    drive.findElement(By.name("search")).sendKeys("Java");
  }

  public void openWikipwdiaInEngl() {
    drive.navigate().to("https://en.wikipedia.org/");
  }

  public void wikipediaOrg(){
    drive.navigate().to("https://www.wikipedia.org/");
  }

  public void openWikipediaorgEngl(){
   drive.findElement(By.id("js-link-box-en")).click();
  }
}
