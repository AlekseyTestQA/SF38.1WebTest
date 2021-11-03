package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesKiberbezopasnostPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_KIBERBEZOPASNOST_XPATH = "//h1[.='Курсы по кибербезопасности']";

    public String getCurrentActiveCoursesKiberbezopasnostPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_KIBERBEZOPASNOST_XPATH)).getText();
    }

}
