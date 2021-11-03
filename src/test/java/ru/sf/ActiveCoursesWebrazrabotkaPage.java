package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ActiveCoursesWebrazrabotkaPage(WebDriver webDriver) {

    private final static String ACTIVE_COURSES_WEBRAZRABOTKA_XPATH = "//h1[.='Курсы по веб-разработке']";

    public String getCurrentActiveCoursesProgrammirovaniePage() {
        return webDriver.findElement(By.xpath(ACTIVE_COURSES_WEBRAZRABOTKA_XPATH)).getText();
    }

}
