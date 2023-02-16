package helpers;


import org.openqa.selenium.WebDriver;

public abstract class BaseHelper {

    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }


}