package com.telran.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    openGroupsPage();
    initGroupCreation();
    fillGroupForm(new Group().setGroupName("QA_15")
                            .setGroupHeader("BLA-bla-bla")
                          .setGroupFooter("Bllllllaaaaaa"));
    submitGroupCreation();
    returnToGroupsPage();

  }

}
