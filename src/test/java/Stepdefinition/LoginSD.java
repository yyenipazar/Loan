package Stepdefinition;

import Framework.webpages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSD {
    private LoginPage loginPage = new LoginPage();
    @Given("^I am on login page$")
    public void setLoginPage(){
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://beta-loanpro.simnang.com/client/app/login.html?" );

    }
    @When("^I enter (.+) into (username|password) field on the login page$")
    public void enterDataUserAndPassField(String anyText, String textFields) throws InterruptedException {

        switch (textFields) {
            case "username":
                loginPage.enterUsername(anyText);
                break;
            case "password": {
                loginPage.enterPassword(anyText);
                break;
            }
        }
    }
    @And("^I click on login button on login page$")
    public void pressLoginButton() throws InterruptedException {
        loginPage.clickOnLoginButton();
    }
    @Then("^I verify that login button is enable at Login page$")
    public void verifyEnableLoginButton() throws InterruptedException {
        loginPage.verifyLoginButtonEnable();
        loginPage.logout();

    }
}
