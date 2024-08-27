package Utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import io.qameta.allure.Allure;
import static org.bytedeco.javacpp.lept.pixDestroy;
import static org.bytedeco.javacpp.lept.pixRead;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import java.util.regex.Matcher;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class BaseClass {
		
	public String string;
	public static String benefitordername;
	public static String androidbenefitname;
	public static String bonusname;
public static String password ="123456a"; 
public static String devicetime;
public static WebDriverWait wait3;
public static WebDriverWait wait30;
public static WebDriverWait wait10 ;
public static WebDriverWait wait300;
public static WebDriverWait wait200;
public static WebDriverWait wait2s;
public static WebDriverWait waitms;
public static boolean needforpasswordchange;
public static boolean gojekyn;
	public String memberBonus = "7";
	public String branchBonus = "2";
	
	public String hdpe_M_B1 = "10";
	public String pet_M_B1 = "9";
	public String kgdelivered = "19";///////// 76 -19
	public String kgpromised = "50,000";
	public String kgpending = "19";//////////// 76-19-0

	public String hdpe_B1_B2 = "8";
	public String pet_B1_B2 = "7";

	public String hdpe_B1_B3 = "6";
	public String pet_B1_B3 = "5";

	public String hdpe_B2_P = "4";
	public String pet_B2_P = "3";

	public String hdpe_B3_P = "1";
	public String pet_B3_P = "1";

	public String total_bonus_M_B1 = "133";
	public String hdpe_bonus_M_B1 = "70";
	public String pet_bonus_M_B1 = "63";
	public String hdpe_KG_M_B1 = "10";
	public String pet_KG_M_B1 = "9";

	public String total_bonus_B1_B2 = "30";
	public String hdpe_bonus_B1_B2 = "16";
	public String pet_bonus_B1_B2 = "14";
	public String hdpe_KG_B1_B2 = "8";
	public String pet_KG_B1_B2 = "7";

	public String total_bonus_B1_B3 = "8";
	public String hdpe_bonus_B1_B3 = "4";
	public String pet_bonus_B1_B3 = "4";
	public String hdpe_KG_B1_B3 = "6";
	public String pet_KG_B1_B3 = "5";

	public String total_bonus_B2_P = "14";
	public String hdpe_bonus_B2_P = "8";
	public String pet_bonus_B2_P = "6";
	public String hdpe_KG_B2_P = "4";
	public String pet_KG_B2_P = "3";

	public String total_bonus_B3_P = "4";
	public String hdpe_bonus_B3_P = "2";
	public String pet_bonus_B3_P = "2";
	public String hdpe_KG_B3_P = "1";
	public String pet_KG_B3_P = "1";

	public String alc_B1_ExngHisBonusVerify[] = { "8", "30", "133" };// B1-B3,B1-B2,M-B1
	public String alc_B2_ExngHisBonusVerify[] = { "14", "30" };// B2-P,B2-B1
	public String alc_B3_ExngHisBonusVerify[] = { "4", "8" };// B3-P,B3-B1
	public String alc_P_ExngHisBonusVerify[] = { "4", "14" };

	// HDPE Kg, PET Kg, Total Kg
	public String alc_M_B1_ExngHisKgVerify[] = { "10 KG", "9 KG", "19 KG" };
	public String alc_B1_B2_ExngHisKgVerify[] = { "8 KG", "7 KG", "15 KG" };
	public String alc_B1_B3_ExngHisKgVerify[] = { "6 KG", "5 KG", "11 KG" };
	public String alc_B2_P_ExngHisKgVerify[] = { "4 KG", "3 KG", "7 KG" };
	public String alc_B3_P_ExngHisKgVerify[] = { "1 KG", "1 KG", "2 KG" };

	public static RemoteWebDriver alcDriver;
	
	
	  protected static String randomPhoneNumber;
	  protected static String randomBusinessName;
	  protected static String randomBenefitName;
	  protected static String randomBrandName;
	  protected static String randomBranchMemberPhoneNumber;
	  protected static String randomBranchMemberName;
	  
	  protected static String randomLastName;
	  
	 
	public String memberName;
	public String branchmemberName;
	public String phoneNumber;
	public String branchMemberphoneNumber;
	public String adminphoneNumber;
	public String adminpassword;
	public String branchName;
	public  static LocalDateTime now = LocalDateTime.now();


    // Define the date format
   public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Format the date as a string
    public static String formattedDate = now.format(formatter);

	public static String temp= "qa-admin.cognitionfoundry.io";
	public static String actual = "qa-admin.cognitionfoundry.io";
	 public String username = "ashish.rawatfleekitsolutions";
	    public String accesskey = "MWAa6go8FynMFZt5GYZyeKtSycfc6I2YKQhFn1PH2h1Tw6Syo2";
	    public static final String URL = "";

	    protected boolean status = false;
	@Parameters({"udid"})
	@BeforeClass

	public void setup() throws IOException {
		 String testName = this.getClass().getSimpleName();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("125");
		HashMap<String, Object> ltOptions1 = new HashMap<String, Object>();
		ltOptions1.put("w3c", true);
		ltOptions1.put("username", "ashish.rawatfleekitsolutions");
		ltOptions1.put("accessKey", "MWAa6go8FynMFZt5GYZyeKtSycfc6I2YKQhFn1PH2h1Tw6Syo2");
		ltOptions1.put("project", "Plastic Bank");
		ltOptions1.put("build", "Alchemy tests QA"+" "+formattedDate);
		ltOptions1.put("idleTimeout","1700");
		ltOptions1.put("name", testName);
		ltOptions1.put("selenium_version", "4.13.0");
		browserOptions.setCapability("LT:Options", ltOptions1);
		
		alcDriver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub"), browserOptions);

		alcDriver.setFileDetector(new LocalFileDetector());
		  alcDriver.manage().window().maximize();
		  alcDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		  alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		  wait300 = new WebDriverWait(alcDriver,Duration.ofSeconds(300)); 
		  wait2s = new WebDriverWait(alcDriver,Duration.ofSeconds(2)); 
		  waitms = new WebDriverWait(alcDriver,Duration.ofMillis(100));
		  alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");
		  
		 
		
		
		 
		 
		 
		 
		  memberName = "Gayas"; 
		  branchmemberName = "Gayas " + randomBranchMemberName;
		  password= "123456a"; 
		  phoneNumber = "+63" + randomPhoneNumber;
		  branchMemberphoneNumber = "+63" + randomBranchMemberPhoneNumber;
		  
		  adminphoneNumber = "+919560071590"; 
		  adminpassword = "123456a"; 
		  branchName = randomBusinessName;       
		 
	}

	
	
	 
	 
	public void takescreenshotof(WebElement element, String Scrnsht_message) throws InterruptedException {
		Actions action = new Actions(alcDriver);
		action.moveToElement(element).build().perform();
	   	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment(Scrnsht_message, new ByteArrayInputStream(screenshot1));
			Thread.sleep(2000);
	}
	
	 
	
	  @BeforeSuite 
	  public void generateRandomNumber() { 
		  randomPhoneNumber =RandomStringUtils.randomNumeric(8); 
		  System.out.println("Member Number :+63" +randomPhoneNumber); }
	  
	  protected String getRandomPhoneNumber() {
		  
		  return randomPhoneNumber;
		  }
	  
	  
	  @BeforeSuite 
	 
	
	  public void generateRandomLastName() {
		  
	  randomLastName = RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Member Name : Gayas " + randomLastName); }
	  
	  protected String getRandomLastName() {
		  return randomLastName; 
		  }
	  
	  @BeforeSuite 
	  public void generateBranchMemberName() {
	  randomBranchMemberName = "Gayas " + RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Member Name :" + randomBranchMemberName);
	  }
	  
	  protected String getBranchMemberNumber() { 
	
		  return randomBranchMemberName; 
		  }
	  
	  @BeforeSuite public void generateRandomBranchMemberNumber() {
	  randomBranchMemberPhoneNumber = RandomStringUtils.randomNumeric(8);
	  System.out.println("Branch Member Number : +63" +
	  randomBranchMemberPhoneNumber); }
	  
	  protected String getRandomBranchMemberNumber() { 
		  return randomBranchMemberPhoneNumber; }
	  
	  @BeforeSuite 
	  public void generateBranchName() { 
		  randomBusinessName = "Gayas "+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Branch Name :" +randomBusinessName);
		  }
	  
	  protected String getBranchName() { 
		  return randomBusinessName; 
		  }
	  @BeforeSuite 
	  public void generateBenefitName() { 
		  randomBenefitName = "fleek"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Benefit Name :" +randomBenefitName);
		  }
	  
	  protected String getBenefitName() { 
		  return randomBenefitName; 
		  }
	  @BeforeSuite 
	  public void generateBrandName() { 
		  randomBrandName = "fleek"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Brand Name :" +randomBrandName);
		  }
	  
	  protected String getBrandName() { 
		  return randomBrandName; 
		  }
	  @BeforeSuite 
	  public void generateBenefitOrderName() { 
		  benefitordername = "mainakfleek"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Benefit Order Name :" +benefitordername);
		  }
	  
	  protected String getBenefitOrderName() { 
		  return benefitordername; 
		  }
	  @BeforeSuite 
	  public void generateAndroidBenefitname() { 
		  androidbenefitname = "android"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Android benefit Name :" +androidbenefitname);
		  }
	  
	  protected String getAndroidBenefitname() { 
		  return androidbenefitname; 
		  }
	  @BeforeSuite 
	  public void generateBonusName() { 
		  bonusname = "FleekBonus"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Bonus Name :" +bonusname);
		  }
	  
	  protected String getBonusName() { 
		  return bonusname; 
		  }

	
	@AfterClass
	public void teardownalchemy() {

		try {
			
			alcDriver.quit();
		}
		catch (NoSuchSessionException e){
			System.out.print("No such session exception call"+e.getMessage());
		}

	}
	
	public static int stringToInt(String input){

		// Define a regular expression pattern to match the number
		Pattern pattern = Pattern.compile("\\d+");

		// Create a matcher that matches the pattern to the input string
		Matcher matcher = pattern.matcher(input);

		// Find the first occurrence of the pattern in the input
		if (matcher.find()) {
			// Extract and parse the matched number
			String matchedNumber = matcher.group();
			return Integer.parseInt(matchedNumber);
		}

		// Return a default value or handle the case where no number is found
		return 0; // Default value (you can change this to suit your needs)
	}
	public static int convertStringToInteger(String input) {
		// Remove non-numeric characters and commas
		String numericString = input.replaceAll("[^0-9]", "");

		// Parse the remaining string as an integer
		int convertedValue = Integer.parseInt(numericString);

		return convertedValue;
	}


}
