/*Goal: Create a new job listing*/
package org.Actvities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.awt.*;
import java.util.concurrent.TimeUnit;

public class JobPortal_NewJobPosting {

    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("testgulhane@gmail.com");
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("Testing@gmail.com");
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
        driver.findElement(By.xpath("///br[@data-mce-bogus='1']")).sendKeys("testing is job");
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
        driver.findElement(By.xpath("//a[text()='Jobs']")).click();
        driver.findElement(By.xpath("//a[text()='Reset']")).click();
       /* int allpost=driver.findElements(By.xpath("//li[contains(@class,'post')]")).size();
        for(int i=0;i<allpost;i++)
            System.out.println();*/


}}
