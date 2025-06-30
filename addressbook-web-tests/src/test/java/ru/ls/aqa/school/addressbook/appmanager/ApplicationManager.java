package ru.ls.aqa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

    private final static String ADDRESSBOOK_URL = "http://localhost/addressbook/";
    private final SessionHelper sessionHelper = new SessionHelper();
    private final GroupHelper groupHelper = new GroupHelper();
    private final ContactHelper contactHelper = new ContactHelper();
    private final NavigationHelper navigationHelper = new NavigationHelper();

    public void init() {
        Configuration.browser = System.getProperty("selenide.browser", "chrome");
        // "chrome", "firefox", "legacy_firefox", "ie", "htmlunit", "opera", "safari", "edge"
        open(ADDRESSBOOK_URL);
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

