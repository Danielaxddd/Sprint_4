package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormForWhomScooterPage {

    private WebDriver driver;
    private By OrderButtonTop;

    public FormForWhomScooterPage(WebDriver driver){
        this.driver = driver;
    }
    // Заголовок вверху страницы "Для кого самокат"
    private By headerForWhomScooter = By.className("Order_Header__BZXOb");
    // Поле "Имя" формы "Для кого самокат"
    private By inputName = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле "Фамилия" формы "Для кого самокат"
    private By inputSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле "Адрес" формы "Для кого самокат"
    private By inputAdress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Поле "Станция метро" формы "Для кого самокат"
    private By inputMetro = By.xpath(".//input[@placeholder = '* Станция метро']");
    // Поле "Телефон" формы "Для кого самокат"
    private By inputTelephone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // Кнопка "Далее" внизу формы "Для кого самокат"
    private By buttonFurtherFormWhomScooter = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Далее']");

    //Методы для проверки формы заказа "Для кого самокат" обьедененные в один метод.

    public void setName(String name) {
                driver.findElement(inputName).sendKeys(name);
    }
    public void setSurname(String surname) {
        driver.findElement(inputSurname).sendKeys(surname);
    }
    public void setAdress(String adress) {
        driver.findElement(inputAdress).sendKeys(adress);
    }
    public void clickMetro() {
        driver.findElement(inputMetro).click();
    }
    public void clickStationMetro(String stationMetro) {
        driver.findElement(By.xpath(".//*[text() = '"+stationMetro+"']")).click();
    }
    public void setPhone(String phoneNumber) {
        driver.findElement(inputTelephone).sendKeys(phoneNumber);
    }
    public void clickMakeOrder() {
        driver.findElement(buttonFurtherFormWhomScooter).click();
    }
    public void makeOrderWhomScooter(String name, String surname, String adress, String stationMetro, String phoneNumber) {
        setName(name);
        setSurname(surname);
        setAdress(adress);
        clickMetro();
        clickStationMetro(stationMetro);
        setPhone(phoneNumber);
        clickMakeOrder();
    }
}
