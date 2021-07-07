//import Pages.Util.TestProperties;
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//public class BaseTest {
//
//    public static WebDriver driver;
//    public static String baseUrl;
//    public static Properties properties = TestProperties.getInstance().getProperties();
//
//    public static WebDriver getDriver() {
//        return driver;
//    }
//
//    @Before
//    public void BeforeTest(){
//        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
//        baseUrl = properties.getProperty("app.url");
//        System.out.println(baseUrl);
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    public void sendText (By locator, String value)
//    {
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(value);
//    }
//}
