package tests;

import basic.BaseTestChrome;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page.ElementsOfMainPage;
import page.FormAboutRentPage;
import page.FormForWhomScooterPage;
import page.PopApMakeOrderPage;
import org.junit.Test;

@RunWith(Parameterized.class)
public class SamokatFormTestChrome extends BaseTestChrome {
    private final String name;
    private final String surname;
    private final String adress;
    private final String stationMetro;
    private final String phoneNumber;

    public SamokatFormTestChrome(String name, String surname, String adress, String stationMetro, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.stationMetro = stationMetro;
        this.phoneNumber = phoneNumber;
    }

    @Parameterized.Parameters
    public static Object[][] setFormData() {
        return new Object[][]{
                {"Ольга", "Ермакова", "Москва ул. флотская д. 3", "Черкизовская", "89163753229"},
                {"Максим", "Мельник", "Москва ул. авиаторов д. 6", "Сокольники", "89163756729"},
        };
    }


    @Test
    public void startUpButtonTopTest() {
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.clickOrderButtonTop();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.makeOrderWhomScooter(name, surname, adress, stationMetro, phoneNumber);
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.makeOrderFormAboutRent();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        popApMakeOrderPage.watchStatusIsVisible();
    }
    @Test
    public void startUpTestButtonBotTest() {
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.scrollToButtonBot();
        mainPage.clickOrderButtonBot();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.makeOrderWhomScooter(name, surname, adress, stationMetro, phoneNumber);
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.makeOrderFormAboutRent();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        popApMakeOrderPage.watchStatusIsVisible();
    }

}
