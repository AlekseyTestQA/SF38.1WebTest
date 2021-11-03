package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesRazrabotkaMobilnyhPrilozheniyPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/catalogue";
    private static final String SEARCH_COURSES_TESTIROVANIE_XPATH = "//span[@class='t978__link-inner' and text()='Разработка приложений']";
    private static final String ERROR_MESSAGE_COURSES_TESTIROVANIE_CLASS = "//h1[.='Курсы по разработке мобильных приложений']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesRazrabotkaMobilnyhPrilozheniyPage(String CoursesRazrabotkaMobilnyhPrilozheniy) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_TESTIROVANIE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesRazrabotkaMobilnyhPrilozheniyPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_TESTIROVANIE_CLASS)).getText();

    }
}

