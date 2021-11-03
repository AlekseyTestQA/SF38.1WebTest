package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesUpravleniePage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_UPRAVLENIE_XPATH = "//h1[.='Курсы по управлению']";

    public String getCurrentActiveCoursesUpravleniePage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_UPRAVLENIE_XPATH)).getText();
    }

}
