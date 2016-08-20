package com.cyware;

import com.cyware.props.App;
import com.cyware.props.Menu;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

/**
 * Created by KamrinK on 20-08-2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CywareMenuTabTest {
    private WebDriver webDriver = new FirefoxDriver();


    @Autowired
    private App app;
    @Autowired
    private Menu menu;

    @Before
    public void init(){
        //Open the Url
        webDriver.get(app.getUrl());
    }

    @After
    public void destroy(){
        webDriver.close();
    }

    /**
     * Name: Test Latest News  Menu
     * Description:  This test  case ensure that when  LATEST NEWS is clicked,  it loads  desired page
     */
    @Test
    public void latestNewsTest() {
        //Get latest news menu
        WebElement tabMenu = webDriver.findElement(By.id(menu.getMenu1Id()));
        tabMenu.click();
        WebDriverWait menuWait = new WebDriverWait(webDriver, 20);
        menuWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu.getContainerId())));

        //Get tab title
        WebElement tabContainer = webDriver.findElement(By.id(menu.getContainerId()));
        Assert.assertEquals("Latest news menu test", menu.getMenu1Title(), tabContainer.getText());
    }

    /**
     * Name: Test Cyber Professional Menu
     * Description:  This test  case ensure that when CYBER PROFESSIONAL is clicked,  it loads  desired page
     */
    @Test
    public void cyberProfessionalTest() {
        //Get latest news menu
        WebElement tabMenu = webDriver.findElement(By.id(menu.getMenu2Id()));
        tabMenu.click();
        WebDriverWait menuWait = new WebDriverWait(webDriver, 20);
        menuWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu.getContainerId())));

        //Get tab title
        WebElement tabContainer = webDriver.findElement(By.id(menu.getContainerId()));
        Assert.assertEquals("Cyber Professional menu test", menu.getMenu2Title(), tabContainer.getText());
    }

    /**
     * Name: Test General User Menu
     * Description:  This test  case ensure that when  GENERAL USER is clicked,  it loads  desired page
     */
    @Test
    public void generalUserTest() {

        //Get latest news menu
        WebElement tabMenu = webDriver.findElement(By.id(menu.getMenu3Id()));
        tabMenu.click();
        WebDriverWait menuWait = new WebDriverWait(webDriver, 20);
        menuWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu.getContainerId())));

        //Get tab title
        WebElement tabContainer = webDriver.findElement(By.id(menu.getContainerId()));
        Assert.assertEquals("General User menu test", menu.getMenu3Title(), tabContainer.getText());
    }


    /**
     * Name: Test About Menu
     * Description:  This test  case ensure that when  About is clicked,  it loads  desired page
     */
    @Test
    public void aboutTest() {

        //Get latest news menu
        WebElement tabMenu = webDriver.findElement(By.xpath(menu.getMenu4Xpath()));
        tabMenu.click();
        WebDriverWait menuWait = new WebDriverWait(webDriver, 20);
        menuWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu.getMenu4ContainerId())));

        //Get tab title
        WebElement tabContainer = webDriver.findElement(By.id(menu.getMenu4ContainerId()));
        Assert.assertEquals("About menu test", true, tabContainer.isDisplayed());
    }

}
