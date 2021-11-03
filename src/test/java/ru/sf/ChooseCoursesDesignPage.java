package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesDesignPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_DESIGN_XPATH = "//span[@class='t978__link-inner' and text()='Дизайн']";
    private static final String ERROR_MESSAGE_COURSES_DESIGN_CLASS = "//h1[.='Курсы по дизайну']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesDesignPage(String CoursesDesign) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_DESIGN_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesDesignPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_DESIGN_CLASS)).getText();

    }
}

