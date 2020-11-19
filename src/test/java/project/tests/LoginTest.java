package project.tests;

import org.junit.Assert;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.SuccessRegistrationPage;
import util.RandomEmail;

public class LoginTest extends BaseTest {

  private MainPage mainPage;

  @Test
  public void registrationWithValidCredentials() {
    String firtsname = "Anna";
    String secondname = "Anna";
    String email = RandomEmail.generateEmail() + "@mailinator.com";
    String telephone = "+33333333";
    String password = "111111";
    String successRegMessage = "Your Account Has Been Created!";

    mainPage = new MainPage();
    mainPage.openMainPage();

    SuccessRegistrationPage regMessage = (SuccessRegistrationPage) mainPage
            .myAccountButtonClick()
            .registrationPageClick()
            .setFirstName(firtsname)
            .setLastName(secondname)
            .setEmail(email)
            .setTelephone(telephone)
            .setPassword(password)
            .confirmPassword(password)
            .clickPrivacyPolicyCheckbox()
            .submitForm();

    Assert.assertEquals(successRegMessage, regMessage.getTextFromSuccessPage());
  }
  //assertions

}
