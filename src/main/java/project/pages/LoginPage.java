package project.pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By emailInput = By.id("input-email");
    By passwordInput = By.id("input-password");
    By submitLoginButton = By.xpath("//input[@value='Login']");

    public LoginPage setEmail(String email){

        waitUntilVisible(submitLoginButton, 10);
        find(emailInput).click();
        find(emailInput).sendKeys(email);
        return this;
    }
     public LoginPage setPassword(String password) {
         find(passwordInput).sendKeys(password);
         return this;
     }
     public MyAccountPage submitLoginForm(){
         find(submitLoginButton).click();
         return new MyAccountPage();
     }

}
