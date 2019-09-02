package facebookTask;

import facebookTask.utils.ConfigProperties;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FacebookPage extends AbstractPage{

//  6 - Verify that you were redirected to "https://www.facebook.com"
//  7 - Enter wrong email (text field "Email or Phone"). For example: "badlogin"
//  8 - Enter wrong password (text field "Password"). For example: "badpassword"

    private String currentUrl = ConfigProperties.getTestProperty("currentUrl");
    private String login = ConfigProperties.getTestProperty("login");
    private String password = ConfigProperties.getTestProperty("password");

    private By emailOrPhoneInput = By.xpath("//input[@id='email']");
    private By passwordInput = By.xpath("//input[@id='pass']");
    private By loginButton = By.xpath("//label[@id='loginbutton']");

    public FacebookPage checkUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), currentUrl);
        Allure.addAttachment("Verifying the redirection", "Redirection to: " + driver.getCurrentUrl());
        return this;
    }

    public FacebookLoginPage enterData(){
        driver.findElement(emailOrPhoneInput).sendKeys(login);
        Allure.addAttachment("Entering wrong email", "email: " + login + " was entered");
        driver.findElement(passwordInput).sendKeys(password);
        Allure.addAttachment("Entering wrong password", "password: " + password + " was entered");
        driver.findElement(loginButton).click();
        Allure.addAttachment("Clicking on 'Login' button", "'Login' button was clicked");
        return new FacebookLoginPage();
    }

}
