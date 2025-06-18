package ru.ls.aqa.school.addressbook.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.ls.aqa.school.addressbook.appmanager.ApplicationManager;


public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeEach
    public void setUp() {
        app.init();
    }

    @AfterEach
    public void tearDown() {
    }
}
