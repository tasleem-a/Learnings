package WeekendPrograms;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemoUseCase1 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver driver;
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("appium:platformName","Android");
        cap.setCapability( "appium:deviceName", "48b1560c");
        cap.setCapability("appium:platformVersion", "9");
        cap.setCapability("appium:automationName", "uiautomator2");
        cap.setCapability("appium:appPackage", "io.appium.android.apis");
        cap.setCapability( "appium:appActivity", "io.appium.android.apis.ApiDemos");
        //cap.setCapability( "appium:ignoreHiddenApiPolicyError", "true");
      //  cap.setCapability("appium:noReset","true");
        // Specify the path to the APK file
       // File app = new File("C://Users//asus//Downloads//ApiDemos.apk");
      //  cap.setCapability("app", app.getAbsolutePath());

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
        Thread.sleep(3000);
        String recipient="8248428011";
        String msg="AppiumTest";
        driver.findElement(By.xpath("//android.widget.TextView[@text='OS']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='SMS Messaging']")).click();
        driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys(recipient);
        driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys(msg);
        driver.findElement(By.id("io.appium.android.apis:id/sms_send_message")).click();
        String result = driver.findElement(By.id("io.appium.android.apis:id/sms_status")).getText();
        System.out.println(result);
        result.contains("Message sent!");
        System.out.println("Installed successfully");
        driver.quit();


    }
}
