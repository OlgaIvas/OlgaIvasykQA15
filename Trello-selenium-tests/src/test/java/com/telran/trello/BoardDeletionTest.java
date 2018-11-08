package com.telran.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase{

  @Test
  public void deleteBoardTest(){
    openHomePage();
    chooseTheBoard();
    deleteTheBoard();
    submitDelition();
    returnToHomePage();
   // wdr.switchTo().alert().accept();
  }

}
