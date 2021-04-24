package com.kloia.step_definitions;

import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailLogin {
    @Given("Login")
    public void login() {
        Driver.get().get("https://www.n11.com/giris-yap");
        BrowserUtils.waitForPageToLoad(20);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        WebElement element = Driver.get().findElement(By.cssSelector("span[class='seg-popup-close']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

//        WebElement element = Driver.get().findElement(By.cssSelector(".dn-slide-deny-btn:nth-of-type(1)"));
//        BrowserUtils.waitForClickablility(element, 20);
//        element.click();
//        Driver.get().findElement(By.id("email")).sendKeys("feyyazankara07@gmail.com");
//        Driver.get().findElement(By.id("password")).sendKeys("Ankara06+");
//        Driver.get().findElement(By.id("loginButton")).click();
    }
}
