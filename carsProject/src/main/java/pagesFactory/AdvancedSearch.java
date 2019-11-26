package pagesFactory;

import java.sql.Driver;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearch {

    WebDriver driver;
    String URLpath = "https://www.cars.com/";

    public AdvancedSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);//This initElements method will create all WebElements
    }

    @FindBy(xpath = "//a[contains(text(),'Cars for Sale')]/@href")
    public WebElement carsForSale;

    @FindBy(linkText = "Advanced Search")
    public WebElement AdvancedSearch;

//    @FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[9]")
//    public WebElement AdvancedSearchTitle;
//     AdvancedSearchTitle.click();
    @FindBy(xpath = "//select[@class = 'as-radii-drop-down ng-pristine ng-untouched ng-valid ng-not-empty']")
    public WebElement searchWithin;
    Select searchWithinSelect = new Select(searchWithin);

    @FindBy(xpath = "//input[@name='zipField']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@name='stockType'][@value='new']")
    public WebElement newCar;

    @FindBy(xpath = "//input[@name='stockType'][@value='used']")
    public WebElement usedCar;

    @FindBy(xpath = "//input[@name='stockType'][@value='cpo']")
    public WebElement certifiedCar;

    @FindBy(xpath = "//input[@name='stockType'][@value='mix']")
    public WebElement allCar;

    @FindBy(xpath = "//*[@class='as-all-styles']")
    public WebElement searchByMakeModelRadioBtn;

    @FindBy(xpath = "//*[@class='as-choose-a-style']")
    public WebElement searchByBodyStyleRadioBtn;

    @FindBy(xpath = "//select[@name ='make']")
    public WebElement selectMake;

//    @FindBy(name = "make")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    
//    (By.name("make"))).selectByVisibleText("Audi");
//    
//    @FindBy(name = "make")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(name = "model")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement 
//    
//    
//    
//    
//    
//    (By.name("model"))).selectByVisibleText("A5");
//    
//    @FindBy(name = "model")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement 
//   
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]"))).selectByVisibleText("$15,000");
//    
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//
//    
//    
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]"))).selectByVisibleText("$90,000");
//    
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Price Range'])[1]/following::select[2]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement     
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]"))).selectByVisibleText("2015");
//    
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//
//    
//    
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]"))).selectByVisibleText("2019");
//    
//     @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Year Range'])[1]/following::select[2]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement 
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]"))).selectByVisibleText("40,000 or less");
//    
// @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Mileage'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Exterior Color'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Exterior Color'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]"))).selectByVisibleText("Black");
//    
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Interior Color'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]"))).selectByVisibleText("Automatic");
//    
//     @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Transmission'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]"))).selectByVisibleText("4x4/4-wheel drive");
//    
//     @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Drivetrain'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]"))).selectByVisibleText("4-cylinder");
//    
//     
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Cylinder Count'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Seller Type'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Seller Type'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]"))).selectByVisibleText("Last 2 Weeks");
//   
// @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Listing Date'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Gasoline'])[1]/input[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    new Select(driver.findElement
//    
//    
//    
//    
//    (By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]"))).selectByVisibleText("Match All");
//  
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::select[1]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Additional Keywords'])[1]/following::input[2]")
//    public WebElement ;
//
//    .click();
//
//    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[7]")
//    public WebElement ;
//
//    .click();
//        assertEquals("Used Audi A5 for Sale", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[2]/following::div[7]")).getText());

    public void carsForSaleClick() {
        carsForSale.click();
    }

    public void advancedSearchClick() {
        AdvancedSearch.click();
    }

    public void searchWithinLocator() {
        searchWithin.click();
    }

    public void setSearchWithinSelect(Select searchWithinSelect) {
        this.searchWithinSelect = searchWithinSelect;

        searchWithinSelect.selectByValue("string:30");
        //searchWithinSelect.selectByVisibleText("30 miles of");
        //searchWithinSelect.getOptions();
    }

    public void zipCodeLocator() {
        zipcode.clear();
        zipcode.sendKeys("60089");
    }

    public void serchByRadioBtn() {
        if (searchByMakeModelRadioBtn == null) {
            searchByBodyStyleRadioBtn.click();
        } else if (searchByBodyStyleRadioBtn == null) {
            searchByMakeModelRadioBtn.click();
        }
    }

    public void selectMakeClick() {
        selectMake.click();
        Select selectMakeOtions = new Select(selectMake);
        selectMakeOtions.selectByValue("number:0");
        
//        if (selectMakeOtions==0){
//        selectMakeOtions.getFirstSelectedOption();
//        }

    }

}
