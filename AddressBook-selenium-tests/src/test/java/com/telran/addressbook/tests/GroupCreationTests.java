package com.telran.addressbook.tests;

import com.telran.addressbook.model.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getGroupHelper().openGroupsPage();
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new Group().setGroupName("QA_15")
                            .setGroupHeader("BLA-bla-bla")
                          .setGroupFooter("Bllllllaaaaaa"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();

    int after = app.getGroupHelper().getGroupsCount();
    Assert.assertEquals(after,before+1);
  }



}
