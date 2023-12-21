package Tugas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTugas {

    WebDriver driver;

    @Test
    public void loginTest(){
        //open browser

        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://yopmail.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Search Field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        driver.findElement(By.id("login")).sendKeys("automationtest");
//        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='md']")).click();

        //iFrame
        driver.switchTo().frame("ifinbox");
        String txtActualText = driver.findElement(By.xpath("//div[.='[Reminder] Review Request Pending']")).getText();
        String txtExpectedText = "[Reminder] Review Request Pending";
        Assert.assertEquals(txtActualText, txtExpectedText);

        driver.findElement(By.xpath("//div[@class='mctn']/div[3]/button[@class='lm']")).click();


        //Kalau coba pakai 2 frame, dengan kodingan dibawah masih failed.
//        driver.switchTo().frame("ifmail");
//        String txtActualText1 = driver.findElement(By.xpath("//p[.='Welcome to NCR Aloha Cloud']")).getText();
//        String txtExpectedText1 = "Welcome to NCR Aloha Cloud";
//        //String txtExpectedText1 = "NCR Aloha Cloud New User Login";
//        Assert.assertEquals(txtActualText1, txtExpectedText1);

        //close browser
        //driver.quit();

    }
}
