package ru.ls.aqa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HelperBase {
    protected Map<String, Object> vars;

    protected static void click(String locator) {
        $(byName(locator)).click();
    }

    protected static void type(String group_name, String locator, String text) {
        HelperBase.click(locator);
        $(byName(group_name)).val(text);
    }
}
