package com.telran.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
@Test
  public void testContactDeletion(){
  homePageContact();
  selectContact();
  deleteContact();
}
}