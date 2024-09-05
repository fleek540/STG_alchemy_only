package smoke_suite;
import java.awt.AWTException;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Impact_Hub;
import io.qameta.allure.Description;

public class ALC_5661 extends BaseClass{
	@Test(priority=0,description="Upload a resource")
	@Description("Upload a resource")
	public void upload_resource() throws InterruptedException, AWTException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Impact_Hub ih=new Impact_Hub(alcDriver);
		ih.uploadResource2();
	}
	
	@Test(priority=1,description="Verify when resource  added in Client dashboard is added to the APIs and Resource page under Resource section in impact hub.")
	@Description("Verify when resource  added in Client dashboard is added to the APIs and Resource page under Resource section in impact hub.")
	public void openImpactHub() throws InterruptedException {
		Impact_Hub ih=new Impact_Hub(alcDriver);
		ih.openAPIsandResources2();
	}
	@Test(priority=2,description="Verify that when a user clicks on the assets within the Resources section, the system should download the file.")
	@Description("Verify that when a user clicks on the assets within the Resources section, the system should download the file.")
	public void downloadFile() throws InterruptedException {
		Impact_Hub ih=new Impact_Hub(alcDriver);
		ih.verifyDownload();
	}

}
