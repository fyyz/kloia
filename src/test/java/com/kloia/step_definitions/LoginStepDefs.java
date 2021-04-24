package com.kloia.step_definitions;

import com.kloia.pages.FaceBookPage;
import com.kloia.pages.GirisYap;
import com.kloia.pages.HomePage;
import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    HomePage homePage = new HomePage();
    GirisYap girisYap = new GirisYap();
    FaceBookPage faceBookPage = new FaceBookPage();

    public LoginStepDefs() throws InterruptedException {
    }

    @Given("user navigates to url")
    public void user_navigates_to_url() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @And("user clicks Giris Yap")
    public void userClicksGirisYap() {

        homePage.clickGirisyap();
    }

    @Then("user clicks Facebook ile giris yap")
    public void userClicksFacebookIleGirisYap() {

        girisYap.clickLoginWithFaceBook();
        girisYap.switchToRelatedTab();
    }

//    @Then("user accepts all cookies in the new page")
//    public void userAcceptsAllCookies() throws InterruptedException {
//        faceBookPage.acceptCookies();
//    }

    @And("user enters email and password and clicks login")
    public void userEntersEmailAndPassword() throws InterruptedException {
        faceBookPage.enterEmail();
        faceBookPage.enterPassword();
        faceBookPage.clickLogin();
        girisYap.switchToRelatedTab();
        Thread.sleep(3000);
    }


    @When("if it is first time user clicks $userName olarak devam et")
    public void userClicks$userNameOlarakDevamEt() {

        faceBookPage.clickContinueAs();
    }

//    @Then("user clicks Uyelik Sözlesmesi sartlarını okudum ve kabul ediyorum")
//    public void userClicksUyelikSozlesmesiSartlariniOkudumVeKabulEdiyorum() {
//
//        girisYap.clickAcceptContract();
//    }

    @And("verify that user logged in successfully")
    public void verifyThatUserLoggedInSuccessfully()  {
        BrowserUtils.waitFor(9);
        Assert.assertTrue(homePage.username.isDisplayed());
    }
}
