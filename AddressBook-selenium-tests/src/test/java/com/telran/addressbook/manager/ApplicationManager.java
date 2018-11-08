package com.telran.addressbook.manager;

import com.telran.addressbook.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  private SessionHelper sessionHelper;
  private GroupHelper groupHelper;
  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public void start() {
    //String browser = null;
    if(browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    }else if(browser.equals(BrowserType.FIREFOX)){
      wd=new FirefoxDriver();
    } //else if(browser.equals(BrowserType.IE)){
     // wd=new InternetExplorerDriver();}

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    navigationHelper=new NavigationHelper(wd);
    navigationHelper.openSite("http://localhost:8080/addressbook/");

    sessionHelper = new SessionHelper(wd);
    groupHelper = new GroupHelper(wd);
    contactHelper= new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }
  public void stop() {
    wd.quit();
  }

  //============================================Contact=========================================================================
  // public boolean
  public boolean isContactPresent(){
    return contactHelper.isElementPresent(By.name("selected[]"));
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
