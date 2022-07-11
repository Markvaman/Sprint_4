package AccordionTests;

import PageObjects.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AccordionTest {
    private WebDriver driver;

    private MainPage objMainPage;

    @Before
    public void openScooterApp() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
        objMainPage = new MainPage(driver);
    }

    @Test
    public void shouldBeFirstAccordionTextsEquals() {
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = objMainPage.clickOnAccordionOneAndGetText();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBeSecondAccordionTextsEquals() {
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objMainPage.clickOnAccordionTwoAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeThirdAccordionTextsEquals() {
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = objMainPage.clickOnAccordionThreeAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeFoursAccordionTextsEquals() {
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objMainPage.clickOnAccordionFourAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeFivesAccordionTextsEquals() {
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objMainPage.clickOnAccordionFiveAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeSixAccordionTextsEquals() {
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objMainPage.clickOnAccordionSixAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeSevenAccordionTextsEquals() {
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objMainPage.clickOnAccordionSevenAndGetText();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeEightAccordionTextsEquals() {
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objMainPage.clickOnAccordionEightAndGetText();
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        //закрыть браузер
        driver.quit();
    }

}
