package project.pages;

import components.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductsMonitorsPage extends BasePage{
    private Product product;
    private By wishListSuccessAddMessage = By.xpath("//div[contains(@class,'alert-success')]//a[1]");
    private By closeSuccessMessageButton = By.xpath("//button[@class='close']");
    private By boxContainers = By.xpath("//div[@class='product-thumb']");

    public ProductsMonitorsPage(){
        this.product = new Product(driver);
    }

    public ProductsMonitorsPage addToWishList(String...productNames){
        List<Product> allProductsFromPage = product.getAllItems(boxContainers);
        for(String productName : productNames){
            for(Product product : allProductsFromPage){
                if (product.getName().contains(productName)){
                    Actions(driver).moveToElement(product.get).build().perform()
                }
            }
        }

    }
}
