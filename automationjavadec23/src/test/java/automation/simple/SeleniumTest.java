package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    WebDriver driver;

    @Test
    public void loginTest(){
        //open browser

        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //ini untuk login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        //untuk mengambil text maka ubah menjadi String
        String txtActualBerhasilLogin = driver.findElement(By.xpath("//h2[contains(.,'Secure Area')]")).getText();
        String txtExpectedBerhasilLogin = "Secure Area";

        // System.out.println(txtNotifLogin);
        Assert.assertEquals(txtActualBerhasilLogin, txtExpectedBerhasilLogin);

        //close browser
        driver.quit();

    }

    @Test
    public void loginFailedTest(){
        //open browser

        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //ini untuk login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//button[@class='radius']")).click();

////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//        //untuk mengambil text maka ubah menjadi String
//        String txtActualBerhasilLogin = driver.findElement(By.xpath("//h2[contains(.,'Secure Area')]")).getText();
//        String txtExpectedBerhasilLogin = "Secure Area";

        // System.out.println(txtNotifLogin);
        //Assert.assertEquals(txtActualBerhasilLogin, txtExpectedBerhasilLogin);

        String txtError = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println(txtError);

        //close browser
        //driver.quit();

    }
}
