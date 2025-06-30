package ru.ls.aqa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {

    protected static void click(By locator) {
        $(locator).click();

    }

    protected static void type(By locator, String text) {
        $(locator).val(text);
    }
}
