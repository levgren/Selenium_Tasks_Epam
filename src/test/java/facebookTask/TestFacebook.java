package facebookTask;

import org.junit.After;
import org.junit.Test;

public class TestFacebook {
    private SearchPage basePage = new SearchPage();

    @Test
    public void testCase(){
        basePage.goTo()
                .searchWord()
                .lookingForLink()
                .checkUrl()
                .enterData()
                .verifyTeMessage();
    }

    @After
    public void closeDriver(){
        new AbstractPage().closeDriver();
    }

}
