package my.selenide.mail;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage<LoginPage> {

  public void typeLogin(String login) {
    $("input[name=\"username\"]").setValue(login);
  }

  public void clickLoginNext() {
    $("button[data-test-id=\"next-button\"]").click();
  }

  public void typePassword(String password) {
    $("input[name=\"password\"]").setValue(password);
  }
  public void clickSubmitPassword(){
    $("button[data-test-id=\"submit-button\"]").click();
  }
}
