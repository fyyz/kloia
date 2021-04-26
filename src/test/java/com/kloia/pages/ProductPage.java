package com.kloia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = "label[for='m-Lacoste']")
    public WebElement lacosteSelectionBox;

    @FindBy(css="#filter-list>li")
    public List<WebElement> allProducts;

    public WebElement getProduct7() {
       WebElement product7 = null;
        for (int i = 0; i < allProducts.size(); i++) {
            if (i == 6) {
                product7 = allProducts.get(6);
            }
        }
        return product7;
    }

    @FindBy(css="h1.pro-title_main")
    public WebElement product7Name;

    @FindBy(css=".btn.btnBlack.confirm")
    public WebElement submitBtn;

    @FindBy(css="h3.productName")
    public WebElement addedProduct;

    @FindBy(css = "div[class*='filter-items dropdown shown']")
    public WebElement brandBtn;

    @FindBy(css = "input[placeholder*='Markalar Ara']")
    public WebElement brandSearchBoxBtn;

    @FindBy(xpath="//*[@id='header']/div/div/div[2]/div[2]/div[3]/a")
    public WebElement navigateToMyFavourite;

    @FindBy(css="a[href='//www.n11.com/hesabim/istek-listelerim']")
    public WebElement myFavouritesBtn;

    @FindBy(xpath="//*[@id='contentProDetail']/div[2]/section/div[3]/div[3]/div[2]/a")
    public WebElement favouriteBtn;

    @FindBy(xpath="//*[@id='addToFavouriteWishListBtn']")
    public WebElement addToFavourite;

















}
