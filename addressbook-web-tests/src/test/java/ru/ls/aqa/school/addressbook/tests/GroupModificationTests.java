package ru.ls.aqa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.aqa.school.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    private final GroupData group = new GroupData("1", "2", "3");

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupPage();
    }
}
