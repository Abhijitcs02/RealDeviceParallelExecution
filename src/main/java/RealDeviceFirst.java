/**
 * Created by 543175 on 6/28/2018.
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RealDeviceFirst {

    @Parameters({"device","appiumServer"})
    @Test
    public void test1(String device,String appiumServer) throws MalformedURLException, InterruptedException{

            // Create object of DesiredCapabilities class

            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Optional

            //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
            capabilities.setCapability(MobileCapabilityType.UDID, device);
            // Specify the device name (any name)

            capabilities.setCapability("deviceName", "My New Phone");


            // Platform version

            capabilities.setCapability("platformVersion", "6.0");


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

            WebDriver driver = new AndroidDriver(new URL(appiumServer), capabilities);



            // Specify the implicit wait of 5 second

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



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


    @Test
    public void test3() throws MalformedURLException, InterruptedException{
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
