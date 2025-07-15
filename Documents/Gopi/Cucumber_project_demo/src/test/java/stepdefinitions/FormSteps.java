package stepdefinitions;
import io.cucumber.java.en.*;
import pages.FormPage;
import utils.DriverFactory;

public class FormSteps {
	
	FormPage formPage = new FormPage(DriverFactory.getDriver());
	
	@Given("user is on the practice form page")
	public void user_is_on_the_practice_form_page() {
        DriverFactory.getDriver().get("https://testautomationpractice.blogspot.com/");

	}

	@When("user fills the form with valid data")
	public void user_fills_the_form_with_valid_data() {
        formPage.fillForm();

	}

	@When("user submits the form")
	public void user_submits_the_form() {
        formPage.submitForm();

	}

	@Then("form should be submitted successfully")
	public void form_should_be_submitted_successfully() {
        formPage.verifySuccess();

	}

}
