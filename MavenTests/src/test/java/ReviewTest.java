import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest {
    @Test
    public void titleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

                             // navigate URL
        driver.get("https://www.selenium.dev/");
                             //wait for load all elements
                            //find on Documentation text button on header
        WebElement documentationTextButton = driver.findElement(By.xpath("//nav/a[3]"));
                            //click on Documentation text button on header
        documentationTextButton.click();
        Thread.sleep(2000);
                            // type 'element' in search field
        driver.findElement(By.id("search-by")).sendKeys("element");
                            //click first result
        Thread.sleep(1000);
        WebElement firstResult = driver.findElement(By.xpath("//div[@data-title='Web element']"));
        firstResult.click();
                              //assert text 'Web element' on header
        WebElement pageTitleWE = driver.findElement(By.tagName("h1"));
        Thread.sleep(1000);
        String pageTitle = pageTitleWE.getText();
        Assert.assertEquals(pageTitle, "Web element");

        driver.quit();
    }
}
