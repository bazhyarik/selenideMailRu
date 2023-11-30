package my.selenide.mail;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Sidebar {
  @Step("Click send new mail button")
  public void clickSendNewMail() {
    SelenideElement newMailButton = $("a[data-title-shortcut = \"N\"]");
    newMailButton.click();
  }

  @Step("Click drafts button")
  public void clickDraftsButton() {
    SelenideElement draftsButton = $x("//*[@class=\"nav__folder-name__txt\"][text()= \"Черновики\"]");
    draftsButton.click();
  }
  @Step("Click sent button")
  public void clickSentButton() {
    SelenideElement sentButton = $x("//*[@class=\"nav__folder-name__txt\"][text()= \"Отправленные\"]");
    sentButton.click();
  }
}
