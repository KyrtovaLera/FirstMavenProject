import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest {

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
    }
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    public static void newClick(WebDriver driver, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    @Test
    public void test1() throws InterruptedException{
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(2000);

//        WebElement firstNameField = driver.findElement(By.id("firstName"));
//        Thread.sleep(2000);
//        firstNameField.sendKeys("Lera");
//        Thread.sleep(3000);
//
//        WebElement lastNameField = driver.findElement(By.xpath(" //input[@placeholder = 'Last Name']"));
//        lastNameField.sendKeys("Kurtova");
//        Thread.sleep(2000);
//        lastNameField.findElement(By.xpath(" //input[@placeholder = 'Last Name']")).clear();
//        lastNameField.sendKeys("Petrova");
//        Thread.sleep(2000);
//
//        WebElement emailField = driver.findElement(By.id("userEmail"));
//        emailField.sendKeys("test@email.com");
//        Thread.sleep(2000);

        List<WebElement> gender = driver.findElements(By.xpath("//input[@type = 'radio']"));
        gender.size();
        for (int i = 0; i < gender.size(); i++) {
            String value = gender.get(i).getAttribute("value");
            Thread.sleep(2000);
            if(value.equalsIgnoreCase("male")) {
                newClick(driver, gender.get(i));
                break;
            }
            Thread.sleep(2000);
        }


//        new WebDriverWait(driver, 10).until(ExpectedConditions.
//                elementToBeClickable(By.xpath("//input[@name = 'gender'][@value='Female']"))).click();


//        WebElement genderRadioBtnMale = driver.findElement(By.xpath("//input[@name = 'gender'][@value='Male']"));
//
//        Thread.sleep(5000);
//
//        genderRadioBtnMale.click();

        WebElement mobileField = driver.findElement(By.id("userNumber"));
        mobileField.sendKeys("132456789");



    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
