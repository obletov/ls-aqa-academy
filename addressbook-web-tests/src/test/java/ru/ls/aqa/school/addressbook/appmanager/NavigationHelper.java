package ru.ls.aqa.school.addressbook.appmanager;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper {
    protected Map<String, Object> vars;

    public static void gotoGroupPage() {
        $(byLinkText("groups")).click();
    }
}
