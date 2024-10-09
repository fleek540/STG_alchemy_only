package smoke_suite;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Bonus;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;

public class ALC_4362 extends BaseClass {
	@Test(priority =0,enabled=true, description = "Approve_transactions_In_Bonus_Sell_Buy_Verify_In_BranchExchangeHistory")
	@Description("Approve_transactions_In_Bonus_Sell_Buy_Verify_In_BranchExchangeHistory")
	public void  Approve_transactions_In_Bonus_Sell_Buy_Verify_In_BranchExchangeHistory() throws IOException, InterruptedException {
	
		Data pn=new Data();
		Branches br = new Branches(alcDriver);
		Bonus bn =new Bonus(alcDriver);
		
		pn.runNewmanALC_4362();
		
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Thread.sleep(3000);
		
		br.transactionApproveInBranch(Data.branch1_Number);
		bn.bonusVerifyInBonusApproval(Data.bonusName);
		teststatus=true;
		
	}

	
}
