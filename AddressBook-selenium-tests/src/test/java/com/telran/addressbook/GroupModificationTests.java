package com.telran.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
  @BeforeMethod
  public void precondotions(){
    openGroupsPage();
    if(!isGroupPresent()){
      createGroup();
    }
  }
  @Test
  public void testGroupModification(){
    openGroupsPage();
    selectGroup();
    initGroupModification();
    fillGroupForm(new Group().setGroupName("modifyed").setGroupHeader("new").setGroupFooter("changed"));
    submitGroupModification();
    returnToGroupsPage();


  }

}
