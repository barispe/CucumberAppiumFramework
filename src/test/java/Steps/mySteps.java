package Steps;

import Method.sampleMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;


public class mySteps {

    sampleMethods sampleMethods = new sampleMethods();

    @Given("^I start the application$")
    public void navigeToTheMobileApp() throws MalformedURLException {
        sampleMethods.initializeTest();
    }


    @Then("^I click Water Category$")
    public void clickWaterCat() throws Throwable {
        sampleMethods.clickWater();
    }


    @When("^I back$")
    public void backButton() throws InterruptedException {
        sampleMethods.backToButton();
    }

    @Then("^Go To Basket$")
    public void goToBasket() throws InterruptedException {
        sampleMethods.goToBasket();
    }
    @Then("^I check the price$")
    public void checkPrice() throws InterruptedException {
        sampleMethods.checkPrice();
    }
    @Then("^Remove Products$")
    public void removeProducts() throws InterruptedException {
        sampleMethods.removeProducts();
    }

    @Then("^Basket Confirmed Empty$")
    public void basketConfirmedEmpty() {
        sampleMethods.basketConfirmedEmpty();
    }

    @And("^I skip intro pages$")
    public void SkipIntroPages() throws InterruptedException {
        sampleMethods.SkipIntroPages();

    }
    @Then("^I navigate to Baby Care$")
    public void navigateBabyCare() throws InterruptedException {
        sampleMethods.navigateBabyCare();
    }
    @Then("^I click more categories menu$")
    public void clickMore() throws InterruptedException {
        sampleMethods.clickMoreCat();

    }

    @Then("^I check for homePage$")
    public void ıCheckForHomePage() throws InterruptedException {
        sampleMethods.homePageExist();
    }

    @Then("^I open first product detail$")
    public void OpenFirstProductDetail() throws InterruptedException {
        sampleMethods.clickFirstWater();
    }
    @Then("^I click third product$")
    public void thirdProduct() throws InterruptedException {
        sampleMethods.thirdProduct();
    }

    @Then("^I add product to basket$")
    public void AddProductToBasket() throws InterruptedException {
        sampleMethods.productBasket();
    }

    @Then("^I go to basket$")
    public void GoToBasket() throws InterruptedException {
        sampleMethods.goToBasket();
    }

    @Then("^Clear Cart$")
    public void clearCart() throws InterruptedException {
        sampleMethods.clearCart();
    }
}