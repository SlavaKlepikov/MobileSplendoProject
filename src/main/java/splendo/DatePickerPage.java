package splendo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DatePickerPage implements Pathes {

    AndroidDriver driver;

    public DatePickerPage(AndroidDriver driver) {
        this.driver = driver;}

    void clickDoneButton() {
        driver.findElement(By.id("android:id/button1")).click();
    }
}
