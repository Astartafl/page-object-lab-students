package project.pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {
    By myAccountLeftHeader = By.xpath("//div[@id='content']/h2[1]");
    public String getLeftHeaderText(){
        waitUntilVisible(myAccountLeftHeader, 10);
        return find(myAccountLeftHeader).getText();

    }


}
