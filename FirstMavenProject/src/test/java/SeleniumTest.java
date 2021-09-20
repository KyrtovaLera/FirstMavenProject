import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {

    @BeforeClass
    public void setUp () {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void myTest1 () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");



    }
 }
