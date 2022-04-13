package org.Actvities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JobPortal_headerImg {
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String url = "https://alchemy.hguy.co/jobs";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement l =driver.findElement(By.xpath("//img[@class='entry-header ast-no-meta']"));

        driver.quit();




    }}

