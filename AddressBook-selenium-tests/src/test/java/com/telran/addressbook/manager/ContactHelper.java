package com.telran.addressbook.manager;

import com.telran.addressbook.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{
  public ContactHelper(WebDriver wd) { super(wd); }
  public void homePageContact() { click(By.cssSelector("a[href='./']")); }
  public void enterContactCreation() { click(By.name("submit")); }

  public void fillContactName(Contact contact) {
    type(By.name("firstname"), contact.getFirstname());
    type(By.name("lastname"), contact.getLastname());
    type(By.name("address"), contact.getAddress());
    type(By.name("mobile"), contact.getPhone());
    type(By.name("email"), contact.getEmail());

  }
  public void addNewContact() { click(By.cssSelector("a[href='edit.php']")); }

  public void selectContact() { click(By.name("selected[]"));
  }
  public void editContact() {click(By.cssSelector("[src='icons/pencil.png']"));
  }
  public void submitContactModification() { click(By.name("update"));
  }
  public void deleteContact() { click(By.cssSelector("input[value='Delete']"));
    wd.switchTo().alert().accept();
  }

  public void contactCreation() {
    addNewContact();
    fillContactName(new Contact().setEmail("ivolga@mail.com").
            setFirstname("Vasia").
            setLastname("Pupkin").
            setPhone("0589632589").
            setAddress("Israel, Independence str. 89"));
    enterContactCreation();
  }



}
