package ru.ls.aqa.school.addressbook.appmanager;
import java.util.Map;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper {
    protected Map<String, Object> vars;

    public void goToGroupPage() {
        $(byLinkText("groups")).click();
    }
}
