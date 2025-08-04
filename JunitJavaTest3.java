import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

    @Tags({
            @Tag("SecondFeature"), @Tag("Smoke")
    })
    class JunitJavaTest3 extends JunitJavaTest {

        @Test
        void fistTest() {
            webdriver().shouldHave(url("https://www.litres.ru/auth/login"));
        }

        @Test
        void secondTest() {
            webdriver().shouldNotHave(url("https://www.litres.ru/auth/login"));
        }


    }
