package facebookTask;

import facebookTask.utils.ConfigProperties;
import org.openqa.selenium.By;

public class FacebookPage extends AbstractPage{

//  6 - Verify that you were redirected to "https://www.facebook.com"
//  7 - Enter wrong email (text field "Email or Phone"). For example: "badlogin"
//  8 - Enter wrong password (text field "Password"). For example: "badpassword"

    private String login = ConfigProperties.getTestProperty("login");
    private String password = ConfigProperties.getTestProperty("password");
    private By emailOrPhoneInput = By.xpath("//input[@id='email']");
    private By passwordInput = By.xpath("//input[@id='pass']");
    private By loginButton = By.xpath("//label[@id='loginbutton']");

    public FacebookPage checkUrl(){
        System.out.println(driver.getTitle());
        return this;
    }

    public FacebookLoginPage enterData(){
        driver.findElement(emailOrPhoneInput).sendKeys(login);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new FacebookLoginPage();
    }

}
