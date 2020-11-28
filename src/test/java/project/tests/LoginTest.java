package project.tests;
import project.pages.MainPage;
import org.junit.Test;
import project.pages.MyAccountPage;
import project.pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;
import static project.pages.BasePage.getDriver;

public class LoginTest extends BaseTest{
    static MainPage mainPage;

    @Test
    public void successfulLoginTest() {
        String email = "accountfortestinglogin@mailinator.com";
        String password = "111111";
        String leftMenuHeader = "My Account";

        mainPage = new MainPage();
        mainPage.openMainPage();

        MyAccountPage login = mainPage
                .getTopBar()
                .myAccountButtonClick()
                .loginPageClick()
                .setEmail(email)
                .setPassword(password)
                .submitLoginForm();

        assertThat(login.getLeftHeaderText().equals(leftMenuHeader));

    }


}
