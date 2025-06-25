package ru.ls.aqa.school.addressbook.appmanager;
import org.openqa.selenium.By;
import ru.ls.aqa.school.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public void submitGriupCreation() {
        click(click(By.name("submit");
    }

    public void fillGroupForm(String name, String header, String footer) {
        type(By.name("group_name"), GroupData.getName());
        type(By.name("group_header"), GroupData.getHeader());
        type(By.name("group_footer"), GroupData.getFooter());
    }

    public void clickCreateGroup() {
        click(By.name("new"));
    }

    public void clickDeleteButton() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
