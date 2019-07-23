package pageObjects;

import resourses.browserInitialization;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage() {
        PageFactory.initElements(browserInitialization.driver, this);
    }

    @FindBy(how = How.CSS, using = ".pull-right > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)")
    public  WebElement loginButton;

    @FindBy(how = How.ID, using = "user_email")
    public  WebElement emailField;

    @FindBy(how = How.ID, using = "user_password")
    public  WebElement passwordField;

    @FindBy(how = How.CSS, using = ".btn")
    public  WebElement confirmCredentials;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div/h2")
    public  WebElement title;


    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getEmailField(){
        return emailField;
    }

    public WebElement getPasswordField(){
        return passwordField;
    }

    public WebElement getConfirmCredentials(){
        return confirmCredentials;
    }

    public WebElement getTitle(){
        return title;
    }
}
