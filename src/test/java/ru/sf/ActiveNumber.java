package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveNumber (WebDriver webDriver) {
    private final static String ACTIVE_NUMBER_LINK_TEXT = "+7 495 291-09-12";

    public String getCurrentNumber() {
       return webDriver.findElement(By.linkText(ACTIVE_NUMBER_LINK_TEXT)).getText();

    }
}


