package GroupID;

import actions.Actions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resourses.browserInitialization;

import java.io.IOException;

public class checkTitle extends browserInitialization {

    public static Logger log = LogManager.getLogger(browserInitialization.class.getName());

    @BeforeTest
    public void initializeBrowser()throws IOException{

        driver = InitializeDriver();
        log.info("Driver is initialized");
        driver.get("http://www.qaclickacademy.com/");
        log.info("Navigated to homepage");
    }
    @Test (priority = 1)
    public void checkTitle()
    {
        Assert.assertEquals(Actions.getTitle(), "FEATURED COURSES");
        log.info("Title is correct");
    }

    @AfterTest
    public void teardown(){

    }

}