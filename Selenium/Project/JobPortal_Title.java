package org.Actvities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobPortal_Title {
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        System.out.println(driver.getTitle());
        driver.close();
    }}

