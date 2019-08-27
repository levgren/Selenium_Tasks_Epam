package facebookTask;

import facebookTask.utils.ConfigProperties;
import org.openqa.selenium.By;

public class FacebookLoginPage extends AbstractPage{

//    10 - verify that message "The email or phone number you’ve entered doesn’t match any account." is displayed.

    private By allertMessage = By.xpath("//div[@class='_4rbf _53ij']");
    private String currentAllertText = driver.findElement(allertMessage).getText();
    private String messageText = ConfigProperties.getTestProperty("messageText");

    public FacebookLoginPage verifyTeMessage(){
        if (currentAllertText.equalsIgnoreCase(messageText))
            System.out.println(messageText + " is displayed");
        System.out.println("There is text: <" + currentAllertText + "> and it doesn`t match the given allert text");
        return this;
    }
}
