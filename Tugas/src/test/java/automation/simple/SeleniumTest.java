package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

    public class SeleniumTest {

        WebDriver driver;

        @Test
        public void loginTest() {
            //open browser
            WebDriverManager.edgedriver();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.makemytrip.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            //Search Field
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
            driver.findElement(By.xpath("//input[@id='fromCity']")).click();
            driver.findElement(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")).click();


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toCity")));
            driver.findElement(By.xpath("//input[@id='toCity']")).click();
            driver.findElement(By.xpath("//li[.='Bengaluru, India Bengaluru International AirportBLR']")).click();
            driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']//p[.='28']")).click();


            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("return")));
            driver.findElement(By.xpath("//p[@class='latoBlack font12 greyText lineHeight16']")).click();
            driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected']")).click();

            driver.findElement(By.xpath("//a[.='Search']")).click();

            //driver.findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']")).click();

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sorting-togglers")));
//            driver.findElement(By.xpath("//div[@class='splitVw']/div[1]//div[@id='sorting-togglers']")).click();
//            driver.findElement(By.xpath("//span[@class=' appendLeft10 down sort-arrow']")).click();
////            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("departure")));
//            driver.findElement(By.xpath("//input[@id='departure']")).click();
        }
}
//=====================================================================
//NOTE
//Saya masih kurang paham untuk membuat tugas ini menggunakan OOP, masih butuh di coba lagi.
//Jadi saya mengerjakan seadanya ya kak.
//Mohon maaf dan Terimakasih.
