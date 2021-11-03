package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesRazrabotkaIgrPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_RAZRABOTKAIGR_XPATH = "//span[@class='t978__link-inner' and text()='Разработка игр']";
    private static final String ERROR_MESSAGE_COURSES_RAZRABOTKAIGR_CLASS = "//h1[.='Курсы по разработке игр']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesRazrabotkaIgrPage(String CoursesRazrabotkaIgr) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_RAZRABOTKAIGR_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesRazrabotkaIgrPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_RAZRABOTKAIGR_CLASS)).getText();

    }
}

