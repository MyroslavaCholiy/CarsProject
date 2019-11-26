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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedSearchTest {

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

//    WebDriverWait wait = new WebDriverWait(BrowserDrivers.getDriver(), 10);
//    JavascriptExecutor jse = (JavascriptExecutor) BrowserDrivers.getDriver();
    public AdvancedSearchTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        WebDriverManager.chromedriver().setup();// It will manage CromeDriver version

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("It starts to run my before test ");
//      WebDriverManager.chromedriver().setup(); // It will manage CromeDriver version
//      System.setProperty("webdriver.chrome.driver", "C:\\data1\\chromedriver78.exe");
        driver = new ChromeDriver();

//      System.setProperty("webdriver.geckodriver.driver", "C:\\data\\geckodriver.exe");
//      driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("This will run before my test case");
    }

    @After
    public void tearDown() {

        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
            driver.quit();
        }

    }

    @Test
    public void testCarsTest1() throws Exception {
        driver.get("https://www.cars.com/");
        System.out.println("Title is: " + driver.getTitle());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[1]/following::a[1]")).click();
        driver.findElement(By.linkText("Advanced Search")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[9]")).click();
        assertEquals("Advanced Search", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::h1[1]")).getText());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ZIP Code'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ZIP Code'])[1]/following::select[1]"))).selectByVisibleText("50 miles of");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ZIP Code'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ZIP Code'])[1]/following::div[1]")).click();
        driver.findElement(By.name("zipField")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ZIP Code'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Please enter a valid 5-digit ZIP code.'])[2]/following::label[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search By'])[1]/following::label[1]")).click();
        driver.findElement(By.name("make")).click();
        new Select(driver.findElement(By.name("make"))).selectByVisibleText("Audi");
        driver.findElement(By.name("make")).click();
        driver.findElement(By.name("model")).click();
        new Select(driver.findElement(By.name("model"))).selectByVisibleText("A5");
        driver.findElement(By.name("model")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]"))).selectByVisibleText("$15,000");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]"))).selectByVisibleText("$90,000");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]"))).selectByVisibleText("2015");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]"))).selectByVisibleText("2019");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]"))).selectByVisibleText("40,000 or less");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Exterior Color'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Exterior Color'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]"))).selectByVisibleText("Black");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]"))).selectByVisibleText("Automatic");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]"))).selectByVisibleText("4x4/4-wheel drive");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]"))).selectByVisibleText("4-cylinder");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Seller Type'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Seller Type'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]"))).selectByVisibleText("Last 2 Weeks");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Gasoline'])[1]/input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]")).click();
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]"))).selectByVisibleText("Match All");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::input[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[7]")).click();
        assertEquals("Used Audi A5 for Sale", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[7]")).getText());
    }

    private boolean isElementPresent(By by) {
        System.out.println("It will show NoSuchElementException");
        try {

            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;

        }

    }

    private boolean isAlertPresent() {
        System.out.println("It will show NoAlertPresentException");
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        System.out.println("It will show closeAlertAndGetItsText");
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
