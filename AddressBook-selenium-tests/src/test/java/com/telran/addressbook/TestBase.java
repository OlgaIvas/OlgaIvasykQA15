package com.telran.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeClass
  public void setUp(){
    wd=new ChromeDriver();

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.get("http://localhost:8080/addressbook/");

    //login
    login("admin", "secret");
  }

  public void login(String userName, String password) {
    type(By.name("user"), userName);
    type(By.name("pass"), password);
    wd.findElement(By.cssSelector("[type=submit]")).click();
  }

  public void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void returnToGroupsPage() {
    wd.findElement(By.cssSelector("i a[href='group.php']")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(Group group) {
        type(By.name("group_name"), group.getGroupName());
        type(By.name("group_header"), group.getGroupHeader());
        type(By.name("group_footer"), group.getGroupFooter());
      }

  public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
      }

  public void openGroupsPage() {
        wd.findElement(By.cssSelector("a[href='group.php']")).click();
      }

  @AfterClass
  public void tearDown(){
    wd.quit();
  }

  public void submitGroupModification() {
    wd.findElement(By.name("update")).click();
  }

  public void initGroupModification() {
    wd.findElement(By.cssSelector("[name=edit]:last-child")).click();
  }

  public void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }

  public void deleteGroup() {
    wd.findElement(By.name("delete")).click();
  }

  public void createGroup() {
    openGroupsPage();
    initGroupCreation();
    fillGroupForm(new Group().setGroupName("QA_15")
            .setGroupHeader("BLA-bla-bla")
            .setGroupFooter("Bllllllaaaaaa"));
    submitGroupCreation();
    returnToGroupsPage();
  }
//============================================Contact=========================================================================
  public void selectContact() {
    wd.findElement(By.name("selected[]")).click();
  }
  public void editContact() {
    wd.findElement(By.cssSelector("[src='icons/pencil.png']")).click();
  }

  public void homePageContact() {
    wd.findElement(By.cssSelector("a[href='./']")).click();
  }

  public void deleteContact() {
  wd.findElement(By.cssSelector("input[value='Delete']")).click();
  wd.switchTo().alert().accept();
  }

  public void fillContactName(Contact contact) {
    type(By.name("firstname"), contact.getFirstname());
    type(By.name("lastname"), contact.getLastname());
    type(By.name("address"), contact.getAddress());
    type(By.name("mobile"), contact.getPhone());
    type(By.name("email"), contact.getEmail());

  }

  public void enterContactCreation() {
 wd.findElement(By.name("submit")).click();
  }

  public void addNewContact() {
    wd.findElement(By.cssSelector("a[href='edit.php']")).click();
  }

  public void submitContactModification() {
    wd.findElement(By.name("update")).click();
  }

  public void contactCreation() {
    addNewContact();
    fillContactName(new Contact().setEmail("ivolga@mail.com").
            setFirstname("Vasia").
            setLastname("Pupkin").
            setPhone("0589632589").
            setAddress("Israel, Independence str. 89"));
    enterContactCreation();
  }
 // public boolean
  public boolean isContactPresent(){
  return isElementPresent(By.name("selected[]"));
  }

  public boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

 public boolean isGroupPresent(){
    return isElementPresent(By.name("selected[]"));
 }
}
