package components;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import components.enums.TopMenuComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import project.pages.ProductsMonitorsPage;

public class TopMenu {
    private static WebDriver webDriver;
    private static WebDriverWait wait;
    public TopMenu(WebDriver driver){
         webDriver = driver;
         wait = new WebDriverWait(driver, 10);
    }

    private By desktopDropDown = By.xpath("//li[@class='dropdown']/a[text()='Desktops']");
    private By componentsDropDown = By.xpath("//li[@class='dropdown']/a[text()='Components']");
    private By monitorSubmenuDropDownLink = By.xpath("//a[contains(text(), 'Monitors')]");

    public TopMenu selectCategoryFromDropDown(TopMenuComponents topMenuItem){
        Actions actions = new Actions(webDriver);
        switch(topMenuItem){
            case DESKTOP:
                actions.moveToElement(webDriver.findElement(desktopDropDown)).build().perform();
            break;
            case COMPONENTS:
                actions.moveToElement(webDriver.findElement(componentsDropDown)).build().perform();
            break;
        }
        return this;
    }
    public ProductsMonitorsPage selectSubmenuMonitors(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(monitorSubmenuDropDownLink)).click();
        return new ProductsMonitorsPage();
    }
}
