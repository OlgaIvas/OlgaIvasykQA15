package com.telran.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition(){
    homePageContact();
    if(!isContactPresent()){
      contactCreation();
    }
  }
  @Test
  public void testContactModification(){
    homePageContact();
    selectContact();
    editContact();
    fillContactName(new Contact().
            setLastname("Piterson").
            setFirstname("Avraam").
            setAddress("Isr,TA, Hatsionut 28").
            setPhone("0548564789").
            setEmail("avppit@com"));
    submitContactModification();
  }
}
