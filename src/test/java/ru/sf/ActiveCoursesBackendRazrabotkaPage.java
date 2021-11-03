package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesBackendRazrabotkaPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_BACKENDRAZRABOTKA_XPATH = "//h1[.='Курсы по Backend-разработке']";

    public String getCurrentActiveCoursesBackendRazrabotkaPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_BACKENDRAZRABOTKA_XPATH)).getText();
    }

}
