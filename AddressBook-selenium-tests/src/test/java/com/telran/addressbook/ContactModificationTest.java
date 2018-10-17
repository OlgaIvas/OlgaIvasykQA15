package com.telran.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){
    homePageContact();
    selectContact();
    fillContactName("Avraam","Piterson","Isr,TA, Hatsionut 28","0548564789","avppit@com");
    updateContactModofication();
  }
}
