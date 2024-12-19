package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopApMakeOrderPage {

    private WebDriver driver;

    public PopApMakeOrderPage(WebDriver driver){
        this.driver = driver;
    }
    //Заголовок "Хотите оформить заказ" в всплывающем окне
    public By popApHeader = By.className("Order_ModalHeader__3FDaJ");
    //Кнопка "Нет" в всплывающем окне
    private By popApNo = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text() = 'Нет']");
    //Кнопка "Да" в всплывающем окне
    private By popApYes = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");
    //Окно "Заказ оформлен" -  кнопка посмотреть статус
    private By watchStatus = By.xpath(".//*[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Посмотреть статус']");
    //*[@id="root"]/div/div[2]/div[5]/div[2]/button
        public void visiblePopApHead() {
            driver.findElement(popApHeader).isDisplayed();
        }
        public void clickPopApYes() {
            driver.findElement(popApYes).click();
        }
    public void FinishOrderButtonTop() {
        visiblePopApHead();
        clickPopApYes();
    }
    public void watchStatusIsVisible() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(watchStatus));
        driver.findElement(watchStatus).click();
    }
}
