package com.kloia.pages;

import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(linkText = "Giriş Yap")
    public WebElement girisYapButton;

    @FindBy(css = "nav.catMenu>ul>li:nth-of-type(5)")
    public WebElement kısıselBtn;

    @FindBy(css = "li.mainCat:nth-of-type(1)>a")
    public WebElement parfumBtn;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")
    public WebElement brandsBtn;

    @FindBy(css = "a[title='Hesabım'][class='menuLink user']")
    public WebElement username;

    @FindBy(className = "myAccount")
    public WebElement getMyAccountMenu;

    @FindBy(className = "a[class='menuLink user']")
    public WebElement accountName;

    @FindBy(css = "myAccount")
    public WebElement myAccount;

    @FindBy(css = ".columnContent.p10>ul>li")
    public List<WebElement> allFooterLinks;

    public List<String> writeFooterLinksToTextFile() {
        return BrowserUtils.getElementsText(allFooterLinks);
    }

    public void clickGirisyap() {

        girisYapButton.click();
    }

//    public boolean isMyAccountVisible()  {
//        BrowserUtils.waitForClickablility(username, 10);
//        return username.isDisplayed();
//    }






}
