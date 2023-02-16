package hellocucumber;

import helpers.HeaderHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;
import utils.WebDriverFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.PropertiesFactory.getProperty;

public class StepDefinitions {
    WebDriver driver;

    HeaderPage headerPage;

    HeaderHelper headerHelper;

    @Before
    public void initializeBrowser() {
        driver = WebDriverFactory.getDriver(getProperty("driver"));
        headerPage = new HeaderPage(driver);

        headerHelper = new HeaderHelper(driver);

    }

    @After
    public void closePage() {
        driver.quit();
    }

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @Given("user opens home page")
    public void open_home_page() {
        driver.get(getProperty("url"));
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @When("click on  button")
    public void clickOnDiznaysyButtonElement() {
        headerHelper.clickAndWaitJs(headerPage.getDiznaysaChomyButtonElement());
    }
    @When("click on developer course")
    public void clickOnDeveloperButtonElement() {
        headerHelper.clickAndWaitJs(headerPage.getDevelopment());
    }
    @When("click on Java course")
    public void clickOnJavaButtonElement() {
        headerHelper.clickAndWaitJs(headerPage.getJava());
    }
    @When("click on JavaBasic course")
    public void clickOnJavaBasicButtonElement() {
        headerHelper.clickAndWaitJs(headerPage.getJavaBasic());
    }

    @When("click on city Dnipro button")
    public void clickOnCytiDnipro() {
        headerHelper.clickAndWaitJs(headerPage.getCityDnipro());
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Then("user checks alarm tale")
    public void checkAlarmTale() {
        assertTrue(headerPage.getAlarmTaleElement().isDisplayed());
    }


    @When("click on {string} button")
    public void clickOnDiznaysyButtonElement(String str) {
        headerHelper.clickAndWaitJs(headerPage.getDiznaysaChomyButtonElement());
    }

    @Then("page is open")
    public void pageIsOpen() {
        assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://blog.ithillel.ua/articles/removing-the-russian-language"));
    }

    @Then("page is open with city Dnipro")
    public void pageIsOpenDnipro() {
        assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://dnipro.ithillel.ua/"));
    }
    @Then("check developer text")
    public void pageDeveloperCourse() {
        assertTrue(driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/main//div[2]/button")).isDisplayed());
    }
    @Then("check text - basic level")
    public void pageJavaBasic() {
        assertTrue(driver.findElement(By.xpath("//*[@id=\"body\"]//section[1]//div[1]/span[2]")).isDisplayed());
    }
}