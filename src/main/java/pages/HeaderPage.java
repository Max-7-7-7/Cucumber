package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {
    WebDriver driver;

    public HeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private final String alarmTale = "//span[contains(text(), 'Вживання')]";
    private final String diznaysaChomyButton = "//a[contains(@href, 'removing-the-russian-language')]";

    @FindBy(xpath = alarmTale)
    private WebElement alarmTaleElement;

    @FindBy(xpath = diznaysaChomyButton)
    private WebElement diznaysaChomyButtonElement;

    /**
     * Get 'Alarm' tale
     *
     * @return {@link WebElement}
     */
    public WebElement getAlarmTaleElement() {
        return alarmTaleElement;
    }

    public WebElement getDiznaysaChomyButtonElement() {
        return diznaysaChomyButtonElement;
    }


    @FindBy(xpath = "//a[contains(text(),'Дніпро')]")
    private WebElement cityDnipro;
    /**
     * Get 'Alarm' tale
     *
     * @return {@link WebElement}
     */
    public WebElement getCityDnipro() {
        return cityDnipro;
    }

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]//ul/li[1]//img")
    private WebElement development;
    public WebElement getDevelopment() {
        return development;
    }
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement java;
    public WebElement getJava() {
        return java;
    }

    @FindBy(xpath = "//*[@id=\"categories\"]//ul/li[2]//ul/li[1]/a/div[2]")
    private WebElement javaBasic;
    public WebElement getJavaBasic() {
        return javaBasic;
    }



}