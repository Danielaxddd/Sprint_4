package org.example.ForPageObject;

import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class ElementsOfMainPage {

    private static WebDriver driver;

    public ElementsOfMainPage(WebDriver driver){
        this.driver = driver;
    }
// Логотип Яндекса в вверхнем левом углу
 private By LogoYandex = By.className("Header_LogoYandex__3TSOI");
// Логотип "Самокат" в вверхнем левом углу
private By LogoYandex2 = By.className("Header_LogoScooter__3lsAR");
// Подпись "Ученбый тренажер" в вверхнем левом углу
private By LogoDisclaimer = By.className("Header_Disclaimer__3VEni");
// Кнопка заказать вверху справа
private static By OrderButtonTop = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
// Кнопка статус заказа вверху справа
private By OrderStatusButton = By.className("Header_Link__1TAG7");
//Кнопка "да все привыкли" в уведомлении об использовании куки
private static By CookieButton = By.className("App_CookieButton__3cvqF");
// Кнопка заказать внизу
private static By OrderButtonBot = By.className("Button_Button__ra12g Button_UltraBig__UU3Lp");
//Заголовок "Вопросы о важном"
private By HeaderQuestionsAboutImportant = By.xpath(".//div[@class = 'Home_SubHeader__zwi_E' and text() = 'Вопросы о важном']");
// Кнопка вопроса 1
private static By QuestionButton1 = By.id("accordion__heading-0");
// Кнопка вопроса 2
private By QuestionButton2 = By.id("accordion__heading-1");
// Кнопка вопроса 3
private By QuestionButton3 = By.id("accordion__heading-2");
// Кнопка вопроса 4
private By QuestionButton4 = By.id("accordion__heading-3");
// Кнопка вопроса 5
private By QuestionButton5 = By.id("accordion__heading-4");
// Кнопка вопроса 6
private By QuestionButton6 = By.id("accordion__heading-5");
// Кнопка вопроса 7
private By QuestionButton7 = By.id("accordion__heading-6");
// Кнопка вопроса 8
private By QuestionButton8 = By.id("accordion__heading-7");
//Элемент Текст кнопки QuestionButton1
    private By TextQuestionButton1 = By.xpath(".//div[@id = 'accordion__panel-0']/p");
    private String textResultQuestion1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Элемент Текст кнопки QuestionButton2
    private By TextQuestionButton2 = By.xpath(".//div[@id = 'accordion__panel-1']/p");
    private String textResultQuestion2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Элемент Текст кнопки QuestionButton3
    private By TextQuestionButton3 = By.xpath(".//div[@id = 'accordion__panel-2']/p");
    private String textResultQuestion3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Элемент Текст кнопки QuestionButton4
    private By TextQuestionButton4 = By.xpath(".//div[@id = 'accordion__panel-3']/p");
    private String textResultQuestion4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Элемент Текст кнопки QuestionButton5
    private By TextQuestionButton5 = By.xpath(".//div[@id = 'accordion__panel-4']/p");
    private String textResultQuestion5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Элемент Текст кнопки QuestionButton6
    private By TextQuestionButton6 = By.xpath(".//div[@id = 'accordion__panel-5']/p");
    private String textResultQuestion6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Элемент Текст кнопки QuestionButton7
    private By TextQuestionButton7 = By.xpath(".//div[@id = 'accordion__panel-6']/p");
    private String textResultQuestion7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Элемент Текст кнопки QuestionButton8
    private By TextQuestionButton8 = By.xpath(".//div[@id = 'accordion__panel-7']/p");
    private String textResultQuestion8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
//Метод проверки "Вопросы о важном"
public void DropDownListCheck(){
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestionButton8));
    driver.findElement(QuestionButton1).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion1, driver.findElement(TextQuestionButton1).getText());
    driver.findElement(QuestionButton2).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion2, driver.findElement(TextQuestionButton2).getText());
    driver.findElement(QuestionButton3).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion3, driver.findElement(TextQuestionButton3).getText());
    driver.findElement(QuestionButton4).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion4, driver.findElement(TextQuestionButton4).getText());
    driver.findElement(QuestionButton5).click();
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestionButton8));
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion5, driver.findElement(TextQuestionButton5).getText());
    driver.findElement(QuestionButton6).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion6, driver.findElement(TextQuestionButton6).getText());
    driver.findElement(QuestionButton7).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion7, driver.findElement(TextQuestionButton7).getText());
    driver.findElement(QuestionButton8).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals("Ошибка, текст не совпадает",textResultQuestion8, driver.findElement(TextQuestionButton8).getText());
}
    //Клик на кнопку "Заказать" вверху страницы
public static void clickOrderButtonTop(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]")).click();
}
    //Клик на кнопку "Заказать" внизу страницы
public static void clickOrderButtonBot(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div[5]/button")).click();
}
    //Скрол до нижней кнопки "Заказать"
public static void scrollToButtonBot(){
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div[5]/button")));
}
public static void CookieButtonClick(){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(CookieButton).click();
}
}