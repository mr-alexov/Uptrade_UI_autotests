package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;

public class TeamPage {

    private final SelenideElement buttonJoinTeam = $(".hero-team__button");

    @Step("Нажать на кнопку 'Стать частью команды'")
    public TeamPage clickButtonJoinTheTeam () {
        buttonJoinTeam.click();;
        return this;
    }

}
