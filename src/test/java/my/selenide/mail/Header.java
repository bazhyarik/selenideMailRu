package my.selenide.mail;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public abstract class Header<Page> extends BasePage<Page> {

  @Step("Logout and go back LoginPage")
  public PortalPage logout() {
    $("div[data-testid= \"whiteline-account\"]").click();
    $("div[data-testid=\"whiteline-account-exit\"]").click();
    this.screenshotEntryPage();
    return Selenide.page(PortalPage.class);
  }
}
