package ru.ls.aqa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.byLinkText;
import static ru.ls.aqa.school.addressbook.appmanager.HelperBase.click;

public class NavigationHelper {

    public void goToGroupPage() {
        click(byLinkText("groups"));
    }

    public void goToContactPage() {
        click(byLinkText("home"));
    }

    public void clickCreateContact() {
        click(byLinkText("add new"));
    }
}
