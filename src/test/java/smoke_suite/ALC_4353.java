package smoke_suite;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Brands;
import alchemy_Pages.Orders;
import io.qameta.allure.Description;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ALC_4353 extends BaseClass {
    @Test(priority = 0, description = "Login on alchemy with admin user")
    @Description("Alchmey Login")
    public void loginAlchmey() throws InterruptedException {
    
        System.out.println("Alchmey Login");
        AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
        loginAlchmey.alc_adminlogin("+17783844311","778778");
        Thread.sleep(3000);
        Orders o= new Orders(alcDriver);
    	o.clickOrdersTab();
        o.clickBounsTab();
        o.clickBonusCreate_Btn();
        o.enterBonusName(bonusname);
        o.selectCountry();
        o.selectBrand("plas");
        o.selectBonusCategory();
        o.enterTotalWeight("10000");
        o.enterMembersBonus("7");
        o.enterBranchBonus("2");
        o.refid.sendKeys("refid1234");
        o.orderdate.click();
        try {
        o.selectdate();
        }catch(Exception e) {
        	
        }
        o.clickCreateBonusBtn();
        o.enterAuthCode("778899");
        o.clickSubmitAuthCode();
        o.search_byName(bonusname);
        teststatus=true;

    }
    @Test(priority = 1, description = "Go to 'Brand' Section and Create a new brand by clicking on the '+' icon")
    @Description("Create a new brand")
    public void createNewBrand() throws InterruptedException {
    	
        System.out.println("New brand create");
        Brands brands=new Brands(alcDriver);
        brands.clickBranchTab();
        Thread.sleep(2000);
        brands.clickBrandCreate_Btn();
        brands.enterNewBrandName(randomBrandName);
        brands.clickCreateBrandBtnAfterFillDetails();
        brands.search_byName(randomBrandName);
        Assert.assertEquals(brands.verifyCreatedBrand(), randomBrandName);
        teststatus=true;
    }
    @Test(priority = 2, description = "Bonus order should be updated with the new brand")
    @Description("Search for newly created brand and save")
    public void searchNewlyCreatedBrandInBonus() throws InterruptedException {
        System.out.println("Search an existing bonus order and click 'Edit settings'");
        
        Orders orders = new Orders(alcDriver);
        orders.searchBonus(bonusname);
        orders.clickSpecificOrdersBonus();
        orders.searchCreatedBrandInBonusAndSave(randomBrandName);
        orders.searchBonus(bonusname);
        Assert.assertEquals(orders.verifyChnagesInBounsForBrandName(), randomBrandName);
        teststatus=true;
    }
}
