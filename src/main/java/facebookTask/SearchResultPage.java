package facebookTask;

        import facebookTask.utils.ConfigProperties;
        import io.qameta.allure.Allure;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

public class SearchResultPage extends AbstractPage{
    //Click link "Facebook - Log In or Sign Up"

    private By allLinksSelector = By.xpath("//div[@class='ellip']");
    private String searchedLink = ConfigProperties.getTestProperty("searchedLink");

    public FacebookPage lookingForLink() {
            for (WebElement link : driver.findElements(allLinksSelector)){
                if (link.getText().equalsIgnoreCase(searchedLink)) {
                    link.click();
                    Allure.addAttachment("Click on necessary link", "link: " + searchedLink + " was found and being klicked");
//                    System.out.println("the searched link was found");  //todo loging
                    break;
                }
        }
        return new FacebookPage();
    }

}
