package org.example.ForPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAboutRentPage {

    private WebDriver driver;

    public FormAboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Заголовок вверху формы. Текст "Про аренду"
    private By HeaderAboutRent = By.className("Order_Header__BZXOb");
    //Поле "Когда привезти самокат"
    private By WhenToBringScooter = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    // Календарь, кнопка 16 декабря
    private By RentDate = By.xpath(".//div[@class = 'react-datepicker__day react-datepicker__day--016']");
    //Срок аренды
    private By TimeToRent = By.className("Dropdown-placeholder");
    //Выпадающий список "срок аренды"
    private By DropDownMenuTimeToRent = By.className("Dropdown-menu");
    //Кнопка "Двое суток" в выпадающем списке "Срок аренды"
    private By TwoDaysRent = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    // Цвет самоката(Чекбокс)
    private By ColourOfScooter = By.className("Order_Checkboxes__3lWSI");
    //Чекбокс "Черный жемчуг"
    private By CheckboxBlack = By.id("black");
    //Чекбокс "Серая бузысходность"
    private By CheckboxGrey = By.id("grey");
    //Поле "Комментарии для курьера"
    private By CommentForCourier = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    //Кнопка "Назад"
    private By ButtonBack = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i");
    //Кнопка "Заказать"
    private By ButtonMakeOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    //Метод для проверки формы "О самокате"
    public void MakeOrderAboutRentButtonTop() {
        driver.findElement(WhenToBringScooter).click();
        driver.findElement(RentDate).click();
        driver.findElement(TimeToRent).click();
        driver.findElement(DropDownMenuTimeToRent).isDisplayed();
        driver.findElement(TwoDaysRent).click();
        driver.findElement(CheckboxGrey).click();
        driver.findElement(ButtonMakeOrder).click();
    }
}
