package ru.ls.aqa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;

import java.util.HashMap;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GroupHelper extends HelperBase{

    public static void returnTOGroupPage() {
        $(byLinkText("group page")).click();
    }

    public static void submitGriupCreation() {
        click("submit");
    }

    public static void fillGroupForm(String name, String header, String footer) {
        click("new");
        type("group_name", "group_name", name);
        type("group_header", "group_header", header);
        type("group_footer", "group_footer", footer);
    }

    public static void GroupFormForModify(String name, String header, String footer) {
        type("group_name", "group_name", name);
        type("group_header", "group_header", header);
        type("group_footer", "group_footer", footer);
    }


    public static void deleateSelectedGroups() {
        click("delete");
    }

    public static void selectGroup() {
        click("selected[]");
    }

    public void init() {
        Configuration.browser = "chrome";
        vars = new HashMap<>();
        open("http://localhost/addressbook/");
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(2029, 1188));
        ApplicationManager.login("admin", "secret");
    }

    public void initGroupModification() {
        click("edit");
    }

    public void submitGroupModification() {
        click("update");
    }
}
