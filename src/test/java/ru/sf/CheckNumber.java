package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record CheckNumber(WebDriver webDriver) {
    private static final String URL = "https://skillfactory.ru/";
    private static final String ERROR_MESSAGE_SPAN_CLASS = "+7 495 291-09-12";

    public void go() {
        webDriver.get(URL);
    }


    public String getNumberNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_SPAN_CLASS)).getText();

    }
}

