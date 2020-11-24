package project.tests;

import org.junit.Assert;
import org.junit.Test;
import project.pages.BasePage;
import project.pages.MainPage;
import project.pages.RegistrationPage;
import project.pages.SuccessRegistrationPage;
import util.RandomEmail;

import static org.assertj.core.api.Assertions.assertThat;
import static project.pages.BasePage.getDriver;

public class NegativeRegistrationTest extends BaseTest {

    static MainPage mainPage;

    @Test
    public void registrationWithInvalidCredentials() {
        String firtsname = "Anna";
        String secondname = "Anna";
        String telephone = "+33333333";
        String password = "111111";

        mainPage = new MainPage();
        mainPage.openMainPage();

        mainPage
                .myAccountButtonClick()
                .registrationPageClick()
                .setFirstName(firtsname)
                .setLastName(secondname)
                .setTelephone(telephone)
                .setPassword(password)
                .confirmPassword(password)
                .clickPrivacyPolicyCheckbox()
                .submitForm();
        assertThat(getDriver().getCurrentUrl().contains("register"));

    }

}
