package my.selenide.mail;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PortalPage extends Header<PortalPage> {

    @Step("Verify Login Successful")
    public PortalPage verifyLogin(String expected) {
        screenshotEntryPage();
        $("div[data-testid= \"whiteline-account\"]").click();
        $(".ph-desc").shouldHave(text(expected));
        return this;
    }
}
