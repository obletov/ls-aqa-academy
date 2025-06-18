package ru.ls.aqa.school.addressbook.appmanager;

public class GroupHelper extends HelperBase {

    public void submitGriupCreation() {
        click("submit");
    }

    public void fillGroupForm(String name, String header, String footer) {
        type("group_name", "group_name", name);
        type("group_header", "group_header", header);
        type("group_footer", "group_footer", footer);
    }

    public void clickCreateGroup() {
        click("new");
    }

    public void clickDeleteButton() {
        click("delete");
    }

    public void selectGroup() {
        click("selected[]");
    }

    public void initGroupModification() {
        click("edit");
    }

    public void submitGroupModification() {
        click("update");
    }
}
