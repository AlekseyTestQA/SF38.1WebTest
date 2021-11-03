package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record ChooseCoursesAnalitikaDannyhPage (WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_COURSES_ANALITIKADANNYH = "//span[@class='t978__link-inner' and text()='Аналитика данных']";
    private static final String ERROR_MESSAGE_COURSES_ANALITIKADANNYH_CLASS = "//h1[.='Курсы по аналитике данных']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCoursesAnalitikaDannyhPage(String CoursesAnalitikaDannyh) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_COURSES_ANALITIKADANNYH));
        searchCoursesPage.click();

    }

    public String getCoursesAnalitikaDannyhPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_COURSES_ANALITIKADANNYH_CLASS)).getText();

    }
}

