package com.telran.trello;

import org.testng.annotations.Test;

public class BoardModificationTest extends TestBase {

  @Test
  public void modificateBoardTest(){
  openHomePage();
  chooseTheBoard();
  fillBoardForm();
  returnToHomePage();

  }
}
