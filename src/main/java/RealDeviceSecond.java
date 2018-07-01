import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by 543175 on 6/28/2018.
 */
public class RealDeviceSecond {

    @Test
    public void test2() throws MalformedURLException, InterruptedException{

        {


            // Create object of DesiredCapabilities class

            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Optional

            //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "T00940Z5XZ");
            capabilities.setCapability(MobileCapabilityType.UDID, "T00940Z5XZ");
            // Specify the device name (any name)

            capabilities.setCapability("deviceName", "My New Phone");


            // Platform version

            capabilities.setCapability("platformVersion", "5.1");


            // platform name

            capabilities.setCapability("platformName", "Android");


            // specify the application package that we copied from appium

            //capabilities.setCapability("appPackage", "io.selendroid.testapp");
            capabilities.setCapability("appPackage", "com.whatsapp");

            // specify the application activity that we copied from appium

            //capabilities.setCapability("appActivity", ".HomeScreenActivity");
            capabilities.setCapability("appActivity", ".Main");
            //capabilities.setCapability("appActivity", ".VerifyUserActivity");


            // Start android driver I used 4727 port by default it will be 4723

            WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4733/wd/hub"), capabilities);



            // Specify the implicit wait of 5 second

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



            // Enter the text in textbox
            //my_text_fieldCD  android.widget.EditText
            //driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Mukesh Selenium Appium");
            //driver.findelementb.sendKeys("Mukesh Selenium Appium");

//
//		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Mukesh Selenium Appium");
//		driver.findElement(ByAccessibilityId.AccessibilityId("my_text_fieldCD")).clear();
//		driver.findElement(ByAccessibilityId.AccessibilityId("my_text_fieldCD")).sendKeys("abhijit");
//		driver.findElement(ByAccessibilityId.AccessibilityId("my_text_fieldCD")).clear();
//		driver.findElement(ByClassName.className("android.widget.EditText")).sendKeys("Priya");
//		driver.findElement(ByAccessibilityId.AccessibilityId("my_text_fieldCD")).clear();
//		driver.findElement(By.name("I accept adds")).click();

            //driver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).click();
            // click on registration button

            //driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();

            // Wait for 10 second

            // Whats app
//		driver.findElement(By.xpath("//android.widget.TextView[@text='STATUS']")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='CALLS']")).click();

            driver.findElement(By.id("com.whatsapp:id/menuitem_search")).click();

            driver.findElement(By.id("com.whatsapp:id/search_src_text")).sendKeys("vikash");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
            driver.findElement(By.id("com.whatsapp:id/entry")).clear();
            driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("hi testting automation kya hal chal");

            driver.findElement(By.id("com.whatsapp:id/send")).click();

            Thread.sleep(10000);

            // close the application
            driver.quit();



        }
    }
}
