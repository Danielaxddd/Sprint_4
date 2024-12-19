package tests;

import basic.BaseTestMozilla;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page.ElementsOfMainPage;
import page.FormAboutRentPage;
import page.FormForWhomScooterPage;
import page.PopApMakeOrderPage;
import org.junit.Test;

//Не получается удалить из гита файлы .idea и target.
// В гитигнор получилось засунуть их.
// Но из-за того первый раз запушила с ними, теперь не получается их удалить. Спрашивала у наставника но то что он подсказал не помогло.

@RunWith(Parameterized.class)
public class SamokatFormTestMozilla extends BaseTestMozilla {

    private final String name;
    private final String surname;
    private final String adress;
    private final String stationMetro;
    private final String phoneNumber;

    public SamokatFormTestMozilla(String name, String surname, String adress, String stationMetro, String phoneNumber) {
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
    }
    @Test
    public void startUpButtonBotTest() {
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.scrollToButtonBot();
        mainPage.clickOrderButtonBot();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.makeOrderWhomScooter(name, surname, adress, stationMetro, phoneNumber);
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.makeOrderFormAboutRent();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
    }
}
