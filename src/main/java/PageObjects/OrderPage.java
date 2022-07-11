package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    //order field Name .//input[@placeholder='* Имя']
    private final By orderFieldName = By.xpath(".//input[@placeholder='* Имя']");

    //order field surname .//input[@placeholder='* Фамилия']
    private final By orderFieldSurname = By.xpath(".//input[@placeholder='* Фамилия']");

    //order field address .//input[@placeholder='* Адрес: куда привезти заказ']
    private final By orderFieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //order field metro station .select-search__input
    private final By orderFieldMetro = By.className("select-search__input");

    //order field phone number .//input[@placeholder='* Телефон: на него позвонит курьер']
    private final By orderFieldPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //order button Next .Button_Button__ra12g Button_Middle__1CSJM
    private final By orderButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    //field for choose rental start .//input[@placeholder='* Когда привезти самокат']
    private final By RentStartDay = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //field for choose rental period .Dropdown-placeholder
    private final By rentalPeriodField = By.className("Dropdown-placeholder");

    //option one with rental period .//div[@class='Dropdown-option' and text()='сутки'
    private final By firstRentalPeriod = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    private final By secondRentalPeriod = By.xpath(".//div[@class='Dropdown-option' and text()='трое суток']");

    //colour checkbox black
    private final By colourCheckbox = By.id("black");

    //comments for couriers .//input[@placeholder='Комментарий для курьера']
    private final By commentForCouriers = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    //order button .Button_Button__ra12g Button_Middle__1CSJM
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    //yes-button .//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']
    private final By yesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");

    //order window
    private final By orderIsOkWindow = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    //to enter name
    public void setNameToNameField(String name) {
        driver.findElement(orderFieldName).sendKeys(name);
    }
    //to enter surname
    public void setSurnameToSurnameField(String surname) {
        driver.findElement(orderFieldSurname).sendKeys(surname);
    }
    //to enter address
    public void setAddressToAddressField(String address) {
        driver.findElement(orderFieldAddress).sendKeys(address);
    }
    //to choose metro station
    public void chooseMetroStation(String metroStation) {
        driver.findElement(orderFieldMetro).sendKeys(metroStation + Keys.ARROW_DOWN + Keys.ENTER );
    }
    //to enter phone number
    public void setPhoneNumber(String phone) {
        driver.findElement(orderFieldPhone).sendKeys(phone);
    }
    //click to next button
    public void clickToNextButton() {
        driver.findElement(orderButtonNext).click();
    }
    //choose date of rental start
    public void chooseRentalStartDate(String date) {
        driver.findElement(RentStartDay).sendKeys(date + Keys.ENTER);
    }
    //choose rental period
    public void chooseFirstRentalPeriod() {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(firstRentalPeriod).click();
    }

    public void chooseSecondRentalPeriod() {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(secondRentalPeriod).click();
    }

    //choose scooter colour
    public void chooseScooterColour() {
        driver.findElement(colourCheckbox).click();
    }

    //set comment for courier
    public void setCommentForCourier(String comment) {
        driver.findElement(commentForCouriers).sendKeys(comment);
    }

    //press order button
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    //press yes-button
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    //get order ok window
    public String getOrderOkWindow() {
        return driver.findElement(orderIsOkWindow).getText();

    }


}
