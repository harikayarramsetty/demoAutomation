package com.cts.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class app {
    @Test
    public void sample()
    {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/");

        driver.findElement(By.partialLinkText("Downloads")).click();

        driver.findElement(By.id("browsersExpand")).click();
    }

}
