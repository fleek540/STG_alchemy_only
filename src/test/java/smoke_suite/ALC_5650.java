package smoke_suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Impact_Hub;
import io.qameta.allure.Description;

public class ALC_5650 extends BaseClass{
	@Test(priority=0,description="Check preconditions")
	@Description("Check preconditions")
public void preconditions() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Impact_Hub ih = new Impact_Hub(alcDriver);
		ih.preconditions();
		teststatus=true;
	}
	@Test(priority=1, description="Check if copy buttons are clickable.")
	@Description("Check if copy buttons are clickable.")
	public void checkcopybutton() throws InterruptedException {
		Impact_Hub ih = new Impact_Hub(alcDriver);
		ih.next();
		teststatus=true;
	}
}
