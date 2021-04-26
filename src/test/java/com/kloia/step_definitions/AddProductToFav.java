package com.kloia.step_definitions;

import com.kloia.pages.HomePage;
import com.kloia.pages.ProductPage;
import com.kloia.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToFav {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    String product7NameExpected = "";

    @Then("user Navigate to Perfume & Deodorant under the Cosmetic & Personal Care tab.")
    public void user_Navigate_to_Perfume_Deodorant_under_the_Cosmetic_Personal_Care_tab() {
        BrowserUtils.waitFor(3);
        homePage.kısıselBtn.click();
        BrowserUtils.waitFor(3);
        homePage.parfumBtn.click();
    }

    @Then("Search for {string} in Brand filter")
    public void search_for_in_Brand_filter(String brand) {
        BrowserUtils.waitFor(5);
        homePage.brandsBtn.click();
        BrowserUtils.waitFor(5);
        productPage.brandSearchBoxBtn.sendKeys(brand);
    }

    @Then("Select Lacoste")
    public void select_Lacoste() {
        BrowserUtils.waitFor(3);
        productPage.lacosteSelectionBox.click();
    }

    @Then("Click 7th product on the search result page")
    public void click_7th_product_on_the_search_result_page() {
        BrowserUtils.waitFor(3);
        productPage.getProduct7().click();
        BrowserUtils.waitFor(3);
        product7NameExpected = productPage.product7Name.getText();

    }

    @When("Add product to the ‘Favorites'")
    public void add_product_to_the_Favorites() {
        BrowserUtils.waitFor(5);
        productPage.favouriteBtn.click();
        BrowserUtils.waitFor(7);
        productPage.addToFavourite.click();
        BrowserUtils.waitFor(5);
        productPage.submitBtn.click();
    }

    @When("Navigate to Favorites")
    public void navigate_to_Favorites() {
        BrowserUtils.waitFor(5);
        productPage.navigateToMyFavourite.click();
        BrowserUtils.waitFor(5);
        productPage.myFavouritesBtn.click();

    }

    @Then("Verify the product title is the same as with the product details page")
    public void verify_the_product_title_is_the_same_as_with_the_product_details_page() {
        BrowserUtils.waitFor(5);
        System.out.println("product7NameExpected = " + product7NameExpected);

        String actualResult = productPage.addedProduct.getText();
        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(product7NameExpected,actualResult);
    }

}
