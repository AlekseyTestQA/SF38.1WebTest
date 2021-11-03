package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesDesignPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_DESIGN_XPATH = "//h1[.='Курсы по дизайну']";

    public String getCurrentActiveCoursesDesignPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_DESIGN_XPATH)).getText();
    }

}
