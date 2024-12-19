package page;

import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class ElementsOfMainPage {

    public static WebDriver driver;

    public ElementsOfMainPage(WebDriver driver){
        this.driver = driver;
    }
    //ссылка на сайт ЯндексСамокат
   private String linkOnSite = ("https://qa-scooter.praktikum-services.ru/");
// Логотип Яндекса в вверхнем левом углу
 private By logoYandex = By.className("Header_LogoYandex__3TSOI");
// Логотип "Самокат" в вверхнем левом углу
private By logoYandex2 = By.className("Header_LogoScooter__3lsAR");
// Подпись "Ученбый тренажер" в вверхнем левом углу
private By logoDisclaimer = By.className("Header_Disclaimer__3VEni");
// Кнопка заказать вверху справа
private static By orderButtonTop = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
// Кнопка статус заказа вверху справа
private By orderStatusButton = By.className("Header_Link__1TAG7");
//Кнопка "да все привыкли" в уведомлении об использовании куки
private static By cookieButton = By.className("App_CookieButton__3cvqF");
// Кнопка заказать внизу
private static By orderButtonBot = By.xpath(".//div/button[@class = 'Button_Button__ra12g Button_UltraBig__UU3Lp']");
//Заголовок "Вопросы о важном"
private By headerQuestionsAboutImportant = By.xpath(".//div[@class = 'Home_SubHeader__zwi_E' and text() = 'Вопросы о важном']");


//Метод проверки "Вопросы о важном"
public void faqQuestionsTest(String answer, int number){
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("accordion__heading-" + number)));
    driver.findElement(By.id("accordion__heading-" + number)).click();
    Assert.assertEquals("Ошибка, текст не совпадает",answer, driver.findElement(By.xpath(".//div[@id = 'accordion__panel-" + number + "']/p")).getText());
}
    //Клик на кнопку "Заказать" вверху страницы
public static void clickOrderButtonTop(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(orderButtonTop).click();
}
    //Клик на кнопку "Заказать" внизу страницы
public static void clickOrderButtonBot(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(orderButtonBot).click();
}
    //Скрол до нижней кнопки "Заказать"
public static void scrollToButtonBot(){
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(orderButtonBot));
}
public static void CookieButtonClick(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(cookieButton).click();
}
}
