package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



//Имплементация паттерна Page Object Model
public record ChooseCoursesPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_CLASS = "//*[.='Курсы']";
    private static final String ERROR_MESSAGE_COURSES_CLASS = "//*[.='ВСЕ КУРСЫ']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesPage(String Courses) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_CLASS));
        searchCoursesPage.click();

    }

    public String getСoursesPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_CLASS)).getText();

    }
}