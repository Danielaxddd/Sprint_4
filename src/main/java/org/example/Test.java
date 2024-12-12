package org.example;

import io.github.bonigarcia.wdm.*;
import org.example.ForPageObject.ElementsOfMainPage;
import org.example.ForPageObject.FormAboutRentPage;
import org.example.ForPageObject.FormForWhomScooterPage;
import org.example.ForPageObject.PopApMakeOrderPage;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    @org.junit.Test
    public void startUpDropDownListCheck(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        mainPage.DropDownListCheck();
        driver.quit();
    }
    @org.junit.Test
    public void startUpTestChromeButtonTop() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        ElementsOfMainPage.clickOrderButtonTop();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.MakeOrderForWhom("Ольга", "Ермакова", "Москва ул. флотская д. 3", "Черкизовская", "89163753229");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.MakeOrderAboutRentButtonTop();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        driver.quit();
    }
    @org.junit.Test
    public void startUpTestChromeButtonBot() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsOfMainPage.scrollToButtonBot();
        ElementsOfMainPage.clickOrderButtonBot();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.MakeOrderForWhom("Ольга", "Ермакова", "Москва ул. флотская д. 3", "Черкизовская", "89163753229");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.MakeOrderAboutRentButtonTop();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        driver.quit();
    }


    @org.junit.Test
    public void startUpFireFoxButtonTop() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        ElementsOfMainPage.clickOrderButtonTop();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.MakeOrderForWhom("Максим", "Мельник", "Москва ул. авиаторов д. 6", "Сокольники", "89163756729");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.MakeOrderAboutRentButtonTop();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        driver.quit();
    }
    @org.junit.Test
    public void startUpFireFoxButtonBot() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsOfMainPage mainPage = new ElementsOfMainPage(driver);
        ElementsOfMainPage.scrollToButtonBot();
        ElementsOfMainPage.clickOrderButtonBot();
        FormForWhomScooterPage formForWhomScooterPage = new FormForWhomScooterPage(driver);
        formForWhomScooterPage.MakeOrderForWhom("Максим", "Мельник", "Москва ул. авиаторов д. 6", "Сокольники", "89163756729");
        FormAboutRentPage formAboutRentPage = new FormAboutRentPage(driver);
        formAboutRentPage.MakeOrderAboutRentButtonTop();
        PopApMakeOrderPage popApMakeOrderPage = new PopApMakeOrderPage(driver);
        popApMakeOrderPage.FinishOrderButtonTop();
        driver.quit();
    }

}