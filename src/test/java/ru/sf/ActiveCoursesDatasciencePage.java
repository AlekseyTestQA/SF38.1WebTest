package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesDatasciencePage (WebDriver webDriver) {

    private final static String ACTIVE_COURSES_PAGE_XPATH = "//h1[.='Курсы по Data Science']";

    public String getCurrentActiveCoursesDatasciencePage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_PAGE_XPATH)).getText();
    }
}
