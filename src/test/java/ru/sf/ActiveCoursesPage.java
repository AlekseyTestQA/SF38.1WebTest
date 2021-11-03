package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesPage (WebDriver webDriver) {

    private final static String ACTIVE_COURSES_PAGE_XPATH = "//*[.='ВСЕ КУРСЫ']";

    public String getCurrentActiveCoursesPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_PAGE_XPATH)).getText();
    }
}
