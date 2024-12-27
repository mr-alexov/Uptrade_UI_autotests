package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.FirstPage;

import static com.codeborne.selenide.Selenide.open;

@Owner("Ekaterina")
@Feature("Тестирование содержимого главной страницы сайта")
@Tags({@Tag("ui"), @Tag("watchTest")})
public class FirstTests extends TestBase {

    FirstPage firstPage = new FirstPage();

    @Test
    @DisplayName("Название кнопки 'Команда' соответствует требованиям")
    @Story("Позитивный тест")
    public void buttonTeamWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonTeam();
    }

    @Test
    @DisplayName("Кнопка 'Стать клиентом' кликабельна")
    @Story("Позитивный тест")
    public void buttonClientWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonClient();
    }

    @Test
    @DisplayName("Название кнопки 'Стать поставщиком' соответствует требованиям")
    @Story("Позитивный тест")
    public void buttonProducerWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonProducer();
    }

    @Test
    @DisplayName("Название кнопки 'Контакты' соответствует требованиям")
    @Story("Позитивный тест")
    public void buttonContactsWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonContacts();
    }

    @Test
    @DisplayName("Название кнопки 'Стать клиентом' соответствует требованиям")
    @Story("Позитивный тест")
    public void buttonJoinWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonJoin();
    }

    @Test
    @DisplayName("Проверка текста раздела, при переключении кнопок навигации (стрелка вправо)")
    @Story("Позитивный тест")
    public void switchingButtonArrowsTest() {
        firstPage.openPage();
        firstPage.rightButtonArrowsTest();
        firstPage.checkTextAfterSwitchingRightArrowsTest();
    }

    @Test
    @DisplayName("Проверка текста раздела, при переключении кнопок индикатора прогресса (цифра 2)")
    @Story("Позитивный тест")
    public void switchingButtonPaginationTest() {
        firstPage.openPage();
        firstPage.paginationTwoTest();
        firstPage.checkTextAfterSwitchingTwoNumberTest();
    }

    @Test
    @Tag("dummyTest")
    void dummyTest() {
        open("https://duckduckgo.com");

    }

}
