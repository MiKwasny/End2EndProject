package resourses;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInitialization {

    public static WebDriver driver;
    public Properties properties = new Properties();
    public static Logger log = LogManager.getLogger(browserInitialization.class.getName());
    public WebDriver InitializeDriver() throws IOException {

        FileInputStream fis = new FileInputStream("D:\\JavaEverything\\SeleniumMaster\\NewCoding\\End2EndProject\\src\\main\\java\\resourses\\data.properties");
        properties.load(fis);
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        String browserName = properties.getProperty("browser");

        if(browserName.equals("firefox")){

            System.setProperty("webdriver.gecko.driver", "D:\\JavaEverything\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browserName.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "D:\\JavaEverything\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("IE")){

            //TODO if needed.
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }


}
