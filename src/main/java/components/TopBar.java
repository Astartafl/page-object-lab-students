package components;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.pages.LoginPage;
import project.pages.MainPage;
import project.pages.RegistrationPage;

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

    public TopBar myAccountButtonClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountButton)).click();
        return this;
    }
    public RegistrationPage registrationPageClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
        return new RegistrationPage();
    }

    public LoginPage loginPageClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
        return new LoginPage();
    }
    }


