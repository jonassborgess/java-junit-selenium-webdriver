package junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
    @Test
    public void Elements() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }

    @Test
    public void Forms() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Forms']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }

    @Test
    public void AlertsFrameWindows() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }

    @Test
    public void Widgets() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Widgets']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }

    @Test
    public void Interactions() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Interactions']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }

    @Test
    public void BookStoreApplication() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Book Store Application']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        driver.quit();
    }
}
