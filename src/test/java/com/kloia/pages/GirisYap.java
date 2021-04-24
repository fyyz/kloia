package com.kloia.pages;

import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GirisYap extends BasePage {


    @FindBy(css = ".dn-slide-deny-btn:nth-of-type(1)")
    public WebElement dahaSonraButton;

    @FindBy(css = ".facebook_large")
    public WebElement facebookIleGirisYapButton;

    @FindBy(id = "email")
    public WebElement emailBox;
    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "acceptContract")
    public WebElement acceptContractsCheckBox;

    public void switchToRelatedTab() {

        String window1 = Driver.get().getWindowHandle();
        for (String windowHandle : Driver.get().getWindowHandles()) {
            if (!windowHandle.equals(window1)) {
                Driver.get().switchTo().window(windowHandle);
                break;
            }
        }
//        WebDriverWait wait =new  WebDriverWait(Driver.get(), 10);
//        System.out.println("Driver.get().getTitle()2 = " + Driver.get().getTitle());
//        System.out.println("Driver.get().getWindowHandles().size() = " + Driver.get().getWindowHandles().size());
//        wait.until(ExpectedConditions.elementToBeClickable(acceptContractsCheckBox));
//
//
//        acceptContractsCheckBox.click();
   }

    public void clickLoginWithFaceBook() {
        BrowserUtils.waitForClickablility(dahaSonraButton, 20);
        dahaSonraButton.click();
        facebookIleGirisYapButton.click();



    }

    public void enterEmail() {
        emailBox.sendKeys(ConfigurationReader.get("facebookEmail"));
    }
    public void enterPassword() {
        emailBox.sendKeys(ConfigurationReader.get("facebookPassword"));
    }
}
