package setUp;

import org.testng.annotations.Test;
import setUp.setUps;

public class setUpTest extends setUps {

    @Test (priority = 0)
    public void testsetUps(){
        String pageURL = "https://opensource-demo.orangehrmlive.com";

        if (pageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com")) {
            System.out.println("The webpage URL is " + pageURL);
        }else {
            System.out.println("Invalid URL, Actual webpage URL is " + pageURL);
        }


    }

}
