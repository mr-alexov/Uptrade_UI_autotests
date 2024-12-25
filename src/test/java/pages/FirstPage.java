package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstPage {

    public String team = "Команда";
    public String producer = "Стать поставщиком";
    public String contacts = "Контакты";
    public String join = "Стать клиентом";

    private final SelenideElement buttonTeam = $(".nav-section__link");
    private final SelenideElement buttonClient = $(".contact-us__open.hero__contact-us");
    private final SelenideElement buttonProducer = $("[data-role ='provider']");
    private final SelenideElement buttonContacts = $(".hero__login");
    private final SelenideElement buttonJoin = $("[data-role ='buyer']");

    @Step("Открыть страницу")
    public FirstPage openPage() {
        open("/");
        return this;
    }

    @Step("Проверить текст кнопки 'Команда'")
    public FirstPage checkButtonTeam() {
        buttonTeam.shouldHave(text(team));
        return this;
    }

    @Step("Проверить кликабельность кнопки 'Стать клиентом'")
    public FirstPage checkButtonClient() {
        buttonClient.shouldBe(clickable);
        return this;
    }

    @Step("Проверить текст кнопки 'Стать поставщиком'")
    public FirstPage checkButtonProducer() {
        buttonProducer.shouldHave(text(producer));
        return this;
    }

    @Step("Проверить текст кнопки 'Контакты'")
    public FirstPage checkButtonContacts() {
        buttonContacts.shouldHave(text(contacts));
        return this;
    }

    @Step("Проверить текст кнопки 'Стать клиентом'")
    public FirstPage checkButtonJoin() {
        buttonJoin.shouldHave(text(join));
        return this;
    }

    @Step("Нажать на кнопку 'Стать клиентом'")
    public FirstPage clickButtonJoin() {
        buttonJoin.click();
        return this;
    }

    @Step("Нажать на кнопку 'Команда'")
    public FirstPage clickButtonTeam() {
        buttonTeam.click();
        return this;
    }
}



