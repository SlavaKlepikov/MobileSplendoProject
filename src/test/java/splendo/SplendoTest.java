package splendo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SplendoTest {

    MainPage mainPage;
    NewTaskPage newTaskPage;
    DatePickerPage datePickerPage;
    TimePickerPage timePickerPage;

    @BeforeClass
    public void setUp() throws Exception {
        AndroidSetup.createAndroidDriverForAppium();
        mainPage  = new MainPage(AndroidSetup.driver);
        newTaskPage = new NewTaskPage(AndroidSetup.driver);
        datePickerPage = new DatePickerPage(AndroidSetup.driver);
        timePickerPage = new TimePickerPage(AndroidSetup.driver);
    }

    @Test
    public void addEmptyTaskTest()
    {
       mainPage.addFirstTask();
       newTaskPage.enterTask("FirstTask");
       newTaskPage.clickSaveTask();
       Assert.assertEquals(mainPage.checkTaskName(),"FirstTask");
    }

    @Test(dependsOnMethods = "addEmptyTaskTest")
    public void deleteTaskTest()
    {
        mainPage.clickTaskName("FirstTask");
        newTaskPage.deleteTask();
        Assert.assertEquals(mainPage.getTextTvEmpty(),"Nothing to do");
    }

    @Test (dependsOnMethods = "deleteTaskTest")
    public void addFullTaskTest() // add Task with Date, Repeat, List
    {
        mainPage.addNewTask();
        newTaskPage.enterTask("SecondTask");
        newTaskPage.clickAddToListButton();
        newTaskPage.clickAddToListButtonPersonal();
        newTaskPage.clickDueDate();
        datePickerPage.clickDoneButton();
        newTaskPage.clickDueTime();
        timePickerPage.clickDoneButton();
        newTaskPage.clickRepeatButton();
        newTaskPage.repeatButtonOnceADay();
        newTaskPage.clickSaveTask();
        Assert.assertEquals(mainPage.taskName("SecondTask").getText(),"SecondTask");
    }

    @AfterClass
    public void tearDown() {
        AndroidSetup.driver.quit();
    }
}
