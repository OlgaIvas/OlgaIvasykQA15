package com.telran.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test

  public void testContactCreation() {
  addNewContact();
  fillContactName("Ivan","Ivanov","Israel,Ashdod, Azmaut 58","0593069589","ivivanov@mail.com");
  enterContactCreation();

}

}
