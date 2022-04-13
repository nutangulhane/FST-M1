package org.Actvities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobPortal_heading {
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
        driver.close();
    }}

