package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowsers {
    //Changing the Browser name and use it.

    static String browser = "Firefox";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please select one Browser 3 of them : ");
//        String Browser = scanner.nextLine();


        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println(" Wrong Browser Name ");
        }
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is : " + title);
        //Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        //  find the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        // Enter the email to email field
        emailField.sendKeys("Abc123@gmail.com");
        //  Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("xyz123");
        // Close the browser
        driver.close();

    }
}
