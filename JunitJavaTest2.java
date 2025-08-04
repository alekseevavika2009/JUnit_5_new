import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


    class JunitJavaTest2 extends JunitJavaTest {

        @Test
        @DisplayName("Проверка URL")
        void fistTest() {
            webdriver().shouldHave(url("https://www.litres.ru/auth/login"));
        }

        @Test
        @DisplayName("Epic fail")
        @Disabled("Test is failing")
        void secondTest() {
            webdriver().shouldNotHave(url("https://www.litres.ru/auth/login"));
        }

        @Test
        @DisplayName("Проверка кнопки Забыли пароль")
        void thirdTest() {
            $(byXpath("//*[@id=\"main\"]/div/div/div/div/a/strong")).click();
            webdriver().shouldHave(url("https://platform.productstar.ru/forgot-password"));
        }
    }
