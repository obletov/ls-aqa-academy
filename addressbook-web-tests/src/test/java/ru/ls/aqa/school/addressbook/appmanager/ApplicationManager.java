package ru.ls.aqa.school.addressbook.appmanager;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

    private final SessionHelper sessionHelper = new SessionHelper();
    private final GroupHelper groupHelper = new GroupHelper();
    private final ContactHelper contactHelper = new ContactHelper();
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private String ADDRESSBOOK_URL = "http://localhost/addressbook/";

    public void init() {
        Configuration.browser = "chrome";
        open(ADDRESSBOOK_URL);
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(2029, 1188));
        sessionHelper.login("admin", "secret");
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}

