package com.telran.trello;

import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {
  @Test
  public void createBoardTest() {

    initBoardCreation();

    fillBoardForm();

    returnToHomePage();
  }

}
