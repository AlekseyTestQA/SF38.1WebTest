package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



//Имплементация паттерна Page Object Model
public record ChooseStartPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String ERROR_MESSAGE_SPAN_CLASS = "//*[.='Выберите свое будущее:']";

    public void go() {
        webDriver.get(URL);
    }

    public String getStartPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_SPAN_CLASS)).getText();

    }
}