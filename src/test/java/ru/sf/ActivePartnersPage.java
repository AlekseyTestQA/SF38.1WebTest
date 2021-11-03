package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActivePartnersPage(WebDriver webDriver) {

    private final static String ACTIVE_PARTNERSPAGE_PAGE_XPATH = "//*[.='Почему вам выгодна наша программа?']";

    public String getCurrentActivePartnersPage() {
        return webDriver.findElement(By.xpath(ACTIVE_PARTNERSPAGE_PAGE_XPATH)).getText();
    }
}
