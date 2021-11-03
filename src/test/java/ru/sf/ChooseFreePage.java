package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

//Имплементация паттерна Page Object Model
public record ChooseFreePage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_FREEPAGE_CLASS = "//a[@href='/events']";
    private static final String ERROR_MESSAGE_FREEPAGE_CLASS = "//h1[@class='tn-atom' and @field='tn_text_1569501490473' and 'Бесплатные мероприятия и программы']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchFreePage(String FreePage) {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        final var searchCoursesPage = webDriver.findElement(By.xpath(SEARCH_FREEPAGE_CLASS));
        searchCoursesPage.click();

    }

    public String getFreePageNotFoundMessage() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_FREEPAGE_CLASS)).getText();

    }
}
