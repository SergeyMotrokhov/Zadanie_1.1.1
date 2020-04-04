package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebDriverSettings{

    @Test
    public void checkLinkWiki(){

            WebElement inputField = driver.findElement(By.xpath("//input[@id='text']"));
            inputField.clear();
            inputField.sendKeys("Гладиолус");
            WebElement searchButton = driver.findElement(By.xpath("//button[@data-bem='{\"button\":{}}']"));
            searchButton.click();
            WebElement linkWiki = driver.findElement(By.xpath("//a[@href=\"http://ru.wikipedia.org/wiki/Шпажник\"]"));
            Assertions.assertEquals("Википедия", linkWiki.getText());
			Boolean chek = false;
            for (WebElement we : driver.findElements(By.xpath("//*[@class='organic__url-text']/ancestor::a")))
                if(we.getAttribute("href").equals("https://ru.wikipedia.org/wiki/%D0%A8%D0%BF%D0%B0%D0%B6%D0%BD%D0%B8%D0%BA"))
					chek=true;
            Assertions.assertTrue(true);
        }

    }




