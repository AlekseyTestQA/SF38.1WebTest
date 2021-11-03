package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record AdresStartPage (WebDriver webDriver) {

    private final static String ACTIVE_START_PAGE_XPATH = "//*[.='Выберите свое будущее:']";

    public String getCurrentActiveStartPage() {
        return webDriver.findElement(By.xpath(ACTIVE_START_PAGE_XPATH)).getText();
    }
}
