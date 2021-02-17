package Stepdefinition;

import Framework.webpages.CompanyPage;
import Framework.webpages.LoanManagerPage;
import Framework.webpages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompanySD {

    private CompanyPage companyPage=new CompanyPage();
    private LoginPage loginPage=new LoginPage();
    private LoanManagerPage loanManagerPage=new LoanManagerPage();
    @Given("^I am on Company page$")
    public void setCompanyPage() throws InterruptedException {
        loginPage.login();
    }
    @When("^I select a company name$")
    public void selectACompany() throws InterruptedException {
        companyPage.selectCompany();
    }
    @Then("^I verify that company selection is enabled$")
    public void verifyEnableCompanySelection() throws InterruptedException {
        companyPage.verifyCompanySelectionEnable();
        loanManagerPage.loanManagerLogout();
    }
}
