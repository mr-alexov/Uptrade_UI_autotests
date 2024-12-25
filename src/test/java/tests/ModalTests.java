package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.FirstPage;
import pages.InputFormPage;
import pages.TeamPage;

@Owner("Ekaterina")
@Feature("Тестирование модальных окон сайта")
@Tags({@Tag("ui"), @Tag("watchTest")})

public class ModalTests extends TestBase {
    FirstPage firstPage = new FirstPage();
    InputFormPage inputFormPage = new InputFormPage();
    TeamPage teamPage = new TeamPage();

    @Test
    @DisplayName("Отображение окна с формой ввода, при нажатии на кнопку 'Стать клиентом' ")
    @Story("Позитивный тест")
    public void buttonJoinClickTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.watchWindowClient();
    }

    @Test
    @DisplayName("Закрытие окна с формой ввода, при нажатии на элемент 'Крестик' ")
    @Story("Позитивный тест")
    public void closeWindowTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.closeWindowClient();
    }

    @Test
    @DisplayName("Отображение красной рамки на поле 'Email', при незаполненной форме 'Стать частью команды' ")
    @Story("Негативный тест")
    public void watchWindowJoinTeamTest() {
        firstPage.openPage();
        firstPage.clickButtonTeam();
        teamPage.clickButtonJoinTheTeam();
        inputFormPage.sendEmptyFormJoinTeam();
        inputFormPage.emailFieldShouldHaveRedBorderOnInvalidInput();
    }
}
