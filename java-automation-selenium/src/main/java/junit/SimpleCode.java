package junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleCode {
    @Test
    public void initialTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        driver.findElement(By.id("dropdown")).click();
        driver.quit();
    }
}
