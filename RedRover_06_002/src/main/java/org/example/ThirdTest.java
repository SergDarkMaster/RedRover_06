package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import runner.BaseTest;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class ThirdTest extends BaseTest {


    @Test
    public void testFirst() throws InterruptedException {
        getDriver().get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(3000);

        String title = getDriver().getTitle();
        assertEquals("Web form", title);


        getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = getDriver().findElement(By.name("my-text"));
        Thread.sleep(3000);
        WebElement submitButton = getDriver().findElement(By.cssSelector("button"));
        Thread.sleep(3000);

        textBox.sendKeys("Selenium");
        Thread.sleep(3000);
        submitButton.click();
        Thread.sleep(3000);

        WebElement message = getDriver().findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);
    }
}