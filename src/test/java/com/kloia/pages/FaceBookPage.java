package com.kloia.pages;

import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookPage extends BasePage {


    @FindBy(css = "button[title='Accept All']")
    public WebElement acceptCookiesButton;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "pass")
    public WebElement passwordBox;

    @FindBy(css = "input[name='login']")
    public WebElement loginButton;


//    public void acceptCookies() {
//        String window1 = Driver.get().getWindowHandle();
//        for (String windowHandle : Driver.get().getWindowHandles()) {
//            if (!windowHandle.equals(window1)) {
//                Driver.get().switchTo().window(windowHandle);
//            }
//        }
//        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
//        wait.until(ExpectedConditions.titleContains("Facebook"));
//        BrowserUtils.waitForClickablility(acceptCookiesButton, 100);
//
//        acceptCookiesButton.click();
//    }

    public void enterEmail() {
        BrowserUtils.waitFor(2);
        emailBox.clear();
        emailBox.sendKeys(ConfigurationReader.get("facebookEmail"));
    }

    public void enterPassword() {
        BrowserUtils.waitFor(2);
        passwordBox.clear();
        passwordBox.sendKeys(ConfigurationReader.get("facebookPassword"));
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickContinueAs() {
        System.out.println("Driver.get().getTitle()3 = " + Driver.get().getTitle());
        if (!Driver.get().getTitle().equals("Giriş Yap - n11.com")){

            WebElement continueAsButton = Driver.get().findElement(By.cssSelector("button[name='__CONFIRM__']"));
            if (continueAsButton.isDisplayed()) {
                continueAsButton.click();
            }
        }
    }

}
