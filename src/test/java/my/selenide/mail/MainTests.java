package my.selenide.mail;

import io.qameta.allure.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Epic("MailRu")
@Feature("Тестирование почтового сервиса")
@Severity(SeverityLevel.NORMAL)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTests extends BaseTest {

  private final static String EMAIL_RECIPIENT = "101-2019@mail.ru";
  private final static String EMAIL_SUBJECT = "TestLetter#1";
  private final static String EMAIL_BODY = "TestITbody";
  Sidebar sidebar = new Sidebar();
  DraftsPage draftsPage = new DraftsPage();
  LetterContainer letterContainer = new LetterContainer();

  @Test
  @Order(1)
  @Story("Первый сценарий")
  @Description("Вход,новое письмо,Черновик,отправить письмо")
  void makeNewLetter() {
    portalPage.verifyLogin(BaseTest.LOGIN);
    sidebar.clickSendNewMail();
    letterContainer.typeRecipientEmail(EMAIL_RECIPIENT);
    letterContainer.typeLetterSubjectForm(EMAIL_SUBJECT);
    letterContainer.typeLetterBodyForm(EMAIL_BODY);
    letterContainer.clickSaveButton();
    letterContainer.clickCloseDraftButton();
    sidebar.clickDraftsButton();
    draftsPage.getLetter(EMAIL_SUBJECT, EMAIL_BODY);
    draftsPage.clickToLetter(EMAIL_SUBJECT);
    letterContainer.getLetterBodyForm().equals(EMAIL_BODY);
    letterContainer.getLetterSubjectForm().equals(EMAIL_SUBJECT);
    letterContainer.getRecipientEmail().equals(EMAIL_RECIPIENT);
    letterContainer.clickSendButton();
    letterContainer.clickCloseSendButton();
    sidebar.clickDraftsButton();
    draftsPage.notLetter();
    sidebar.clickSentButton();
    draftsPage.getLetter(EMAIL_SUBJECT, EMAIL_BODY);
  }
}
