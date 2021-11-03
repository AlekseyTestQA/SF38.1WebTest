package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesAnalitikaDannyhPage (WebDriver webDriver) {

    private final static String ACTIVE_COURSES_ANALITIKADANNYH_XPATH = "//h1[.='Курсы по аналитике данных']";

    public String getCurrentActiveCoursesAnalitikaDannyhPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_ANALITIKADANNYH_XPATH)).getText();
    }

}
