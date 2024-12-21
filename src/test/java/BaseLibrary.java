import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseLibrary {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AppiumDriver driver;
        System.out.println("hello123");
        system.out.println("hello122");
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("appium:platformName","Android");
        cap.setCapability( "appium:deviceName", "48b1560c");
        cap.setCapability("appium:platformVersion", "9");
        cap.setCapability("appium:appPackage", "com.miui.calculator");
        cap.setCapability( "appium:appActivity", "com.miui.calculator.cal.CalculatorActivity");
        cap.setCapability("appium:automationName", "uiautomator2");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
        Thread.sleep(3000);
        //locate the elements
        system.out.println("hello123");
        system.out.println("hello122");
        system.out.println("hello123");
        system.out.println("hello2");
        driver.findElement(By.xpath("//*[@text='3']")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
        driver.findElement(By.xpath("//*[@text='9']")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
       String result= driver.findElement(By.id("com.miui.calculator:id/expression")).getText();



        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='plus']")).click();
        Thread.sleep(3000);

        driver.quit();


    }
}
