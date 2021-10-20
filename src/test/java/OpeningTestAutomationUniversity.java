import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpeningTestAutomationUniversity {
    private static final String URL = "https://testautomationu.applitools.com/";
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void initWebDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void openWebsite() {
        driver.get(URL);
    }

    @AfterTest
    public void quitWebDriver() {
        driver.quit();
    }
}

/*
    Samsung F12
    Samsung M32
    HOT 11s
    Narzo 50A
    Narzo 30
    Redmi 10 Prime
    Realme 8i
    Redmi note 10 lite
    Poco M2 Pro
 */