package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

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
    private final SelenideElement rightArrow = $(".hero__swiper-button--next");
    private final SelenideElement textSection = $x("//h2[text()='Гарантируем лучшие цены']");
    private final SelenideElement paginationTwo = $(".hero__swiper-pagination-item[data-swiper-pagination='2']");


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

    @Step("Нажать на стрелку 'Вправо'")
    public FirstPage rightButtonArrowsTest() {
        rightArrow.click();
        return this;
    }

    @Step("Проверка текста раздела, после переключения стрелки 'Вправо'")
    public FirstPage checkTextAfterSwitchingRightArrowsTest() {
        textSection.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }

    @Step("Нажать на кнопку индикатора прогресса '2'")
    public FirstPage paginationTwoTest() {
        paginationTwo.click();
        return this;
    }

    @Step("Проверка текста раздела, после переключения цифры '2'")
    public FirstPage checkTextAfterSwitchingTwoNumberTest() {
        textSection.shouldHave(Condition.text("Гарантируем лучшие цены"));
        return this;
    }
}



