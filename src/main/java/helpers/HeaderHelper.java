package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderHelper extends BaseHelper {

    WebDriver driver;

    public HeaderHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void clickAndWaitJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}