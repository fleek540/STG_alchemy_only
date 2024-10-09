package smoke_suite;
import java.io.IOException;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Orders;
import io.qameta.allure.Description;

public class ALC_6693 extends BaseClass{
	
	
	@Test(priority =1, description="Run collection to deliver materials to processor")
	@Description("Run collection to deliver  materials to processor")
	public void deliverall() throws InterruptedException, IOException {
		Data d= new Data();
		d.alc_6693_1();
		teststatus=true;
	}
	
	@Test(priority =2, description="Tests in alchemy after delivering materials to processor")
	@Description("Tests in alchemy after delivering materials to processor")
	public void test1() throws InterruptedException, IOException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Orders o = new Orders(alcDriver);
		o.testsaftermaterialstransferred(Data.bonusName6693);
		teststatus=true;
	}
	@Test(priority =3, description="Run collection to deliver selected materials to processor")
	@Description("Run collection to deliver selected materials to processor")
	public void deliverselected() throws InterruptedException, IOException {
		Data d= new Data();
		d.alc_6693_2();
		teststatus=true;
	}
	
	@Test(priority =4, description="Tests in alchemy after delivering selected materials to processor")
	@Description("Tests in alchemy after delivering selected materials to processor")
	public void test2() throws InterruptedException, IOException {
		Orders o = new Orders(alcDriver);
		o.testsafterselectedmaterialstransferred6693(Data.bonusName_6693);
		teststatus=true;
	}
	

}
