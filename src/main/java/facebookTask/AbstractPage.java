package facebookTask;

import facebookTask.utils.Driver;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver = Driver.getDriver();

    public void closeDriver(){
        if(driver!=null)
            driver.quit();
    }
}
