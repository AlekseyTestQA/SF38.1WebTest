package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesBackendRazrabotkaPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_BACKENDRAZRABOTKA_XPATH = "//span[@class='t978__link-inner' and text()='Backend-разработка']";
    private static final String ERROR_MESSAGE_COURSES_BACKENDRAZRABOTKA_CLASS = "//h1[.='Курсы по Backend-разработке']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesBackendRazrabotkaPage(String CoursesBackendRazrabotka) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_BACKENDRAZRABOTKA_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesBackendRazrabotkaPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_BACKENDRAZRABOTKA_CLASS)).getText();

    }
}

