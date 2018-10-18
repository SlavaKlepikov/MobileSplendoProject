package splendo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TimePickerPage implements Pathes{

    AndroidDriver driver;

    public TimePickerPage(AndroidDriver driver) {
        this.driver = driver;}

    void clickDoneButton() {
        driver.findElement(By.id("android:id/button1")).click();
    }
}
