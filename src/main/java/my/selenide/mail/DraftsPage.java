package my.selenide.mail;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class DraftsPage {
    ElementsCollection subjects = $$("span[class=\"llc__subject\"]");
    ElementsCollection snippets = $$("span[class=\"llc__snippet\"]");

    public boolean getLetter(String subject, String snippet) {
        return subjects.filterBy(Condition.text(subject)).get(0).getText().equals(subject)
                && snippets.filterBy(Condition.text(snippet)).get(0).getText().equals(snippet);
    }

    public boolean notLetter() {
        return subjects.isEmpty() && snippets.isEmpty();
    }

    public void clickToLetter(String text) {
        subjects.filterBy(Condition.text(text)).get(0).click();
    }
}
