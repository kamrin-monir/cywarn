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

import java.util.List;

/**
 * Created by KamrinK on 20-08-2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CywareLatestNewsTest {

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



    @Test
    public void latestNewsContentTest(){

        //Load latest news page
        //Get latest news menu
        WebElement tabMenu = webDriver.findElement(By.id(menu.getMenu1Id()));
        tabMenu.click();
        WebDriverWait menuWait = new WebDriverWait(webDriver, 20);
        menuWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(menu.getContainerId())));

        //Get tab title
        WebElement tabContainer = webDriver.findElement(By.id(menu.getContainerId()));
        Assert.assertEquals("Menu1 test", menu.getMenu1Title(), tabContainer.getText());


        //Check page content
        WebElement cardStack =  webDriver.findElement(By.xpath(menu.getMenu1contentXpath()));
        List<WebElement> blocks = cardStack.findElements(By.className(menu.getMenu1BlockClassName()));
        Assert.assertEquals("Latest news page has content ", true, blocks.size()> 0);

       for(WebElement block : blocks){
           //Title is present
           WebElement  postTitle = block.findElement(By.className(menu.getPostTitleClassName()));
           Assert.assertEquals("Title is present", true, postTitle.isDisplayed());

           //Meta is present
           WebElement  postMeta = block.findElement(By.className(menu.getMetaClassName()));
           Assert.assertEquals("Meta is present", true, postMeta.isDisplayed());

           //Description is present
           WebElement  postDesc = block.findElement(By.className(menu.getDescriptionClasName()));
           Assert.assertEquals("Description is present", true, postDesc.isDisplayed());
           Assert.assertEquals("Description is non empty",  true, !postDesc.getText().isEmpty());


           //Meta down is present
           WebElement  postMetaDown = block.findElement(By.className(menu.getMetaDownClassName()));
           Assert.assertEquals("Meta Down is present", true, postMetaDown.isDisplayed());
           //Meta down  has two children

       }
    }
}
