package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Имплементация паттерна Page Object Model
public record ChooseCorporatePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_CORPORATE_CLASS = "//*[.='Компаниям']";
    private static final String ERROR_MESSAGE_CORPORATE_CLASS = "//*[.='Корпоративное обучение в SkillFactory']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchCorporatePage(String Courses) {
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_CORPORATE_CLASS));
        searchCoursesPage.click();

    }

    public String getCorporatePageNotFoundMessage() {
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_CORPORATE_CLASS)).getText();

    }
}