import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.UtilsForTest;

import java.util.List;

public class FirstTest extends BaseTest {

    @Test
    public void test1(){
        getDriver().get("https://demoqa.com/automation-practice-form");

        WebElement firstNameField = getDriver().findElement(By.id("firstName"));
        firstNameField.sendKeys("Lera");


        WebElement lastNameField = getDriver().findElement(By.xpath(" //input[@placeholder = 'Last Name']"));
        lastNameField.sendKeys("Kurtova");

        lastNameField.findElement(By.xpath(" //input[@placeholder = 'Last Name']")).clear();
        lastNameField.sendKeys("Petrova");


        WebElement emailField = getDriver().findElement(By.id("userEmail"));
        emailField.sendKeys("test@email.com");

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));

        List<WebElement> gender = getDriver().findElements(By.xpath("//input[@type = 'radio']"));
        gender.size();
        for (int i = 0; i < gender.size(); i++) {
            String value = gender.get(i).getAttribute("value");

            if(value.equalsIgnoreCase("male")) {
                UtilsForTest.jsClick(getDriver(), gender.get(i));
                break;
            }
        }


//        new WebDriverWait(driver, 10).until(ExpectedConditions.
//                elementToBeClickable(By.xpath("//input[@name = 'gender'][@value='Female']"))).click();
//        WebElement genderRadioBtnMale = driver.findElement(By.xpath("//input[@name = 'gender'][@value='Male']"));
//        genderRadioBtnMale.click();

        WebElement mobileField = getDriver().findElement(By.id("userNumber"));
        mobileField.sendKeys("132456789");



    }
}
