package ru.ls.aqa.school.addressbook.model;

import lombok.*;

@Data
@Builder
@With
@NoArgsConstructor
@AllArgsConstructor
public class GroupData {
    private String name;
    private String header;
    private String footer;
}
