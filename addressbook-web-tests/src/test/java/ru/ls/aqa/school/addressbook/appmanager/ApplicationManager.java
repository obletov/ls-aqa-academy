package ru.ls.aqa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

    protected Map<String, Object> vars;
    private SessionHelper sessionHelper;
    private final GroupHelper groupHelper = new GroupHelper();
    private final NavigationHelper navigationHelper = new NavigationHelper();

    public static void login(String username, String password) {
        $(byName("user")).click();
        $(byName("user")).val(username);
        $(byName("pass")).click();
        $(byName("pass")).val(password);
        $("input:nth-child(7)").click();
    }

    public static void logout() {
        $(byLinkText("Logout")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public void init() {
        Configuration.browser = "chrome";
        navigationHelper.vars = new HashMap<>();
        open("http://localhost/addressbook/");
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(2029, 1188));
        NavigationHelper navigationHelper = new NavigationHelper();
        sessionHelper = new SessionHelper();
        sessionHelper.login("admin", "secret");
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
