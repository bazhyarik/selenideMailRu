package my.selenide.mail;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class LetterContainer{
  SelenideElement recipientEmailSubjectForm = $("input[name=\"Subject\"]");
  SelenideElement recipientEmailBodyForm = $("div[role=\"textbox\"]");

  @Step("Type recipient email")
  public void typeRecipientEmail(String recipient) {
    SelenideElement recipientEmailForm = $("div[data-type=\"to\"]>div>div>label>div>div>input");
    //recipientEmailForm.isDisplayed();
    recipientEmailForm.setValue(recipient);
  }
  @Step("Get recipient email")
  public String getRecipientEmail() {
    SelenideElement getRecipientEmailForm = $("div[data-test-id = \"underlay-wrapper\"]");
    return getRecipientEmailForm.getText();
  }
  @Step("Type letter subject")
  public void typeLetterSubjectForm(String subject) {
    recipientEmailSubjectForm.setValue(subject);
  }
  @Step("Get letter subject")
  public String getLetterSubjectForm() {
    return recipientEmailSubjectForm.getText();
  }
  @Step("Type letter body")
  public void typeLetterBodyForm(String body) {
    recipientEmailBodyForm.setValue(body);
  }
  @Step("Get letter body")
  public String getLetterBodyForm() {
    return recipientEmailBodyForm.getText();
  }
  @Step("Click save button")
  public void clickSaveButton() {
    SelenideElement saveLetterButton = $("button[data-test-id=\"save\"]");
    saveLetterButton.click();
  }
  @Step("Click send button")
  public void clickSendButton() {
    SelenideElement sendLetterButton = $("button[data-test-id=\"send\"]");
    sendLetterButton.click();
  }
  @Step("Click close letter container button after send")
  public void clickCloseSendButton() {
      SelenideElement closeSendButton = $("span[data-highlighted-class=\"button2_highlighted\"][title=\"Закрыть\"]");
      closeSendButton.click();
  }
  @Step("Click close letter container button after save")
  public void clickCloseDraftButton() {
    SelenideElement closeDraftButton = $("button[type=\"button\"][title=\"Закрыть\"]");
    closeDraftButton.click();
  }
}
