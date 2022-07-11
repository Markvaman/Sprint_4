package OrderTests;

import PageObjects.OrderPage;
import PageObjects.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.concurrent.TimeUnit;

public class OrderTests {
    private WebDriver driver;


    @Before
    public void openScooterApp() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
    }

    @Test
    public void orderIsCompletedWithFirstDataPackageAndHeightOrderButton() {
        //create object of MainPage
        MainPage objMainPage = new MainPage(driver);
        //click on height order button
        objMainPage.clickOnHeightOrderButton();
        //create object of OrderPage
        OrderPage objOrderPage = new OrderPage(driver);
        //enter name to name field
        objOrderPage.setNameToNameField("Александр");
        //enter surname to surname field
        objOrderPage.setSurnameToSurnameField("Месс");
        //enter address to address field
        objOrderPage.setAddressToAddressField("Щорса, 60");
        //choose metro Station
        objOrderPage.chooseMetroStation("Спортивная");
        //enter phone number
        objOrderPage.setPhoneNumber("+79502039093");
        //press button Next
        objOrderPage.clickToNextButton();
        //choose rental start date
        objOrderPage.chooseRentalStartDate("13.07.2022");
        //choose rental period
        objOrderPage.chooseFirstRentalPeriod();
        //press order button
        objOrderPage.clickOrderButton();
        //press yes-button in appear window
        objOrderPage.clickYesButton();
        //check successful ok-window
        String expected = "Заказ оформлен";
        String actual = objOrderPage.getOrderOkWindow();
        Assert.assertThat(actual, containsString(expected));

    }

    @Test
    public void orderIsCompletedWithSecondDataPackageAndMiddleOrderButton(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOnMiddleOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setNameToNameField("Поликарп");
        objOrderPage.setSurnameToSurnameField("Поликарпов");
        objOrderPage.setAddressToAddressField("Запрудный, 5");
        objOrderPage.chooseMetroStation("Чистые пруды");
        objOrderPage.setPhoneNumber("+78889997575");
        objOrderPage.clickToNextButton();
        objOrderPage.chooseRentalStartDate("15.07.2022");
        objOrderPage.chooseSecondRentalPeriod();
        objOrderPage.chooseScooterColour();
        objOrderPage.setCommentForCourier("только в дождливый день");
        objOrderPage.clickOrderButton();
        objOrderPage.clickYesButton();
        String expected = "Заказ оформлен";
        String actual = objOrderPage.getOrderOkWindow();
        Assert.assertThat(actual, containsString(expected));


    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
