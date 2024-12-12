package org.example.ForPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormForWhomScooterPage {

    private WebDriver driver;
    private By OrderButtonTop;

    public FormForWhomScooterPage(WebDriver driver){
        this.driver = driver;
    }
    // Заголовок вверху страницы "Для кого самокат"
    private By HeaderForWhomScooter = By.className("Order_Header__BZXOb");
    // Поле "Имя" формы "Для кого самокат"
    private By InputName = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле "Фамилия" формы "Для кого самокат"
    private By InputSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле "Адрес" формы "Для кого самокат"
    private By InputAdress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Поле "Станция метро" формы "Для кого самокат"
    private By InputMetro = By.xpath(".//input[@placeholder = '* Станция метро']");
    // Поле "Телефон" формы "Для кого самокат"
    private By InputTelephone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    // Кнопка "Далее" внизу формы "Для кого самокат"
    private By ButtonFurtherFormWhomScooter = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Далее']");

    //Метод для проверки формы заказа "Для кого самокат"
    public void MakeOrderForWhom(String name, String surname, String adress, String stationMetro, String phoneNumber){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(InputName));
        driver.findElement(InputName).sendKeys(name);
        driver.findElement(InputSurname).sendKeys(surname);
        driver.findElement(InputAdress).sendKeys(adress);
        driver.findElement(InputMetro).click();
        driver.findElement(By.xpath(".//*[text() = '"+stationMetro+"']")).click();
        driver.findElement(InputTelephone).sendKeys(phoneNumber);
        driver.findElement(ButtonFurtherFormWhomScooter).click();
    }

}
