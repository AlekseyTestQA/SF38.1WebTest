package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesTestirovaniePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_TESTIROVANIE_XPATH = "//span[@class='t978__link-inner' and text()='Тестирование']";
    private static final String ERROR_MESSAGE_COURSES_TESTIROVANIE_CLASS = "//h1[.='Курсы по тестированию']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesTestirovaniePage(String CoursesTestirovanie) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_TESTIROVANIE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesTestirovaniePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_TESTIROVANIE_CLASS)).getText();

    }
}

