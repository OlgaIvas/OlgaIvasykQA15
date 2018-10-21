package com.telran.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
  addNewContact();
    fillContactName(new Contact().
            setLastname("Ivanov").
            setPhone("0593069589").
            setFirstname("Ivan").
            setAddress("Israel,Ashdod, Azmaut 58").
            setEmail("ivivanov@mail.com"));
  enterContactCreation();

}

}
