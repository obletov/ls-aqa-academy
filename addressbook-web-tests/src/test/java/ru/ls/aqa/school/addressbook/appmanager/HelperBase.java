package ru.ls.aqa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    protected static void click(By locator) {
        click(By.name("username"));
    }

    protected static void type(By group_name, String locator, String text) {
        HelperBase.click(locator);
        $(byName(group_name)).val(text);
    }
}
