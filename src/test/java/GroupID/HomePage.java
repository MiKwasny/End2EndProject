package GroupID;

import actions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resourses.browserInitialization;

import java.io.IOException;

public class HomePage extends browserInitialization {

    @Test (priority = 1, dataProvider = "getData")
    public void HomePage(String email, String password) throws IOException
    {


        driver = InitializeDriver();
        driver.get(properties.getProperty("url"));

        Actions.getLogin();
        Actions.logIN(email, password);


    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "nonrestricted@gw.com";
        data[0][1] = "123456";

        data[1][0] = "restricted@gw.com";
        data[1][1] = "123456";

        return data;
    }
}
