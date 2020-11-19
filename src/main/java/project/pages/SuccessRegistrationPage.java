package project.pages;

import org.openqa.selenium.By;

public class SuccessRegistrationPage extends BasePage {

    By regMessage = By.xpath("//div[@id='content']/h1");

    public String getTextFromSuccessPage(){
        String pageMessage = find(regMessage).getText();
        return pageMessage;
    }

}
