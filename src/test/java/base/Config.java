package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class Config {
    // To align the code in mac is cmd+a and then cmd+opt+l
    // a main setup of the framework
    // Init WebDriver
    public static WebDriver driver;

    // setup browser (chrome, firefox, ie, safari, opera)
    public static WebDriver initDriver (String driverType) {
        if (driverType.equalsIgnoreCase("ch")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        return driver;
    }

    public void test(String x){

    }
}
