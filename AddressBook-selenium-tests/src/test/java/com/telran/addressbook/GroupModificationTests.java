package com.telran.addressbook;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    openGroupsPage();
    selectGroup();
    initGroupModification();
    fillGroupForm("modofyed","new","changed");
    submitGroupModification();
    returnToGroupsPage();


  }

}
