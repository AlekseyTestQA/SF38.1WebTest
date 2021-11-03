package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveFreePage (WebDriver webDriver) {

    private final static String ACTIVE_FREE_PAGE_XPATH = "//h1[@class='tn-atom' and @field='tn_text_1569501490473' and 'Бесплатные мероприятия и программы']";

    public String getCurrentActiveFreePage() {
        return webDriver.findElement(By.xpath(ACTIVE_FREE_PAGE_XPATH)).getText();
    }
}
