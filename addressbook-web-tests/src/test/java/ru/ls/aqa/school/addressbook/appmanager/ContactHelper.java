package ru.ls.aqa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.aqa.school.addressbook.model.ContactData;

import static com.codeborne.selenide.Selectors.byName;

public class ContactHelper extends HelperBase {

    public void fillContactForm(ContactData groupData) {
        type(By.name("firstname"), ContactData.getFirstName());
        type(By.name("lastname"), ContactData.getLastName());
        type(By.name("home"), ContactData.getHome());
}
}


