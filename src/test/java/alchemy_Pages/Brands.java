package alchemy_Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Brands extends BaseClass {
    public Brands(WebDriver alcDriver) {

        PageFactory.initElements(alcDriver, this);
    }
    @FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Brands ']")
    public WebElement brands_TAB;
    @FindBy(xpath = "//div[@class='container-fluid']/div[2]") WebElement plus_createBtn;
    @FindBy(xpath = "//loader/div//table") WebElement pageLoader;
    @FindBy(xpath = "//input[@id='name']") WebElement brandName;
    @FindBy(xpath = "//*[text()='Create']")
    WebElement createBtn;
    @FindBy(xpath = "//datatable//input[@placeholder='Name']")
    WebElement name_SearchBox;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
    WebElement tableData_FirstRow;




    public void clickBranchTab() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.elementToBeClickable(brands_TAB));
        brands_TAB.click();
        takescreenshotof(brands_TAB,"open brand tab");
    }
    public void clickBrandCreate_Btn() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.invisibilityOf(pageLoader));
        Thread.sleep(5000);
        plus_createBtn.click();
        takescreenshotof(plus_createBtn,"Brand form open");
    }
    public void enterNewBrandName(String name) throws InterruptedException {
//        wait30.until(ExpectedConditions.invisibilityOf(pageLoader));
        Thread.sleep(5000);
        brandName.click();
        Thread.sleep(2000);
        brandName.clear();
        Thread.sleep(2000);
        brandName.sendKeys(name);
    }
    public void clickCreateBrandBtnAfterFillDetails(){
        createBtn.click();
    }
    public void search_byName(String name) throws InterruptedException {
//        wait30.until(ExpectedConditions.invisibilityOf(pageLoader));
        Thread.sleep(3000);
        wait300.until(ExpectedConditions.elementToBeClickable(name_SearchBox));
        name_SearchBox.click();
        name_SearchBox.clear();
        name_SearchBox.sendKeys(name);
        Thread.sleep(10000);
    }
    public String verifyCreatedBrand() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(tableData_FirstRow));
//        String text = tableData_FirstRow.getText();
        String actual=tableData_FirstRow.getText();
        System.out.println("Update brand name in bonus="+ actual);
//        System.out.println("Update brand name in bonus="+ actual[1]);
        return actual;
    }
}
