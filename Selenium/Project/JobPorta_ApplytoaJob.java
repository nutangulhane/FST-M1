package org.Actvities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class JobPorta_ApplytoaJob {

    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//a[text()='Jobs']")).click();
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        driver.findElement(By.xpath("//li[@class='post-4475 job_listing type-job_listing status-publish hentry job-type-internship']")).click();
        /*WebElement joblist=driver.findElement(By.xpath("//span[text()='Intelligence Business Machines']"));
        Select job = new Select(joblist);
        job.getFirstSelectedOption().click();*/
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        driver.close();


}}
