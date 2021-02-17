package Framework.webpages;

import org.openqa.selenium.By;

public class CompanyPage extends ElementUtil {

    private LoginPage loginPage=new LoginPage();

    private By selectedCompany= By.xpath("//td[text()='Smoke Test Company']");

    public void selectCompany() throws InterruptedException {
        clickOn(selectedCompany);
        Thread.sleep(2000);
        }
        public void verifyCompanySelectionEnable() throws InterruptedException {
        isElementEnabled(selectedCompany);
        Thread.sleep(2000);
        }
    }



