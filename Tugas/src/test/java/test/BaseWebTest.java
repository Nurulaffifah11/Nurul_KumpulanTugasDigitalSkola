package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseWebTest {

//    public WebDriver driver;

    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments();
        driver.set(new FirefoxDriver(options));
        driver.get().manage().window().maximize();
        driver.get().get("https://www.makemytrip.com/");
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(30)));
    }

//    @AfterMethod
//    public void closeBrowser(){
//        driver.get().quit();
//    }
}
