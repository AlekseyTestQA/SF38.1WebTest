package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesInfrastructurePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_INFRASTRUCTURE_XPATH = "//span[@class='t978__link-inner' and text()='Инфраструктура']";
    private static final String ERROR_MESSAGE_COURSES_INFRASTRUCTURE_CLASS = "//h1[.='Курсы по инфраструктуре']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesInfrastructurePage(String CoursesInfrastructure) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_INFRASTRUCTURE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesInfrastructurePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_INFRASTRUCTURE_CLASS)).getText();

    }
}

