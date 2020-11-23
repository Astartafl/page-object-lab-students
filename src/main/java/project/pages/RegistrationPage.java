package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    By firstNameInput = By.xpath("//input[@name='firstname']");
    By secondNameInput = By.xpath("//input[@name='lastname']");
    By emailInput = By.xpath("//input[@name='email']");
    By telephoneInput = By.xpath("//input[@name='telephone']");
    By passwordInput = By.xpath("//input[@name='password']");
    By confirmPasswordInput = By.xpath("//input[@name='confirm']");
    By privacyPolicyCheckbox = By.xpath("//input[@name='agree']");
    By submitRegistrationForm = By.xpath("//input[@type='submit']");
    By dangerMessage = By.xpath("//div[@class='text-danger']");

    public RegistrationPage setFirstName(String firstName) {
        waitUntilVisible(firstNameInput, 10);
        find(firstNameInput).sendKeys(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        find(secondNameInput).sendKeys(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        find(emailInput).sendKeys(email);
        return this;
    }

    public RegistrationPage setTelephone(String setTelephone) {
        find(telephoneInput).sendKeys(setTelephone);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        find(passwordInput).sendKeys(password);
        return this;
    }

    public RegistrationPage confirmPassword(String confirmpassword) {
        find(confirmPasswordInput).sendKeys(confirmpassword);
        return this;
    }

    public RegistrationPage clickPrivacyPolicyCheckbox() {
        find(privacyPolicyCheckbox).click();
        return this;
    }

    public BasePage submitForm() {
        find(submitRegistrationForm).click();
        if (getDriver().getCurrentUrl().contains("register")) {
            return new RegistrationPage();
        } else {
            return new SuccessRegistrationPage();
        }
    }

    public String getDangerMessageText(){
        return find(dangerMessage).getText();
    }
}
