package facebookTask;

import facebookTask.utils.ConfigProperties;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FacebookLoginPage extends AbstractPage{

//    10 - verify that message "The email or phone number you’ve entered doesn't match any account." is displayed.

    private By alertMessage = By.xpath("//div[@class='_4rbf _53ij']");
    private String messageText = ConfigProperties.getTestProperty("messageText");

    public FacebookLoginPage verifyTheMessage(){
        String currentAlertText = driver.findElement(alertMessage).getText();
        Assert.assertEquals(messageText, currentAlertText);
        Allure.addAttachment("Verifying text message", "The message with text: " + currentAlertText + " appears");
        return this;
    }
}
