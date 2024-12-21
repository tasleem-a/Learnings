import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    private AndroidDriver driver;
    @BeforeSuite
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:platformName","Android");
        cap.setCapability( "appium:deviceName", "48b1560c");
        cap.setCapability("appium:platformVersion", "9");
        cap.setCapability("appium:automationName", "uiautomator2");
        cap.setCapability("appium:appPackage", "io.appium.android.apis");
        cap.setCapability( "appium:appActivity", "io.appium.android.apis.ApiDemos");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);

    }
    @Test
    public void sentMessageFromAPIdemo(){
        String recipient="8248428011";
        String msg="AppiumTest";
//        driver.findElement(By.xpath("//android.widget.TextView[@text='OS']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='SMS Messaging']")).click();
//        driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys(recipient);
//        driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys(msg);
//        driver.findElement(By.id("io.appium.android.apis:id/sms_send_message")).click();
//        String result = driver.findElement(By.id("io.appium.android.apis:id/sms_status")).getText();
//        System.out.println(result);
//        Assert.assertEquals(result,"Message sent!");
//        result.contains("Message sent!");
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
