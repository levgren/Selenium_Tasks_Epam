package facebookTask;

import org.junit.After;
import org.junit.Before;

public class BaseTest {

    SearchPage basePage = new SearchPage();

    @Before
    public void openGoogleSearchPage(){
        basePage.goTo();
    }

    @After
    public void closeDriver(){
        new AbstractPage().closeDriver();
    }
}
