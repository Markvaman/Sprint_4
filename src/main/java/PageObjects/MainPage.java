package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    //Кнопка заказать вверху страницы className 'Button_Button__ra12g'
    private By heightOrderButton = By.className("Button_Button__ra12g");

    //Кнопка заказать в середине страницы className 'Button_Button__ra12g Button_Middle__1CSJM'
    private By middleOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    //Заголовок вопросы о важном className 'Home_SubHeader__zwi_E'
    private By questionsHeader = By.className("Home_SubHeader__zwi_E");

    //Аккордеон Сколько это стоит id 'accordion__heading-0'
    private By accordionOne = By.id("accordion__heading-0");

    //Аккордеон Хочу сразу несколько самокатов id 'accordion__heading-1'
    private By accordionTwo = By.id("accordion__heading-1");

    //Аккордеон Как рассчитывается время аренды id 'accordion__heading-2'
    private By accordionThree = By.id("accordion__heading-2");

    //Аккордеон Можно ли заказать сегодня id 'accordion__heading-3'
    private By accordionFour = By.id("accordion__heading-3");

    //Аккордеон Можно ли продлить id 'accordion__heading-4'
    private By accordionFive = By.id("accordion__heading-4");

    //Аккордеон Вы привозите зарядку id 'accordion__heading-5'
    private By accordionSix = By.id("accordion__heading-5");

    //Аккордеон Можно ли отменить id 'accordion__heading-6'
    private By accordionSeven = By.id("accordion__heading-6");

    //Аккордеон Я живу за МКАДом id 'accordion__heading-7'
    private By accordionEight = By.id("accordion__heading-7");


    //click on order button in header
    public void clickOnHeightOrderButton() {
        driver.findElement(heightOrderButton).click();
    }

    //click on middle order button
    public void clickOnMiddleOrderButton() {
        driver.findElement(middleOrderButton).click();
    }

    //find header important questions
    public void findQuestionsHeader() {
        driver.findElement(questionsHeader);
    }

    //click on first accordeon
    public String clickOnAccordionOneAndGetText() {
        driver.findElement(accordionOne).click();
        return driver.findElement(By.id("accordion__panel-0")).getText();
    }

    //click on second accordeon
    public String clickOnAccordionTwoAndGetText() {
        driver.findElement(accordionTwo).click();
        return driver.findElement(By.id("accordion__panel-1")).getText();
    }

    //click on third accordeon
    public String clickOnAccordionThreeAndGetText() {
        driver.findElement(accordionThree).click();
        return driver.findElement(By.id("accordion__panel-2")).getText();
    }

    //click on fours accordeon
    public String clickOnAccordionFourAndGetText() {
        driver.findElement(accordionFour).click();
        return driver.findElement(By.id("accordion__panel-3")).getText();
    }

    //click on fives accordeon
    public String clickOnAccordionFiveAndGetText() {
        driver.findElement(accordionFive).click();
        return driver.findElement(By.id("accordion__panel-4")).getText();
    }

    //click on six accodeon
    public String clickOnAccordionSixAndGetText() {
        driver.findElement(accordionSix).click();
        return driver.findElement(By.id("accordion__panel-5")).getText();
    }

    //click on sevens accordeon
    public String clickOnAccordionSevenAndGetText() {
        driver.findElement(accordionSeven).click();
        return driver.findElement(By.id("accordion__panel-6")).getText();
    }

    //click on eights accordeon
    public String clickOnAccordionEightAndGetText() {
        driver.findElement(accordionEight).click();
        return driver.findElement(By.id("accordion__panel-7")).getText();
    }

}
