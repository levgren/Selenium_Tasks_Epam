package facebookTask;

import org.junit.Test;

public class TestFacebook extends BaseTest{

    @Test
    public void testCase(){
        basePage.searchWord()
                .lookingForLink()
                .checkUrl()
                .enterData()
                .verifyTheMessage();
    }


}
