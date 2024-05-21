package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    static String baseUrl = "https://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //1. Setup Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2.Open URL.
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        System.out.println("This is the title of the page: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("This is the current URL: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the page source: " + driver.getPageSource());

        //6. Enter the email to Email field.
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");

        //7. Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //8. Click on Login Button.
        driver.findElement(By.className("radius")).click();

        //9. Print the current URL.
        System.out.println("The current URL is: " +driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();

        //11. Close the browser.
        driver.quit();
    }
}
