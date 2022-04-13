/*5. Navigate to another page
        Goal: Navigate to the “Jobs” page on the site.
        a. Open a browser.
        b. Navigate to ‘https://alchemy.hguy.co/jobs’.
        c. Find the navigation bar.
        d. Select the menu item that says “Jobs” and click it.
        e. Read the page title and verify that you are on the correct page.
        f. Close the browser.*/
package org.Actvities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobPortal_JobNavigation{
    public static void main(String args[])
    {
    System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://alchemy.hguy.co/jobs");
    driver.findElement(By.xpath("//a[text()='Jobs']")).click();
      String actulaltitle = driver.getTitle();
    String expectedtitle = "Jobs – Alchemy Jobs";
    if (expectedtitle.equals(actulaltitle))
        System.out.println("user is navigate to correct page");
    else
        System.out.println("please try gain you navigate to wrong page");
    driver.quit();

}}
