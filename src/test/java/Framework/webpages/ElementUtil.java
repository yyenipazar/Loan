package Framework.webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static Stepdefinition.SharedSD.getDriver;

public class ElementUtil {

    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "WebDriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");
        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
              return driver.findElement(locator);
        }
       });
    }
    public static void clickOn(By locator) {
        webAction(locator).click();
    }
    public void setValue(By locator, String value) {
        webAction(locator).sendKeys(value);
    }
    public String getTextFromElement(By locator) {
        return webAction(locator).getText();
    }
    public boolean isElementDisplayed(By locator) {
        return webAction(locator).isDisplayed();
    }
    public boolean isElementSelected(By locator) {
        return webAction(locator).isSelected();
    }
    public void selectFromDropdown(By locator, String dropdownText) {
        WebElement month = webAction(locator);
        Select selectMonth = new Select(month);
        //select element by visible text
        selectMonth.selectByVisibleText(dropdownText);
    }
    public void selectFromDropdown(By locator, int index) {
        WebElement month = webAction(locator);
        Select selectMonth = new Select(month);
        //select element by index
        selectMonth.selectByIndex(index);
    }
    public boolean isElementEnabled(By locator) {
        return webAction(locator).isEnabled();
    }
    public List<WebElement> webElements(By locator){
        return getDriver().findElements(locator);

    }

    public void moveToElement(By locator){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webAction(locator)).build().perform();
    }

}


