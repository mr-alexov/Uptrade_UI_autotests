package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InputFormPage {

    private final SelenideElement modalClients = $(".contact-us__form");
    private final SelenideElement elementClose = $(".contact-us__close");
    private final SelenideElement modalJoinTeam = $("form.contact-us__form");
    private final SelenideElement fieldEmail = $(".contact-us__input.invalid#email");


    @Step("Отображение окна 'Стать клиентом'")
    public InputFormPage watchWindowClient() {
        modalClients.shouldBe(visible);
        return this;
    }

    @Step("Нажать на элемент 'Крестик'")
    public InputFormPage closeWindowClient() {
        elementClose.click();
        return this;
    }

    @Step("Отправить пустую форму 'Стать частью команды'")
    public InputFormPage sendEmptyFormJoinTeam() {
        modalJoinTeam.submit();
        return this;
    }

    @Step("Проверить невалидное (пустое) заполнение поля Email в форме 'Стать частью команды'")
    public InputFormPage emailFieldShouldHaveRedBorderOnInvalidInput() {
        fieldEmail.shouldHave(cssValue("outline-color", "rgba(255, 0, 0, 1)"));
        return this;
    }
}
