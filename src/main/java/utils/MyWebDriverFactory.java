package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;


public class MyWebDriverFactory {

    public static WebDriver myWebDriver;

    public WebDriver onPage() {
        myWebDriver.manage().window().maximize();
        myWebDriver.get("https://www.amazon.in/");
        myWebDriver.manage().deleteAllCookies();
        return myWebDriver;
    }

   public static MyWebDriverFactory web() {
        myWebDriver = getMyWebDriver();
        myWebDriver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        return new MyWebDriverFactory();
    }

      public static WebDriver getMyWebDriver() {
        String webdriverstr = System.getProperty("serenity.driver.name");
        if (webdriverstr == null) {
            webdriverstr = "chrome";
        }
        switch (webdriverstr) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                FirefoxOptions fireopts = new FirefoxOptions();
                fireopts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                return new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                ChromeOptions chropts = new ChromeOptions();
                chropts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                chropts.setHeadless(false);
                return new ChromeDriver(chropts);
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriverstr);
        }

    }



}


