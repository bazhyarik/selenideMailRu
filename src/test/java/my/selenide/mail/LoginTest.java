package my.selenide.mail;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class LoginTest extends BasePage<LoginTest> {

  @Step("Login with {username}/{password}")
  public PortalPage login(String username, String password) {
    this.screenshotEntryPage();
    LoginPage loginPage = Selenide.page(LoginPage.class);
    loginPage.typeLogin(username);
    loginPage.clickLoginNext();
    loginPage.typePassword(password);
    loginPage.clickSubmitPassword();
    return Selenide.page(PortalPage.class);
  }
}
