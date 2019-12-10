package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Common {
    public static WebDriver driver;

    public void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void startChromeDriverHeadless() {
        ChromeOptions headless = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        headless.addArguments("--headless");
        driver = new ChromeDriver(headless);
        driver.manage().window().maximize();
    }

    public void stopChromeDriver() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
