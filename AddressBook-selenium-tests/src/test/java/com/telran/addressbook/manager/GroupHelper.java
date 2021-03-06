package com.telran.addressbook.manager;

import com.telran.addressbook.model.Group;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupsPage() {
    click(By.cssSelector("i a[href='group.php']"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(Group group) {
        type(By.name("group_name"), group.getGroupName());
        type(By.name("group_header"), group.getGroupHeader());
        type(By.name("group_footer"), group.getGroupFooter());
      }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void openGroupsPage() {
    click(By.cssSelector("a[href='group.php']"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void initGroupModification() {
    click(By.cssSelector("[name=edit]:last-child"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void deleteGroup() {
    click(By.name("delete"));
  }

  public void createGroup() {
    openGroupsPage();
    initGroupCreation();
    fillGroupForm(new Group().setGroupName("QA_15")
            .setGroupHeader("BLA-bla-bla")
            .setGroupFooter("Bllllllaaaaaa"));
    submitGroupCreation();
    returnToGroupsPage();
  }

  public int getGroupsCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public void selectGroupByIndex(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public boolean isGroupPresent(){
    return isElementPresent(By.name("selected[]"));
 }

  public void waitForGroup() {
    WebDriverWait wait=new WebDriverWait(wd,3);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("selected[]")));
  }
}
