package smoke_suite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Members;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Member_Profile;
import Utilities.LambdaTestListener;
@Listeners(LambdaTestListener.class)
public class ALC_347 extends BaseClass{
	
	    
	@Test(priority =1, description="Create a member on alchemy and give 1000 tokens into it's wallet")
	@Description("Create a member on alchemy and give 1000 tokens into it's wallet")
	public void create_a_member_with_tokens() throws InterruptedException {
		try{
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Members m = new Members(alcDriver);
		m.createRandomMemberWithTokens(Members.philippines, "+63", "1000");
		((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
		}catch(Exception e) {
			((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
		}
	}

	@Test(priority=2, description="Login into app and verify the presence of tokens in the member wallet in app")
	@Description("Login into app and verify the presence of tokens in the member wallet in app")
	public void verify_tokens_present_in_app() throws InterruptedException {
		try{
		PB_LoginPage pl = new PB_LoginPage(pbDriver);
		pl.login(Members.rnewnum,"123456a","+63");
		Thread.sleep(5000);
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		pmp.verifytokensarepresent();
			((JavascriptExecutor) pbDriver).executeScript("lambda-hook: {\"action\": \"setTestStatus\",\"arguments\": {\"status\":\"passed\", \"remark\":\"This is a passed test \"}} ");
	        
		}catch(Exception e) {
			((JavascriptExecutor) pbDriver).executeScript("lambda-hook: {\"action\": \"setTestStatus\",\"arguments\": {\"status\":\"failed\", \"remark\":\"This is a failed test \"}} ");
	        
		}
	}
	@Test(priority=3, description="Reclaim 1000 tokens from the member on alchemy.")
	@Description("Reclaim 1000 tokens from the member on alchemy.")
	public void reclaim_tokens_on_alchemy() {
		try{
		Members m = new Members(alcDriver);
		m.reclaimtokens();
			((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "passed");
		
		}catch(Exception e) {
			((JavascriptExecutor) alcDriver).executeScript("lambda-status=" + "failed");
		}
	}
	@Test(priority=4, description="Verify the absence of tokens in member wallet in app.")
	@Description("Verify the absence of tokens in member wallet in app.")
	public void verify_tokens_not_present_in_app() throws InterruptedException {
		try{
		PB_LoginPage pl = new PB_LoginPage(pbDriver);
		pl.logoutmem();
		PB_LoginPage pl1 = new PB_LoginPage(pbDriver);
		pl1.login(Members.rnewnum,"123456a","+63");
		Thread.sleep(5000);
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		pmp.verifytokensarenotpresent();
			 ((JavascriptExecutor) pbDriver).executeScript("lambda-hook: {\"action\": \"setTestStatus\",\"arguments\": {\"status\":\"passed\", \"remark\":\"This is a passed test \"}} ");
	        
		}catch(Exception e) {
			((JavascriptExecutor) pbDriver).executeScript("lambda-hook: {\"action\": \"setTestStatus\",\"arguments\": {\"status\":\"failed\", \"remark\":\"This is a failed test \"}} ");
	        
		}
	}
	
}
