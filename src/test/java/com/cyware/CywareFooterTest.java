package com.cyware;

import com.cyware.props.App;
import com.cyware.props.Footer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by KamrinK on 20-08-2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CywareFooterTest {

    private WebDriver webDriver = new FirefoxDriver();

    @Autowired
    private Footer footer1;

    @Autowired
    private App app;

    @Before
    public void init() {
        //Open the Url
        webDriver.get(app.getUrl());
    }

    @After
    public void destroy() {
        webDriver.close();
    }


    @Test
    public void footerTst() {

        WebElement footer = webDriver.findElement(By.tagName(footer1.getFooter1()));
        Assert.assertEquals("Footer is present", true, footer.isDisplayed());
    }
}
