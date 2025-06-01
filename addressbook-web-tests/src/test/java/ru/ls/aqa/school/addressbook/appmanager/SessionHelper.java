package ru.ls.aqa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class SessionHelper {
    public static void login(String username, String password) {
        $(byName("user")).click();
        $(byName("user")).val(username);
        $(byName("pass")).click();
        $(byName("pass")).val(password);
        $("input:nth-child(7)").click();
    }


}




