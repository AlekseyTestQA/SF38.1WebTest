package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCorporatePage(WebDriver webDriver) {

    private final static String ACTIVE_CORPORATE_PAGE_XPATH = "//*[.='Корпоративное обучение в SkillFactory']";

    public String getCurrentActiveCorporatePage() {
        return webDriver.findElement(By.xpath(ACTIVE_CORPORATE_PAGE_XPATH)).getText();
    }
}
