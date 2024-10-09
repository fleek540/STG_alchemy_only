package smoke_suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.Impact_Hub;
import io.qameta.allure.Description;

public class ALC_5651 extends BaseClass{
@Test(priority=0,description="Verify User can see Certificates section and four images under it.")
@Description("Verify User can see Certificates section and four images under it.")
public void verify_User_can_see_certificates() throws InterruptedException {
	Impact_Hub ih=new Impact_Hub(alcDriver);
	ih.verifyCertsAndImages();
	teststatus=true;
}
}
