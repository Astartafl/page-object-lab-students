package project.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

  public MainPage openMainPage() {
    getDriver().get("https://demo.opencart.com/");
    return this;
  }



}
