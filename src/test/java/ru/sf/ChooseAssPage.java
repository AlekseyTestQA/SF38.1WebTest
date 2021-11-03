package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public record ChooseAssPage(WebDriver webDriver) {

    private static final String URL = "https://skillfactory.ru/";
    private static final String SEARCH_ASS_CLASS = "//*[@id='chat-container']";
    private static final String ERROR_MESSAGE_ASS_CLASS = "//span[.='Задайте вопрос по нашим образовательным программам. Мы отвечаем в течение 10 минут.']";

    public void go() {
        webDriver.get(URL);
    }

    public void searchAssPage(String chatAssistant) {
        final var searchAssPage = webDriver.findElement(By.xpath(SEARCH_ASS_CLASS));
        searchAssPage.click();

    }

    public String getchatAssistantPageNotFoundMessage() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_ASS_CLASS)).getText();

    }
}
