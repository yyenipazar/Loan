package Stepdefinition;

import Framework.webpages.CompanyPage;
import Framework.webpages.LoanManagerPage;
import Framework.webpages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoanManagerSD {
    private CompanyPage companyPage = new CompanyPage();
    private LoginPage loginPage = new LoginPage();
    private LoanManagerPage loanManagerPage = new LoanManagerPage();


    @When("^I login to the Loan manager page$")
    public void setLoanManagerPage() throws InterruptedException {
        loginPage.login();
        companyPage.selectCompany();
    }

    @And("^I verify \"Loans\",Profile picture,\"New Loan\",\"Reports\",\"Loan Status\" is enabled$")
    public void enableLoansProfilepictureNewloanReportLoanStatus() throws InterruptedException {
        loanManagerPage.openSearchBox();
        Assert.assertTrue(loanManagerPage.isLoansEnable());
        Assert.assertTrue(loanManagerPage.isProfileEnable());
        Assert.assertTrue(loanManagerPage.isNewLoanEnable());
        Assert.assertTrue(loanManagerPage.isReportsEnable());
        Assert.assertTrue(loanManagerPage.isLoanStatusEnable());
    }

    @And("^I verify \"Loans\",Profile picture,\"New Loan\",\"Reports\",\"Loan Status\" is displayed$")
    public void displayedLoansProfilepictureNewloanReportLoanStatus() throws InterruptedException {
        Assert.assertTrue(loanManagerPage.isLoansDisplayed());
        Assert.assertTrue(loanManagerPage.isProfileDisplayed());
        Assert.assertTrue(loanManagerPage.isNewLoanDisplayed());
        Assert.assertTrue(loanManagerPage.isReportsDisplayed());
        Assert.assertTrue(loanManagerPage.isLoanStatusEnable());
    }

    @And("^I select \"Approved\" as the loan status$")
    public void approvedLoanStatus() throws InterruptedException {
        loanManagerPage.openLoanStatusBox();
        loanManagerPage.selectApprovedLoanStatus();
    }

    @Then("^I validate amount of Approved loan status is 59$")
    public void validateAmount() throws InterruptedException {
        Assert.assertEquals(loanManagerPage.verifyApprovedAmount(),"59");
    }

    @Then("^All results that loans displayed are with status approved$")
    public void check() throws InterruptedException {
        Assert.assertTrue(loanManagerPage.statusApprovedControl());
        loanManagerPage.loanManagerLogout();


    }

}










