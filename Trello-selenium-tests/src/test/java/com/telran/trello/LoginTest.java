package com.telran.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLogin(){
      wdr.findElement(By.cssSelector("[href='/login?returnUrl=%2F']")).click();
      wdr.findElement(By.name("user")).click();
      wdr.findElement(By.name("user")).clear();
      wdr.findElement(By.name("user")).sendKeys("ivasteles328@gmail.com");

      wdr.findElement(By.name("password")).click();
      wdr.findElement(By.name("password")).clear();
      wdr.findElement(By.name("password")).sendKeys("Ivasik328");
      wdr.findElement(By.id("login")).click();
    }


}
