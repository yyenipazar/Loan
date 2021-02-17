package Framework.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static Stepdefinition.SharedSD.getDriver;

public class LoanManagerPage extends ElementUtil {

    private By loans = By.xpath("//span[text()='Loans']");
    private By profile = By.xpath("//a//img[@class='circle-image']");
    private By newLoan = By.xpath("//md-menu[@ap-access-control='tenant.loan.newloan']");
    private By reports = By.xpath("//md-icon[@md-svg-icon='reports']");
    private By LoanStatusDropDownBox = By.cssSelector("md-select[id='loanStatus']");
    private By openSearchBox = By.xpath("//md-icon[text()='view_list']");
    private By loanStatusList = By.xpath("//md-optgroup//md-option//div");
    private By loanStatusText = By.xpath("//div[@ng-repeat='selectedStatus in statusModel track by $index']");
    private By table = By.xpath("//table[@id='loanManagerTable']");
    private By column = By.tagName("//table/tbody/tr/td[8]");
    private By profilePhoto = By.xpath("//a//img[@class='circle-image']");
    private By logoutLoanManager = By.xpath("//a[@ng-click='signOut()']");
    private By amount = By.xpath("(//strong[@class='ng-binding'])[3]");


    public boolean isLoansEnable() throws InterruptedException {
        webAction(loans).isEnabled();
        Thread.sleep(2000);
        return true;
    }

    public boolean isLoansDisplayed() throws InterruptedException {
        webAction(loans).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

    public boolean isProfileEnable() throws InterruptedException {
        webAction(profile).isEnabled();
        Thread.sleep(2000);
        return true;
    }

    public boolean isProfileDisplayed() throws InterruptedException {
        webAction(profile).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

    public boolean isNewLoanEnable() throws InterruptedException {
        webAction(newLoan).isEnabled();
        Thread.sleep(2000);
        return true;
    }

    public boolean isNewLoanDisplayed() throws InterruptedException {
        webAction(newLoan).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

    public boolean isReportsEnable() throws InterruptedException {
        webAction(reports).isEnabled();
        Thread.sleep(2000);
        return true;

    }

    public boolean isReportsDisplayed() throws InterruptedException {
        webAction(reports).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

    public boolean isLoanStatusEnable() throws InterruptedException {
        webAction(loanStatusText).isEnabled();
        Thread.sleep(2000);
        return true;
    }

    public boolean isLoanStatusDisplayed() throws InterruptedException {
        webAction(loanStatusText).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

    public void openSearchBox() throws InterruptedException {
        clickOn(openSearchBox);
        Thread.sleep(2000);
    }

    public void openLoanStatusBox() throws InterruptedException {
        clickOn(LoanStatusDropDownBox);
        Thread.sleep(2000);
    }

    public void selectApprovedLoanStatus() throws InterruptedException {
        Actions action = new Actions(getDriver());
        WebElement optionsList = getDriver().findElement(LoanStatusDropDownBox);
        action.moveToElement(optionsList).click();
        List<WebElement> options = getDriver().findElements(loanStatusList);

        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        for (WebElement option : options) {
            if (option.getText().equals("Approved")) {
                option.click();

            }
        }
        Thread.sleep(5000);
    }

    public String verifyApprovedAmount() throws InterruptedException {

        String amountText = getTextFromElement(amount);
        Thread.sleep(2000);
        return amountText;
    }
    public boolean statusApprovedControl() throws InterruptedException {

        WebElement getTable = getDriver().findElement(table);

        List<WebElement> loanSubStatusColumn = getTable.findElements(column);
        String text = "";
        boolean check=true;
        for (WebElement columns : loanSubStatusColumn) {

            text = columns.getText();
            System.out.println(text);

            if (!text.equals("Approved")) {
                check = false;
            }
        }
            Thread.sleep(2000);
            return check;
        }

    public void loanManagerLogout() throws InterruptedException {
          WebElement profilePhotoButton =new WebDriverWait(getDriver(), 20).until(ExpectedConditions.elementToBeClickable(profilePhoto));
          Actions action =new Actions(getDriver());
          action.moveToElement(profilePhotoButton).click().build().perform();
          Thread.sleep(2000);

          WebElement element = getDriver().findElement(logoutLoanManager);
          JavascriptExecutor executor = (JavascriptExecutor)getDriver();
          executor.executeScript("arguments[0].click();", element);

        }
    }










