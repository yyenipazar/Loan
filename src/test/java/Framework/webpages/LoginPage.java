package Framework.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Stepdefinition.SharedSD.getDriver;

public class LoginPage extends ElementUtil {
    private  By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By loginButton= By.xpath("//button[@type='submit']");
    private By profilePhoto=By.xpath("//a//img[@class='circle-image']");
    private By logout=By.xpath("//a[@class='md-lptheme-theme']");


    public void enterUsername (String enterUsername) throws InterruptedException {
        setValue(usernameField,enterUsername);
        Thread.sleep(2000);
    }
    public void enterPassword(String enterPassword) throws InterruptedException {
        setValue(passwordField,enterPassword);
        Thread.sleep(2000);
    }
    public void clickOnLoginButton() throws InterruptedException {
        clickOn(loginButton);
        Thread.sleep(2000);
    }
    public void verifyLoginButtonEnable(){
        isElementEnabled(By.xpath("//button[@type='submit']"));
    }
    public void login() throws InterruptedException {
        enterUsername("tomasg+betaagent2@simnang.com");
       enterPassword("LoginLp!334");
        clickOnLoginButton();
        Thread.sleep(2000);
    }
    public void logout() throws InterruptedException {
        clickOn(profilePhoto);
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout));
        clickOn(logout);
        Thread.sleep(2000);

    }


}

