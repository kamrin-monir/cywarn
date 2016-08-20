package com.cyware;

import com.cyware.props.App;
import com.cyware.props.Menu;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by KamrinK on 20-08-2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CywareTopMenuTest {
    private WebDriver webDriver = new FirefoxDriver();


    @Autowired
    private App app;
    @Autowired
    private Menu pageMenu;



    @Test
    public void menuTest() {
        //Open the Url
        webDriver.get(app.getUrl());

        //Close popup
        WebDriverWait wait = new WebDriverWait(webDriver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sb-close-btn")));
        WebElement closeButton = webDriver.findElement(By.className("sb-close-btn"));
        closeButton.click();

        WebElement webElement = webDriver.findElement(By.className(app.getMenuElement()));
        List<WebElement> menus = webElement.findElements(By.xpath("./*"));
        Assert.assertEquals("Top level menu count", 6, menus.size());
        for (int i = 0; i <= 4; i++) {
            WebElement menu = menus.get(i);

            if (i == 0) {
                WebElement topMenu = menu.findElement(By.xpath("./*"));
                Assert.assertEquals("First menu is Latest News", pageMenu.getMenu1Title().toUpperCase(), topMenu.getText());
            } else if (i == 1) {
                WebElement topMenu = menu.findElement(By.id("professional"));
                Assert.assertEquals("First menu is Latest News", pageMenu.getMenu2Title().toUpperCase(), topMenu.getText());

            } else if (i == 2) {
                WebElement topMenu = menu.findElement(By.id("general"));
                Assert.assertEquals("First menu is Latest News", pageMenu.getMenu3Title().toUpperCase(), menu.getText());


            } else if (i == 3) {
                WebElement topMenu = menu.findElement(By.xpath("./*"));
                Assert.assertEquals("First menu is Latest News", pageMenu.getMenu4Title().toUpperCase(), topMenu.getText());

            } else {
                //TODO
            }


        }
    }






}
