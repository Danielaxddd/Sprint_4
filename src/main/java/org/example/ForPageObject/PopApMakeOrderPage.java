package org.example.ForPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopApMakeOrderPage {

    private WebDriver driver;

    public PopApMakeOrderPage(WebDriver driver){
        this.driver = driver;
    }
    //Заголовок "Хотите оформить заказ" в всплывающем окне
    public By PopApHeader = By.className("Order_ModalHeader__3FDaJ");
    //Кнопка "Нет" в всплывающем окне
    private By PopApNo = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Нет']");
    //Кнопка "Да" в всплывающем окне
    private By PopApYes = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");

    public void FinishOrderButtonTop(){
        driver.findElement(PopApHeader).isDisplayed();
        driver.findElement(PopApYes).click();
    }
}
