package ru.ls.aqa.school.addressbook.model;

import lombok.*;

@Data
@Builder
@With
@NoArgsConstructor
@AllArgsConstructor

public class ContactData {
    private String firstName;
    private String lastName;
    private String home;
    private String mailContact;

}
