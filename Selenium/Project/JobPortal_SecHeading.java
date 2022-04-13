package org.Actvities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class JobPortal_SecHeading {
    @Test
    public void headingCheck()
    {
        System.setProperty("webdriver.gecko.driver","C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String actual_title="Quia quis non";
        String expected_title;
        expected_title = driver.findElement(By.xpath("//h2[text()='Quia quis non']")).getText();
        if (actual_title.equals(expected_title))
            System.out.println("title match");
            else
            System.out.println("title is not matched");
        driver.quit();
    }}

