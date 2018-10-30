package com.telran.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition(){
  app.getContactHelper().homePageContact();
  if(!app.isContactPresent()){
    app.getContactHelper().contactCreation();
  }
  }
@Test
  public void testContactDeletion(){
  app.getContactHelper().homePageContact();
  app.getContactHelper().selectContact();
  app.getContactHelper().deleteContact();
}
}
