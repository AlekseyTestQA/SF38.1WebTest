package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesDatasciencePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_DATA_SCIENCE = "//span[@class='t978__link-inner' and text()='Data Science']";
    private static final String ERROR_MESSAGE_COURSES_CLASS = "//h1[.='Курсы по Data Science']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesDatasciencePage(String CoursesDatascience) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_DATA_SCIENCE));
        searchCoursesPage.click();

    }

    public String getСoursesDatasciencePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_CLASS)).getText();

    }
}