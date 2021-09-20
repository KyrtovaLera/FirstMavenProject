import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Main {

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
    }
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver(); //создание драйвера у нас в программе.
        // WebDriver - это interface, а реализация - класс, который имплементирует веб драйвер - ChromeDriver
    }

//    @Test
//    public void test() throws InterruptedException {
//
//        WebElement input;
//
//        driver.get("https://www.google.com/");
//
//        input = driver.findElement(By.className("gLFyf"));
//        input.sendKeys("Cats\n");
//
//        Thread.sleep(5000);
//
//        WebElement result = driver.findElement(
//                By.xpath("//input[@class='gLFyf gsfi']"));
//
//        Thread.sleep(5000);
//
//        Assert.assertTrue(true, "//input[@class='gLFyf gsfi']");

//    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://shop.demoqa.com/my-account/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Lost your password?")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://shop.demoqa.com/my-account/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }

    @Test
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        driver.findElement(By.id("firstName"));
    }
       @AfterMethod
       public void afterTest() {
            driver.quit();
        }

    }
