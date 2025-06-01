package ru.ls.aqa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.aqa.school.addressbook.appmanager.GroupHelper;
import ru.ls.aqa.school.addressbook.appmanager.NavigationHelper;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        NavigationHelper.gotoGroupPage();
        GroupHelper.selectGroup();
        GroupHelper.selectGroup();
        app.getGroupHelper().initGroupModification();
        GroupHelper.GroupFormForModify("test111", "test222", "test333");
        app.getGroupHelper().submitGroupModification();
        GroupHelper.returnTOGroupPage();
    }
}
