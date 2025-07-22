package ru.ls.aqa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.aqa.school.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public void fillContactForm(ContactData groupData) {
        type(By.name("firstname"), groupData.getFirstName());
        type(By.name("lastname"), groupData.getLastName());
        type(By.name("home"), groupData.getHome());
    }

    public void submitContactCreation() {

        click(By.name("submit"));
    }
}


