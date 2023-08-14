
package glue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
import pages.Homepage;
import runner.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class GilletteTests {
    private WebDriver driver;
    ExtentReports reporter;
    ExtentSparkReporter sparkReporter;
    Homepage homePage = new Homepage();
    Base base = new Base();
    Logger log = LoggerHandler.log;
    Homepage homepage = new Homepage();

    @Before
    public void setUp() throws MalformedURLException {
        // Set up ChromeDriver path
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create ChromeDriver instance
        // driver = new ChromeDriver();
        // driver = base.openBrowser();
        
        // driver.manage().window().maximize();
        // reporter = Reporter.generateExtentReport();
    }
    
    @Given("^user on the user registration page$")
    public void user_on_user_registration_page() {
        // Add actual code to simulate user being on the registration page
        System.out.println("User is on the user registration page");
    }

    @When("^user enters a valid user name$")
    public void user_enters_valid_user_name() {
        // Add actual code to simulate user entering a valid user name
        System.out.println("User enters a valid user name");
    }

    @When("^valid e-mail address$")
    public void valid_email_address() {
        // Add actual code to simulate user entering a valid e-mail address
        System.out.println("User enters a valid e-mail address");
    }

    @When("^valid password$")
    public void valid_password() {
        
        System.out.println("User enters a valid password");
    }

    @When("^valid confirmation password$")
    public void valid_confirmation_password() {
        
        System.out.println("User enters a valid confirmation password");
    }

    @When("^valid Birth-date$")
    public void valid_birth_date() {
        
        System.out.println("User enters a valid birth date");
    }

    @When("^valid Gender$")
    public void valid_gender() {
        
        System.out.println("User enters a valid gender");
    }

    @When("^valid phone number$")
    public void valid_phone_number() {
        
        System.out.println("User enters a valid phone number");
    }

    @Then("^user registration should be successful$")
    public void user_registration_should_be_successful() {
        System.out.println("User registration is successful");
    }

    @After
    public void tearDown() {
        driver.quit();
        reporter.flush();
    }
}
