package com.telran.addressbook.tests;

import com.telran.addressbook.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));
  @BeforeSuite
  public void setUp(){
    app.start();
  }
  @AfterSuite(alwaysRun = true)
  public void tearDown(){
    app.stop();
  }
}
