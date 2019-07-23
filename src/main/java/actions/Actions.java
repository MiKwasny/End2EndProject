package actions;

import pageObjects.LandingPage;

public class Actions {

    private static LandingPage landingPage = new LandingPage();

        public static void getLogin(){

            landingPage.getLoginButton().click();
        }
        public static void logIN(String email, String password){

            landingPage.getEmailField().sendKeys(email);
            landingPage.getPasswordField().sendKeys(password);
            landingPage.getConfirmCredentials().click();
        }

    public static String getTitle(){

        return landingPage.getTitle().getText();
    }

}
