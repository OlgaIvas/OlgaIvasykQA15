package com.telran.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition(){
  homePageContact();
  if(!isContactPresent()){
    contactCreation();
  }
  }
@Test
  public void testContactDeletion(){
  homePageContact();
  selectContact();
  deleteContact();
}
}
