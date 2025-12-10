package com.example;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BasicTest {
    @Test
    void testPageTitle() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //говорим где находится драйвер Chrome
        WebDriver driver = new ChromeDriver(); // объект для управления браузером Chrome

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");// открываем браузер

        String pageTitle = driver.getTitle(); // заголовок открытой страницы, которую мы получаем

        System.out.println("Проверка заголовка страницы: "); // наш результат в консоли
        System.out.println("Сайт: " + driver.getCurrentUrl());
        System.out.println("Заголовок: " + pageTitle);


        if (pageTitle.contains("Selenium")) { // проверяем есть ли нужное слово в заголовке
            System.out.println("Ура,тест пройден: заголовок содержит Selenium");
        } else {
            System.out.println("Плохо,тест не пройден: в заголовке нет Selenium");
        }

        driver.quit(); // закрываем браузер
    }
}
