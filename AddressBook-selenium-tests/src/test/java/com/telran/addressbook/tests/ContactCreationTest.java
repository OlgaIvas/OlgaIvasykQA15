package com.telran.addressbook.tests;

import com.telran.addressbook.model.Contact;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
  app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactName(new Contact().
            setLastname("Ivanov").
            setPhone("0593069589").
            setFirstname("Ivan").
            setAddress("Israel,Ashdod, Azmaut 58").
            setEmail("ivivanov@mail.com"));
  app.getContactHelper().enterContactCreation();

}

}
