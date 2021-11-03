package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesInfrastructurePage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_INFRASTRUCTURE_XPATH = "//h1[.='Курсы по инфраструктуре']";

    public String getCurrentActiveCoursesInfrastructurePage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_INFRASTRUCTURE_XPATH)).getText();
    }

}
