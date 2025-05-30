package ru.ls.aqa.school.addressbook;// Generated by Selenium IDE

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Dimension;

import java.util.*;

public class CreateNewContactTest {
    private Map<String, Object> vars;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        vars = new HashMap<>();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void createNewContact() {
        open("http://localhost/addressbook/");
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(2029, 1188));
        login("admin", "secret");
        CreateContact("Ivan", "Ivanov", "Russian", "ivan@ivaniv.ru");
        logout();
    }

    private static void logout() {
        $(byLinkText("Logout")).click();
    }

    private static void CreateContact(String firstname_contact, String lastname_contact, String home_contact, String mail_contact) {
        $(byLinkText("add new")).click();
        $(byName("firstname")).click();
        $(byName("firstname")).val(firstname_contact);
        $(byName("lastname")).click();
        $(byName("lastname")).val(lastname_contact);
        $(byName("home")).click();
        $(byName("home")).val(home_contact);
        $(byName("email")).click();
        $(byName("email")).val(mail_contact);
        $(byName("bday")).click();
        $(byName("bday")).selectOption("1");
        $(byName("bmonth")).click();
        $(byName("bmonth")).selectOption("June");
        $(byName("byear")).click();
        $(byName("byear")).val("1990");
        $("input:nth-child(87)").click();
    }

    private static void login(String user_name, String password) {
        $(byName("user")).click();
        $(byName("user")).val(user_name);
        $(byName("pass")).click();
        $(byName("pass")).val(password);
        $("input:nth-child(7)").click();
    }
}
