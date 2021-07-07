// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class OpenMyMailTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void openMyMail() {
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        driver.findElement(By.name("login")).sendKeys("skelon");
        driver.findElement(By.name("password")).sendKeys("A2@14sdfg");
        driver.findElement(By.cssSelector("html")).click();
        driver.findElement(By.name("domain")).click();
        driver.findElement(By.name("domain")).click();
        driver.findElement(By.cssSelector(".button")).click();
        driver.findElement(By.cssSelector("html")).click();
        driver.findElement(By.cssSelector(".second-button")).click();
    }
}
