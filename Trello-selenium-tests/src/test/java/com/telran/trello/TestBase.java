package com.telran.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

  WebDriver wdr;

  @BeforeClass
  public void setUp() {
    wdr = new ChromeDriver();
    wdr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wdr.get("https://trello.com");
    login();
  }

  @AfterClass
  public void  tearDown(){
  //  wdr.quit();
  }

  public void login(){
      wdr.findElement(By.cssSelector("[href='/login?returnUrl=%2F']")).click();
      wdr.findElement(By.name("user")).click();
      wdr.findElement(By.name("user")).clear();
      wdr.findElement(By.name("user")).sendKeys("ivasteles328@gmail.com");

      wdr.findElement(By.name("password")).click();
      wdr.findElement(By.name("password")).clear();
      wdr.findElement(By.name("password")).sendKeys("Ivasik328");
      wdr.findElement(By.id("login")).click();
  }

  public void returnToHomePage() {
    wdr.findElement(By.cssSelector("[class='header-btn-icon icon-lg icon-house light']")).click();
  }

  public void fillBoardForm() {
    wdr.findElement(By.cssSelector("[class='list-name-input']")).sendKeys("Critical bugs:");
    wdr.findElement(By.cssSelector("[class='primary mod-list-add-button js-save-edit']")).click();
    wdr.findElement(By.cssSelector("[class='list-name-input']")).sendKeys("Conversion bugs:");
    wdr.findElement(By.cssSelector("[class='primary mod-list-add-button js-save-edit']")).click();
    wdr.findElement(By.cssSelector("[class='list-name-input']")).sendKeys("Customer experience bugs:");
    wdr.findElement(By.cssSelector("[class='primary mod-list-add-button js-save-edit']")).click();
  }

  public void initBoardCreation() {
    wdr.findElement(By.cssSelector("[class='board-tile mod-add']")).click();
   // wdr.findElement(By.cssSelector("[class='js-new-board']")).click();
    wdr.findElement(By.cssSelector("[class='subtle-input']")).sendKeys("Bugs");
    wdr.findElement(By.cssSelector("[type='submit']")).click();
  }

  public void deleteTheBoard() {
    wdr.findElement(By.cssSelector("[class='board-menu-navigation-item-link js-open-more']")).click();
    wdr.findElement(By.cssSelector("[class='board-menu-navigation-item-link js-close-board']")).click();
  }

  public void chooseTheBoard() {
    wdr.findElement(By.cssSelector("[class='board-tile-details is-badged']")).click();
  }

  public void openHomePage() {
    wdr.findElement(By.cssSelector("[class='header-btn-icon icon-lg icon-house light']")).click();
  }

  public void submitDelition(){
    wdr.findElement(By.cssSelector("[class='js-confirm full negate']")).click();
  }
}
