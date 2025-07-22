package ru.ls.aqa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper {

    public void goToGroupPage() {

        $(byLinkText("groups")).click();
    }

    public void goToContactPage() {

        $(byLinkText("home")).click();
    }

    public void clickCreateContact() {

        $(byLinkText("add new")).click();
    }
}
