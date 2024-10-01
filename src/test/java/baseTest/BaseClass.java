package baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;
import utils.PageObjectManager;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    private String dir;
    protected AndroidDriver driver;
    protected PageObjectManager pm;
    protected String email;
    protected String pass;
    public AppiumDriverLocalService service;

    @BeforeTest
    public void setEmulator() throws MalformedURLException {
            dir = System.getProperty("user.dir");
//            service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//                    .withIPAddress("127.0.0.1").usingPort(4723).build();
//            service.start();
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setPlatformVersion("Android 11");
            options.setDeviceName("Pixel 6 pro API 30");
            options.setApp(dir + "//src//main//ApkFile//sauce.apk");
            options.setUdid("emulator-5554");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void getConfigProperties() {
        try {
            FileInputStream fis = new FileInputStream(dir + "//src//test//resources//config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            email = prop.getProperty("email");
            pass = prop.getProperty("password");
        } catch (Exception ignored) {

        }
    }

    @BeforeMethod
    public void init() {
        this.getConfigProperties();
        pm = new PageObjectManager(driver);
    }

    @AfterMethod
    public void quitApplication() {
        if (driver != null)
            driver.quit();
//        if (service != null)
//            service.stop();
    }
}
