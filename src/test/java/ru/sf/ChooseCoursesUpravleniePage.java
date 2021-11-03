package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesUpravleniePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_UPRAVLENIE_XPATH = "//span[@class='t978__link-inner' and text()='Управление']";
    private static final String ERROR_MESSAGE_COURSES_UPRAVLENIE_CLASS = "//h1[.='Курсы по управлению']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesUpravleniePage(String CoursesUpravlenie) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_UPRAVLENIE_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesUpravleniePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_UPRAVLENIE_CLASS)).getText();

    }
}

