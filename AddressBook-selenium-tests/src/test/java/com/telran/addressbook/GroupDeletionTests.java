package com.telran.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
  @BeforeMethod
  public void precondotions(){
    openGroupsPage();
    if(!isGroupPresent()){
      createGroup();
    }
  }

  @Test
  public void testGroupDeletion(){
    openGroupsPage();
    selectGroup();
    deleteGroup();
    returnToGroupsPage();
  }

}
