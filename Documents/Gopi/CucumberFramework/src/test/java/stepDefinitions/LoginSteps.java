package stepDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
    WebDriver driver;
	WebDriverWait wait;
	
	@Given("User is on the login Page")
	public void user_is_on_the_login_page() {
		
		WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication");
	    driver.manage().window().maximize();
	}

	@When("User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials_and(String username, String password) {
		 driver.findElement(By.id("email")).sendKeys(username);
	        driver.findElement(By.id("passwd")).sendKeys(password);
	        driver.findElement(By.id("SubmitLogin")).click();
	        driver.findElement(By.id("SubmitLogin")).click();

	}

	@Then("User should be logged in successful")
	public void user_should_be_logged_in_successful() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
		boolean isDisplayed = driver.findElement(By.className("account")).isDisplayed();
        assert isDisplayed;
        driver.quit();
		
	}

	
	
	@When("User enters invalid credentials {string} and {string}")
	public void user_enters_invalid_credentials_and(String username, String password) {
		 driver.findElement(By.id("email")).sendKeys(username);
	        driver.findElement(By.id("passwd")).sendKeys(password);
	        driver.findElement(By.id("SubmitLogin")).click();
	        driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("User should see an error message")
	public void user_should_see_an_error_message() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='Authentication failed.']")));
		boolean isDisplayed = driver.findElement(By.xpath("//li[normalize-space()='Authentication failed.']")).isDisplayed();
        assert isDisplayed;
	}

}
