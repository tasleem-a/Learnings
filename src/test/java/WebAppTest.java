

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


public class WebAppTest {
 private AndroidDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("appium:platformName","Android");
        cap.setCapability( "appium:deviceName", "48b1560c");
        cap.setCapability("appium:platformVersion", "9");
        cap.setCapability("appium:automationName", "uiautomator2");
        cap.setCapability("appium:browserName", "chrome");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);

    }
  @Test
 public void launchAmazon(){
      driver.get("https://www.amazon.in/");

   }
@AfterMethod
public void tearDown(){
    driver.quit();
}
}

