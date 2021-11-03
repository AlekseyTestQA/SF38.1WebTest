package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesRazrabotkaMobilnyhPrilozheniyPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_TESTIROVANIE_XPATH = "//h1[.='Курсы по разработке мобильных приложений']";

    public String getCurrentActiveCoursesRazrabotkaMobilnyhPrilozheniyPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_TESTIROVANIE_XPATH)).getText();
    }

}
