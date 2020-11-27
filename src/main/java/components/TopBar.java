package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import components.enums.TopMenuComponents;

public class TopBar {
    public static WebDriver webDriver;
    private static WebDriverWait wait;
    public TopBar(WebDriver driver){
        webDriver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    private By myAccountButton = By.xpath("//a[@title='My Account']");
    private By registerButton = By.xpath("//a[text()='Register']");
    private By loginButton = By.xpath("//a[text()='Login']");

    public TopBar select

}
