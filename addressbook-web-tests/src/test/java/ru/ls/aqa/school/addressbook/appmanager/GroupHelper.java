package ru.ls.aqa.school.addressbook.appmanager;
import org.openqa.selenium.By;
import ru.ls.aqa.school.addressbook.model.GroupData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends HelperBase {

    public void submitGroupCreation() {

        click(By.name("submit"));
    }

    public static void fillGroupForm(GroupData groupData) {
        type(byName("group_name"), GroupData.getName());
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
