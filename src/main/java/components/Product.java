package components;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Product {
    private WebElement productImage;
    private String productName;
    private String productPrice;
    private WebElement addToCartButton;
    private WebElement addToWishListButton;
    private WebElement compareThisProductButton;

    public Product(WebElement productImage, String productName, String productPrice, WebElement addToCartButton, WebElement addToWishListButton, WebElement compareThisProductButton) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.addToCartButton = addToCartButton;
        this.addToWishListButton = addToWishListButton;
        this.compareThisProductButton = compareThisProductButton;
    }
    

}
