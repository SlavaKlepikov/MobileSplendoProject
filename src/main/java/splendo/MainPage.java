package splendo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage implements Pathes {

    AndroidDriver driver;

    public MainPage(AndroidDriver driver) {
        this.driver = driver;
    }

    void addFirstTask() {
        driver.findElement(By.id(app_package_name + "imgFirstTask")).click();
    }

    void addNewTask() {
        driver.findElement(By.id(app_package_name + "ivFAB_AddTask")).click();
    }

    String checkTaskName() {
        return driver.findElement(By.id(app_package_name + "task_name")).getText();
    }

    List fullListTaskName() {
        return driver.findElements(By.id(app_package_name + "task_name"));
    }

    void clickTaskName(String taskName) {
        List<WebElement> listImg = fullListTaskName();
        for (WebElement element : listImg) {
            if (element.getText().equals(taskName)) {
                element.click();
            }
        }
    }

    WebElement taskName(String taskName) {
        List<WebElement> listImg = fullListTaskName();
        for (WebElement element : listImg) {
            if (element.getText().equals(taskName)) {
            return element;
            }
        }
        return null;
    }

    String getTextTvEmpty() {
        return driver.findElement(By.id(app_package_name + "tvEmpty")).getText();
    }
}
