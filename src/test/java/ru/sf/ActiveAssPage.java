package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public record ActiveAssPage (WebDriver webDriver) {

    private final static String ACTIVE_ASS_PAGE_XPATH = "//span[.='Задайте вопрос по нашим образовательным программам. Мы отвечаем в течение 10 минут.']";

    public String getCurrentActiveAssPage() {
    WebElement fr = webDriver.findElement(By.xpath("//iframe[@id='carrot-messenger-frame']"));
    webDriver.switchTo().frame(fr);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return webDriver.findElement(By.xpath(ACTIVE_ASS_PAGE_XPATH)).getText();
    }
}
