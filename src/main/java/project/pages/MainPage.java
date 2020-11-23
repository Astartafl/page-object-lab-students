package project.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
  By myAccountButton = By.xpath("//a[@title='My Account']");
  By registerButton = By.xpath("//a[text()='Register']");
  By loginButton = By.xpath("//a[text()='Login']");

  public MainPage openMainPage() {
    getDriver().get("https://demo.opencart.com/");
    return this;
  }
  public MainPage myAccountButtonClick(){
    find(myAccountButton).click();
    return this;
  }
  public RegistrationPage registrationPageClick() {
    find(registerButton).click();
    return new RegistrationPage();
  }

  public LoginPage loginPageClick() {
    find(loginButton).click();
    return new LoginPage();
  }


}
