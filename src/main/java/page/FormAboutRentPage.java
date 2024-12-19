package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAboutRentPage {

    private WebDriver driver;

    public FormAboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Заголовок вверху формы. Текст "Про аренду"
    private By headerAboutRent = By.className("Order_Header__BZXOb");
    //Поле "Когда привезти самокат"
    private By whenToBringScooter = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Календарь, кнопка 16 декабря
    private By rentDate = By.xpath(".//div[@class = 'react-datepicker__day react-datepicker__day--016']");
    //Срок аренды
    private By timeToRent = By.className("Dropdown-placeholder");
    //Выпадающий список "срок аренды"
    private By dropDownMenuTimeToRent = By.className("Dropdown-menu");
    //Кнопка "Двое суток" в выпадающем списке "Срок аренды"
    private By twoDaysRent = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    // Цвет самоката(Чекбокс)
    private By colourOfScooter = By.className("Order_Checkboxes__3lWSI");
    //Чекбокс "Черный жемчуг"
    private By checkboxBlack = By.id("black");
    //Чекбокс "Серая бузысходность"
    private By checkboxGrey = By.id("grey");
    //Поле "Комментарии для курьера"
    private By commentForCourier = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    //Кнопка "Назад"
    private By buttonBack = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i");
    //Кнопка "Заказать"
    private By buttonMakeOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    //Метод для проверки формы "О самокате"
    public void clickWhenToBringScooter() {
        driver.findElement(whenToBringScooter).click();
    }
    public void clickRentDate() {
        driver.findElement(rentDate).click();
    }
    public void clickTimeToRent() {
        driver.findElement(timeToRent).click();
    }
    public void displayedTimeToRent() {
        driver.findElement(dropDownMenuTimeToRent).isDisplayed();
    }
    public void clickButtonTwoDays() {
        driver.findElement(twoDaysRent).click();
    }
    public void clickCheckBoxGrey() {
        driver.findElement(checkboxGrey).click();
    }
    public void clickMakeOrder() {
        driver.findElement(buttonMakeOrder).click();
    }
    public void makeOrderFormAboutRent(){
        clickWhenToBringScooter();
        clickRentDate();
        clickTimeToRent();
        displayedTimeToRent();
        clickButtonTwoDays();
        clickCheckBoxGrey();
        clickMakeOrder();
    }
}
