package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm() {
        driver.findElement(By.id("name")).sendKeys("Gopi");
        driver.findElement(By.id("email")).sendKeys("gopi@example.com");
        driver.findElement(By.id("phone")).sendKeys("9876543210");
        // Fill other fields
    }

    public void submitForm() {
//        driver.findElement(By.id("submit")).click();
    }

    public void verifySuccess() {
        // Dummy check – add better logic based on alert or success message
        System.out.println("Form submitted");
    }
}