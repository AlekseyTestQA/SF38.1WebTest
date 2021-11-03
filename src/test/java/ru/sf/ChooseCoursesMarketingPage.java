package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesMarketingPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_INFRASTRUCTURE_XPATH = "//span[@class='t978__link-inner' and text()='Маркетинг']";
    private static final String ERROR_MESSAGE_COURSES_INFRASTRUCTURE_CLASS = "//h1[.='Курсы по маркетингу']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesMarketingPage(String CoursesMarketing) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_INFRASTRUCTURE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesMarketingPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_INFRASTRUCTURE_CLASS)).getText();

    }
}

