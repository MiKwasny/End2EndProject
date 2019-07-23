package GroupID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import resourses.TestCaseTemplate;

import java.util.List;

public class CheckAllLinks extends TestCaseTemplate {

    @Test(priority = 1)
    public void CheckAllLinks() {

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        log.info("Maintained Visibility of links");
        //System.out.println("All links found on web page are: " + allLinks.size() + " links");

        //for (WebElement link : allLinks) {

            //System.out.println(link.getAttribute("href"));

            //System.out.println(link.getText());
        //}
    }

}
