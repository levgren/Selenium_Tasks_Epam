package facebookTask;

        import facebookTask.utils.ConfigProperties;
        import org.openqa.selenium.By;
        import org.openqa.selenium.StaleElementReferenceException;
        import org.openqa.selenium.WebElement;

public class SearchResultPage extends AbstractPage{
    //Click link "Facebook - Log In or Sign Up"

    private By allLinksSelector = By.xpath("//div[@class='ellip']");
    private String searchedLink = ConfigProperties.getTestProperty("searchedLink");

    public FacebookPage lookingForLink() {
        try {
            for (WebElement link : driver.findElements(allLinksSelector))
                if (link.getText().equalsIgnoreCase(searchedLink))
                    link.click();
        }
        catch (StaleElementReferenceException e){
            System.out.println("Selection failed! Try again...");
        }
        System.out.println("Link is found!");
        return new FacebookPage();
    }
}
