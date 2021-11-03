package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Имплементация паттерна Page Object Model
public record ChoosePartnersPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_PARTNERSPAGE_CLASS = "//*[.='Партнерам']";
    private static final String ERROR_MESSAGE_PARTNERSPAGE_CLASS = "//*[.='Почему вам выгодна наша программа?']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchPartnersPage(String Courses) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_PARTNERSPAGE_CLASS));
        searchCoursesPage.click();

    }

    public String getPartnersPageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_PARTNERSPAGE_CLASS)).getText();

    }
}