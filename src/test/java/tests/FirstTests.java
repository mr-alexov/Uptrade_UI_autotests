package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FirstPage;
import pages.InputFormPage;
import pages.TeamPage;

@Tag("watchTest")
public class FirstTests extends TestBase {

    FirstPage firstPage = new FirstPage();
    InputFormPage inputFormPage = new InputFormPage();
    TeamPage teamPage = new TeamPage();

    @Test
    @DisplayName("Название кнопки 'Команда' соответствует требованиям")
    public void buttonTeamWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonTeam();
    }

    @Test
    @DisplayName("Кнопка 'Стать клиентом' кликабельна")
    public void buttonClientWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonClient();
    }

    @Test
    @DisplayName("Название кнопки 'Стать поставщиком' соответствует требованиям")
    public void buttonProducerWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonProducer();
    }

    @Test
    @DisplayName("Название кнопки 'Контакты' соответствует требованиям")
    public void buttonContactsWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonContacts();
    }

    @Test
    @DisplayName("Название кнопки 'Стать клиентом' соответствует требованиям")
    public void buttonJoinWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonJoin();
    }

    @Test
    @DisplayName("Отображение окна с формой ввода, при нажатии на кнопку 'Стать клиентом' ")
    public void buttonJoinClickTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.watchWindowClient();
    }

    @Test
    @DisplayName("Закрытие окна с формой ввода, при нажатии на элемент 'Крестик' ")
    public void closeWindowTest() {
        firstPage.openPage();
        firstPage.clickButtonJoin();
        inputFormPage.closeWindowClient();
    }

    @Test
    @DisplayName("Отображение красной рамки на поле 'Email', при незаполненной форме 'Стать частью команды' ")
    public void watchWindowJoinTeamTest() {
        firstPage.openPage();
        firstPage.clickButtonTeam();
        teamPage.clickButtonJoinTheTeam();
        inputFormPage.sendEmptyFormJoinTeam();
        inputFormPage.emailFieldShouldHaveRedBorderOnInvalidInput();
    }
}
