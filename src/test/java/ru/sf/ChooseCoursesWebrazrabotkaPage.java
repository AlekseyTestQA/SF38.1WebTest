package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesWebrazrabotkaPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_WEBRAZRABOTKA_XPATH = "//span[@class='t978__link-inner' and text()='Веб-разработка']";
    private static final String ERROR_MESSAGE_COURSES_WEBRAZRABOTKA_CLASS = "//h1[.='Курсы по веб-разработке']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesWebrazrabotkaPage(String CoursesWebrazrabotka) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_WEBRAZRABOTKA_XPATH));
        searchCoursesPage.click();

    }

    public String getCoursesWebrazrabotkaPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_WEBRAZRABOTKA_CLASS)).getText();

    }
}

