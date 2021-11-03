package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesProgrammirovaniePage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_PROGRAMMIROVANIE_XPATH = "//h1[.='Курсы по программированию']";

    public String getCurrentActiveCoursesProgrammirovaniePage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_PROGRAMMIROVANIE_XPATH)).getText();
    }

}
