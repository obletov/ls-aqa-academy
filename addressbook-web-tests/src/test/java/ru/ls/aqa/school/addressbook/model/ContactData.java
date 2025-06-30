package ru.ls.aqa.school.addressbook.model;
import lombok.*;

@Data
@Builder
@With

public class ContactData {
    private String firstName;
    private String lastName;
    private String home;

}
