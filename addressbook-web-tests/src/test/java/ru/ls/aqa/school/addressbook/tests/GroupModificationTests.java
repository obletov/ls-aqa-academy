package ru.ls.aqa.school.addressbook.tests;
import org.junit.jupiter.api.Test;
import ru.ls.aqa.school.addressbook.appmanager.NavigationHelper;
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm("test111", "test222", "test333");
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoGroupPage();
    }
}
