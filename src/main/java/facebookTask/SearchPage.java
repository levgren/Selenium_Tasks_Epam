package facebookTask;

import facebookTask.utils.ConfigProperties;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends AbstractPage{

//    1 - Open browser
//    2 - Navigate to https://www.google.com
//    3 - Enter " Facebook " in to search field
//    4 - Click "Search" button

    private String  givenUrl = ConfigProperties.getTestProperty("url");
    private String searchedWord = ConfigProperties.getTestProperty("searchedWord");
    private By searchInput = By.xpath("//input[@name='q']");

    public SearchPage goTo(){
        driver.get(givenUrl);
        Allure.addAttachment("Navigating to Google search page", "given url: " + givenUrl + " is opened");
        return this;
    }
    public SearchResultPage searchWord(){
        driver.findElement(searchInput).sendKeys(searchedWord);
        Allure.addAttachment("tiping searched word in search input", "searched word: " + searchedWord + " is entered");
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
        Allure.addAttachment("Submitting of searched word", "'Search' button is pressed");
        return new SearchResultPage();
    }
}
