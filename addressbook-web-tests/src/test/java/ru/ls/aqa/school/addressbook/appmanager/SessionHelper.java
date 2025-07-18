package ru.ls.aqa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.name;

public class SessionHelper extends HelperBase {

    public void login(String username, String password) {
        click(name("user"));
        type(name("user"), username);
        click(name("pass"));
        type(name("pass"), password);
        click(cssSelector("input:nth-child(7)"));
    }
    public static void logout() {
        $(byLinkText("Logout")).click();
    }
}




