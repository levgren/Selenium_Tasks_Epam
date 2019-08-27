package facebookTask;

import facebookTask.utils.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends AbstractPage{

//    1 - Open browser
//    2 - Navigate to https://www.google.com
//    3 - Enter " Facebook " in to search field
//    4 - Click "Search" button

    private String searchedWord = ConfigProperties.getTestProperty("searchedWord");
    private By searchInput = By.xpath("//input[@name='q']");

    public SearchPage goTo(){
        driver.get(ConfigProperties.getTestProperty("url"));
        return this;
    }
    public SearchResultPage searchWord(){
        driver.findElement(searchInput).sendKeys(searchedWord);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
        return new SearchResultPage();
    }
}
