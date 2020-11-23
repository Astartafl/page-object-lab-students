package project.pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By emailInput = By.xpath("//input[@name='email']");
    By passwordInput = By.xpath("//input[@name='password']");
    By submitLoginButton = By.xpath("//input[@value='Login']");

    public LoginPage setEmail(String email){
        waitUntilVisible(emailInput, 220);
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
