package com.telran.qa15.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiPageSearchJava extends TestBasic {

  @Test
  public void testOpenJavaInWiki(){
    wikipediaOrg();
    openWikipediaorgEngl();
   // openWikipwdiaInEngl();   this method also work but
    searchJavaInWiki();
    pressLoupeInWiki();

    String curentUrl = drive.getCurrentUrl();
    Assert.assertEquals(curentUrl, "https://en.wikipedia.org/wiki/Java");

  }

}
