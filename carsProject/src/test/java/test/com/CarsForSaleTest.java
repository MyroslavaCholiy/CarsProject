package test.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarsForSaleTest {

    private WebDriver driver;
    public String baseUrl = "https://www.cars.com/";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public CarsForSaleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup(); // It will manage and contro version of CromeDriver version
//      WebDriverManager.firefoxdriver().setup(); // It will manage and contro version of FireFoxDriver version
//      WebDriverManager.operadriver().setup(); // It will manage and contro version of OperaDriver version
//      WebDriverManager.phantomjs().setup(); // It will manage and contro version of PhantomDriver version
//      WebDriverManager.edgedriver().setup(); // It will manage and contro version of EdgeDriver version
//      WebDriverManager.iedriver().setup(); // It will manage and contro version of IEDriver version
               
    }
    

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() throws Exception {
        System.out.println("It starts to run my before test ");

//        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver78.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Used Driver " + driver);

    }

    @After
    public void tearDown() throws Exception {
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
    }

    @Test
    public void testCars() {
        driver.get("https://www.cars.com/");
        System.out.println(("The title is: ")+ driver.getTitle());
        
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[1]/following::a[1]")).click();
        driver.findElement(By.id("shopindex-make")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[1]")).click();
//        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[1]"))).selectByVisibleText("New Cars");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[4]")).click();
//        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[4]"))).selectByVisibleText("under $50,000");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[4]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[2]")).click();
//        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[2]"))).selectByVisibleText("Lexus");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[5]")).click();
//        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[5]"))).selectByVisibleText("10 Miles from");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::select[5]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::input[1]")).click();
//        driver.findElement(By.id("search-widget-form")).submit();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::input[1]")).clear();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By Body Style'])[1]/following::input[1]")).sendKeys("60089");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[4]")).click();
//        assertEquals("New Lexus for Sale", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[6]")).getText());
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
