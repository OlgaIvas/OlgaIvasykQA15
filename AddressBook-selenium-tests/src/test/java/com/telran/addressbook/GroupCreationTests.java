package com.telran.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    openGroupsPage();
    initGroupCreation();
    fillGroupForm("QA_15", "BLA-bla-bla", "Bllllllaaaaaa");
    submitGroupCreation();
    returnToGroupsPage();

  }

}
