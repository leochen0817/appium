package com.forte.appium;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidContactsTest {
    private AppiumDriver<AndroidElement> driver;

    @BeforeTest
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "wujia-beta-2016-09-22.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.forte.wujia");
        capabilities.setCapability("appActivity", ".activity.account.UserLoginActivity");
//        capabilities.setCapability("unicodeKeyboard", true);//使用 Unicode 输入法  
//        capabilities.setCapability("resetKeyboard", true);  //重置输入法到原有状态
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        
        
        // set up appium
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "../../../apps/ContactManager");
//        File app = new File(appDir, "ContactManager.apk");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName","KFDUR4TCF6T4NVSW");
//        capabilities.setCapability("platformVersion", "4.4");
//        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("appPackage", "layout.android.forte.com.androidlayout");
//        capabilities.setCapability("appActivity", ".MainActivity");
//        capabilities.setCapability("unicodeKeyboard", true);//使用 Unicode 输入法  
//        capabilities.setCapability("resetKeyboard", true);  //重置输入法到原有状态
//        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() throws Exception {
//        driver.quit();
    }

    @Test
    public void addContact() throws InterruptedException{
//        WebElement el = driver.findElement(By.xpath(".//*[@text='Add Contact']"));
//        el.click();
//        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("Some Name");
//        textFieldsList.get(2).sendKeys("Some@example.com");
//        driver.swipe(100, 500, 100, 100, 2);
//        driver.findElementByXPath(".//*[@text='Save']").click();
//    	Set<String> set = driver.getContextHandles();
//    	for (String string : set) {
//			System.out.println(string);
//		}
//    
//    	String con = driver.getContext();
//    	System.out.println(con);
//    	WebElement el = driver.findElementById("layout.android.forte.com.androidlayout:id/editText");
//    	el.sendKeys("HELLO");
    	
    	
//    	Thread.sleep(5000);
//		int widht = driver.manage().window().getSize().width;
//		int height = driver.manage().window().getSize().height;
//		for (int i = 0; i <= 5; i++) {
//			driver.swipe(widht * 6 / 7, height / 2, widht / 7, height / 2, 3000);
//		}
//		Thread.sleep(3000);
//		WebElement enter = driver.findElementByName("立即进入");
//		enter.click();
//		Thread.sleep(3000);
		
		
		List<AndroidElement> list = driver.findElementsByClassName("android.widget.EditText");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.get(0).sendKeys("15800960260");
		list.get(1).sendKeys("123456");
		
		WebElement login = driver.findElementByName("登录");
		login.click();
    	
    }

}
