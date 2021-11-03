package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesMarketingPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_MARKETING_XPATH = "//h1[.='Курсы по маркетингу']";

    public String getCurrentActiveCoursesMarketingPage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_MARKETING_XPATH)).getText();
    }

}
