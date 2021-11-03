package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesKiberbezopasnostPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_KIBERBEZOPASNOST_XPATH = "//span[@class='t978__link-inner' and text()='Кибербезопасность']";
    private static final String ERROR_MESSAGE_COURSES_KIBERBEZOPASNOST_CLASS = "//h1[.='Курсы по кибербезопасности']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesKiberbezopasnostPage(String CoursesKiberbezopasnost) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_KIBERBEZOPASNOST_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesKiberbezopasnostPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_KIBERBEZOPASNOST_CLASS)).getText();

    }
}

