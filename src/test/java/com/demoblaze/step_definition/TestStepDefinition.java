package com.demoblaze.step_definition;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefinition {
    ProductPage productPage=new ProductPage();
    @Given("buyer is on the homepage of demoblaze")
    public void buyer_is_on_the_homepage_of_demoblaze() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("buyer adds from {string} category {string}")
    public void buyer_adds_from_category(String category, String product) {
     productPage.getLink(category);
     productPage.getLink(product);
     //WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
     //wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert=Driver.getDriver().switchTo().alert();
   // alert.accept();
    }
    @When("buyer clicks on {string} link")
    public void buyer_clicks_on_link(String link) {
      productPage.getLink(link);
    }

}
