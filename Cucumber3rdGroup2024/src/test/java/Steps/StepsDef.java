package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class StepsDef {
    WebDriver driver;

    @Given("login page is displayed")
    public void login_page_is_displayed() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @And("I enter password (.*)$")
    public void i_enter_password_password(String password) throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Homepage is displayed")
    public void homepage_is_displayed() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();
        Thread.sleep(3000);
    }


    //add items to cart

//    @Given("Products page is displayed")
//    public void productsPageIsDisplayed() {
//    }
//
//    @And("select products")
//    public void selectProducts() throws InterruptedException {
//        driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')])"));
//        Thread.sleep(3000);
//    }
//
//    @When("I click cart icon")
//    public void iClickCartIcon() {
//
//    }
//
//    @Then("cart page is displayed")
//    public void cartPageIsDisplayed() {
//    }

    @Given("Products page is displayed2")
    public void productsPageIsDisplayed2() {
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();

    }


    @And("select product")
    public void selectProduct() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
    }

    @When("i click cart icon")
    public void iClickCartIcon() {
    }

    @Then("cart page is displayed")
    public void cartPageIsDisplayed() {
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }


}
