package smoke_suite;


import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Impact_Hub;
import io.qameta.allure.Description;
public class ALC_5649 extends BaseClass{
	@Test(priority=0,description="Verify user can download member stories asset.")
	@Description("Verify user can download member stories asset.")
public void verify() throws InterruptedException {
		Impact_Hub ih = new Impact_Hub(alcDriver);
		ih.verifyesghomeischecked();
		ih.downloadMemberStoriesAsset();
	}
}
