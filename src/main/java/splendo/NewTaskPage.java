package splendo;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class NewTaskPage implements Pathes {

    AndroidDriver driver;

    public NewTaskPage(AndroidDriver driver) {
        this.driver = driver;}

    void enterTask(String task){
     driver.findElement(By.id(app_package_name + "edtTaskName")).sendKeys(task);}

    void clickDueDate(){
        driver.findElement(By.id(app_package_name + "edtDueD")).click();}

    void clickDueTime(){
        driver.findElement(By.id(app_package_name + "edtDueT")).click();}

    void clickRepeatButton(){
        driver.findElement(By.id(app_package_name + "spinnerRepeat")).click();}

    void repeatButtonOnceADay(){
        driver.findElement(By.xpath(TextView + "[@text='Once a Day']")).click();}

    void clickAddToListButton(){
        driver.findElement(By.id(app_package_name + "spinnerLists")).click();}

    void clickAddToListButtonPersonal(){
        driver.findElement(By.xpath(TextView + "[@text='Personal']")).click();}

    void clickSaveTask() {
        driver.findElement(By.id(app_package_name + "action_save_task")).click();
    }


    void deleteTask() {
        driver.findElement(MobileBy.AccessibilityId("More options")).click();
        driver.findElement(By.xpath(TextView +"[@text='Delete Task']")).click();
        driver.findElement(By.id("android:id/button1")).click();
    }
}
