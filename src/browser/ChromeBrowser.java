package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open The URL into the Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is : " + title);
        //Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        // find the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        // Enter the email to email field
        emailField.sendKeys("Abc123@gmail.com");
        //  Find and Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("xyz123");
        // Close the browser
        driver.close();
    }
}
