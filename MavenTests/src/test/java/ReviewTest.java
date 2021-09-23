import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewTest extends BaseTest {

    @Test
    public void cnnTest () throws InterruptedException {
        getDriver().get("https://edition.cnn.com/");
        WebElement worldEl = getDriver().findElement(By.xpath("//li[@data-section='world'][@class='sc-kAzzGY gSIjYi']"));
        Thread.sleep(2000);
        worldEl.click();

        WebDriverWait waiting = new WebDriverWait(getDriver(), 10);
        waiting.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//span[@class='cd__headline-text vid-left-enabled']"))));
        String text = getDriver().findElement(By.xpath("//span[@class='cd__headline-text vid-left-enabled']")).getText();
//        System.out.println(text);



        Assert.assertEquals(text, "Merkel saw Germans through crisis after crisis. Now they wonder who'll fill the void");
    }
    
}
