package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private WebDriver driver;
    private WebElement productImage;
    private String productName;
    private String productPrice;
    private WebElement addToCartButton;
    private WebElement addToWishListButton;
    private WebElement compareThisProductButton;

    public Product(WebDriver driver){
        this.driver = driver;
    }

    public Product(WebElement productImage, String productName, String productPrice, WebElement addToCartButton, WebElement addToWishListButton, WebElement compareThisProductButton) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.addToCartButton = addToCartButton;
        this.addToWishListButton = addToWishListButton;
        this.compareThisProductButton = compareThisProductButton;
    }
    public List<Product> getAllItems(By boxContainer) {
        List<Product> products = new ArrayList<>();
        List<WebElement> boxElements = driver.findElements(boxContainer);
        for (WebElement boxElement : boxElements) {
            WebElement productImage = boxElement.findElement(By.xpath(".//div[@class='image']//a"));
            String productName = boxElement.findElement(By.xpath(".//h4//a")).getText();
            String productPrice = boxElement.findElement(By.xpath(".//span[@class='price-tax']")).getText();
            WebElement addToCartButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-shopping-cart')]/parent::button"));
            WebElement addToWishListButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-heart')]/parent::button"));
            WebElement compareThisProductButton = boxElement.findElement(By.xpath(".//i[contains(@class,'fa-exchange')]/parent::button"));

            Product product = new Product(productImage, productName, productPrice, addToCartButton, addToWishListButton, compareThisProductButton);
            products.add(product);
        }
        return products;
    }


    }

}
