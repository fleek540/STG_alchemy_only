package smoke_suite;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Orders;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

public class ALC_666 extends BaseClass {

    @Test(priority = 0, description = "Create data and do Transactions")
    public void createDataAndPerformTransaction() throws IOException {

        Data d = new Data();
        d.runNewman_ALC666();
        teststatus=true;

    }
    @Test(priority=1,description = "create Order In Alchemy and adding Processors")
    public void createOrder() throws InterruptedException {

        AlchemyLoginPage login=new AlchemyLoginPage(alcDriver);
        login.alc_adminlogin("+17783844311","778778");

        Orders o1= new Orders(alcDriver);
        o1.createOrder666(Data.processor_Name666);
        teststatus=true;

    }

    @Test(priority=2,description = "Adding Bonus Order to current Order and adding ")
    public void addBonusToOrder666() throws InterruptedException {

        Orders o2= new Orders(alcDriver);
        o2.addBonusToOrder666(Data.bonusName666,"RENEWAL |Kari Gran Inc|Impact Program| - 01/10/2022 - PH - IP");
        teststatus=true;
    }
    @Test(priority=3,description = "Verify after adding Bonus order via Add Bonus Total Collected should increase and the Graph should be fulfilled based on the KG delivered by the added Bonus order")
    public void verifyValuesAfterBonusAdded() throws InterruptedException {

        Orders o3= new Orders(alcDriver);
        o3.verifyDonughtGraph(110);
        teststatus=true;
    }
    @Test(priority=4,description = "Verify Audit trail in SP order is updated with transactions based on the added Bonus order")
    public void verifyAuditTrails() throws InterruptedException {

        Orders o4= new Orders(alcDriver);
        o4.verifyAuditTrail();
        teststatus=true;

    }
    @Test(priority=5,description = "Detach connected Bonus RENEWAL |Kari Gran Inc|Impact Program| ")
    public void detachConnectedBonus() throws InterruptedException {

        Orders o5= new Orders(alcDriver);
        o5.detachBonusToplun();
        teststatus=true;
    }

}
