package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesProgrammirovaniePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_PROGRAMMIROVANIE_XPATH = "//span[@class='t978__link-inner' and text()='Программирование']";
    private static final String ERROR_MESSAGE_COURSES_PROGRAMMIROVANIE_CLASS = "//h1[.='Курсы по программированию']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesProgrammirovaniePage(String CoursesProgrammirovanie) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_PROGRAMMIROVANIE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesProgrammirovaniePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_PROGRAMMIROVANIE_CLASS)).getText();

    }
}

