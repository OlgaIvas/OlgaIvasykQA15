package com.telran.addressbook.tests;

import com.telran.addressbook.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition(){
    app.getContactHelper().homePageContact();
    if(!app.isContactPresent()){
      app.getContactHelper().contactCreation();
    }
  }
  @Test
  public void testContactModification(){
    app.getContactHelper().homePageContact();
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactName(new Contact().
            setLastname("Piterson").
            setFirstname("Avraam").
            setAddress("Isr,TA, Hatsionut 28").
            setPhone("0548564789").
            setEmail("avppit@com"));
    app.getContactHelper().submitContactModification();
  }
}
