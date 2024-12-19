package tests;

import basic.BaseTestMozilla;
import page.ElementsOfMainPage;
import page.FormAboutRentPage;
import page.FormForWhomScooterPage;
import page.PopApMakeOrderPage;
import org.junit.Test;

public class SamokatFormTestMozilla extends BaseTestMozilla {

    @Test
    public void startUpButtonTopTest() {
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.clickOrderButtonTop();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.makeOrderWhomScooter("Максим", "Мельник", "Москва ул. авиаторов д. 6", "Сокольники", "89163756729");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.makeOrderFormAboutRent();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
    }
    @Test
    public void startUpButtonBotTest() {
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.scrollToButtonBot();
        mainPage.clickOrderButtonBot();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.makeOrderWhomScooter("Ольга", "Ермакова", "Москва ул. флотская д. 3", "Черкизовская", "89163753229");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.makeOrderFormAboutRent();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
    }
}
