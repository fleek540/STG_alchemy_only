package alchemy_Pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Utilities.BaseClass;


public class Impact_Hub extends BaseClass{
	
public Impact_Hub(WebDriver alcDriver) {
		PageFactory.initElements(alcDriver, this);
		}

@FindBy(xpath="//div[contains(text(),'APIs + Resources')]")
public WebElement apisresources ;
@FindBy(xpath="//h4[contains(text(),'Resources')]")
public WebElement impactapitext ;
@FindBy(xpath="//div[contains(@routerlinkactive,'sidebar-menu-item')]")
public List<WebElement> sidenavitems ;
@FindBy(xpath="//div[contains(@style,'locations')]")   
public WebElement locationsapi ;
@FindBy(xpath="//label[text()='Sharing Tools']/parent::div/following-sibling::input")
public WebElement sharingtoolscheckbox ;
@FindBy(xpath="//span[text()='Embeddable Map']/parent::div/span/mdl-switch[contains(@class,'disabled')]")
public WebElement disabledembeddablemaptoggle;
@FindBy(xpath="//span[text()='Impact API']/parent::div/span/mdl-switch[contains(@class,'disabled')]")
public WebElement disabledimpactapitoggle;
@FindBy(xpath="//span[text()='Embeddable Map']/parent::div/span/mdl-switch[contains(@class,'checked')]")
public WebElement checkedembeddablemaptoggle;
@FindBy(xpath="//span[text()='Impact API']/parent::div/span/mdl-switch[contains(@class,'checked')]")
public WebElement checkedimpactapitoggle;
@FindBy(xpath="//span[text()='Embeddable Map']/parent::div/span/mdl-switch[contains(@class,'upgraded')]")
public WebElement uncheckedembeddablemaptoggle;
@FindBy(xpath="//span[text()='Impact API']/parent::div/span/mdl-switch[contains(@class,'upgraded')]")
public WebElement uncheckedimpactapitoggle;
@FindBy(xpath="//div[text()=' United by Blue ']")
public WebElement firstres ;
@FindBy(xpath="//input[@placeholder='Dashboard Name']")
public WebElement dashboardname ;
@FindBy(xpath="//div[contains(text(),'Client')]")
public WebElement clientdashboardtab ;
@FindBy(xpath="//h4[text()='Certificates']")
public WebElement certificates ;
@FindBy(xpath="//h4[text()='Certificates']/parent::div/following-sibling::div/div/div[contains(@style,'background-image')]")
public List<WebElement> backgroundimages ;
@FindBy(xpath="//button[contains(@class,'copy')]")
public List<WebElement> copybuttons ;
@FindBy(xpath = "//div[@class='loader circle-loader']") 
WebElement loader;
@FindBy(xpath = "//button[@class='embed-code-button']") 
WebElement embedcodebutton;
@FindBy(xpath = "//span[text()='Private Client Dashboard']") 
WebElement privcldb;
@FindBy(xpath = "//label[text()='Public/Private Client Dashboard']/following-sibling::div/span/mdl-switch") 
WebElement privcldbcheckbox;
@FindBy(xpath="//span[text()='PER PAGE:']")
public WebElement perpage;
@FindBy(xpath="//button[text()='Update']")
public WebElement update;
@FindBy(xpath="//div[text()=' Unlocked ']")
public WebElement unlocked;
@FindBy(xpath="//label[text()='Resources']/parent::div/following::div[contains(@class,'add')]")
public WebElement addresources;
@FindBy(xpath = "(//input[@id='name'])[last()]") 
WebElement resourcename;
@FindBy(xpath = "(//select[@id='type'])[last()]") 
WebElement resourcetype;
@FindBy(xpath = "(//option[text()='File'])[last()]") 
WebElement resourcetypefileoption;
@FindBy(xpath = "(//div[@class='fileUpload'])[last()]") 
WebElement resourcefileupload;
@FindBy(xpath = "//div[contains(@class,'dashboard')]/input") 
WebElement resourcefileupload2;
@FindBy(xpath = "//label[text()='Resources']/parent::div/following-sibling::input") 
WebElement resourcescheckbox;
@FindBy(xpath = "//button[text()='Crop']") 
WebElement crop;
@FindBy(xpath = "//div[contains(@class,'thumbnail')]/div") 
WebElement thumbnail;
@FindBy(xpath = "//div[contains(@class,'thumbnail')]/input") 
WebElement thumbnail2;
@FindBy(xpath = "//h4[text()='Resources']/parent::div/following-sibling::div/div/div[contains(@style,'background')]") 
WebElement resourceImage;
@FindBy(xpath = "//input[@id='name']/following-sibling::div[contains(@class,'clear')]") 
List<WebElement> clearbuttons;
@FindBy(xpath = "//button[text()=' View ']") 
WebElement view;
@FindBy(xpath = "//div[contains(text(),'Impact Stories')]/following::img") 
List<WebElement> imagesmemstories;
@FindBy(xpath = "//campaign-creator-card/div/img") 
List<WebElement> campaigncreatorcards;
@FindBy(xpath = "//button[contains(@class,'download-all')]") 
WebElement download;
@FindBy(xpath = "//label[text()='Home']/parent::div/following-sibling::input") 
WebElement esghomecheckbox;
@FindBy(xpath = "//label[text()='Home']/parent::div/following-sibling::input[@disabled]") 
WebElement esghomecheckboxdisabled;
@FindBy(xpath = "//label[text()='ESG']/parent::div/following-sibling::input") 
WebElement esgcheckbox;
@FindBy(xpath = "//div[contains(@class,'invitations')]") 
WebElement useraccess;
@FindBy(xpath = "//input[@type='email']") 
WebElement invitenewusers;
@FindBy(xpath = "//label[text()='Home']/parent::div/following-sibling::input") 
WebElement homecheckbox;
@FindBy(xpath = "//input[@placeholder='Email address']") 
WebElement ihaddress;
@FindBy(xpath = "//div[@class='close-btn-wrapper']") 
WebElement closebtnwrapper;
@FindBy(xpath = "//input[@placeholder='Password']") 
WebElement ihpw;
@FindBy(xpath = "//button[@class='login-btn']") 
WebElement ihlogin;
@FindBy(xpath = "//span[text()='Send invites']") 
WebElement sendInvites;
@FindBy(xpath = "//span[text()='Pending']") 
WebElement pending;
@FindBy(xpath = "//p[contains(text(),'Remove')]") 
WebElement remove;  
@FindBy(xpath = "//td[contains(text(),'fleek@mail.com')]") 
WebElement invite;
@FindBy(xpath = "//button[contains(text(),'Remove')]") 
WebElement remove_button;
@FindBy(xpath = "//div[@class='sort-icon']") 
WebElement sort_icon;
@FindBy(xpath = "//input[@placeholder='Email address']") 
WebElement impacthubemailaddress;
@FindBy(xpath = "//input[@placeholder='Password']") 
WebElement impacthubpassword;
@FindBy(xpath = "//input[@id='mail_address']") 
WebElement tempmail;
@FindBy(xpath = "//p[contains(@title,'noreply')]") 
WebElement noreply;
@FindBy(xpath = "//table[@role='presentation' and contains(@class,'btn')]/tbody/tr/td/table/tbody/tr") 
WebElement registertodashboard;
@FindBy(xpath = "//select[@id='countryId']") 
WebElement countrycode;
@FindBy(xpath = "//option[contains(text(),'AC')]") 
WebElement option;
@FindBy(xpath = "//input[@id='phone']") 
WebElement phone;
@FindBy(xpath = "//input[@id='password']") 
WebElement password;
@FindBy(xpath = "//input[@id='password-re']") 
WebElement passwordre;
@FindBy(xpath = "//button[@type='submit']") 
WebElement register;
@FindBy(xpath = "//button[@type='button']") 
WebElement ok;
@FindBy(xpath = "//div[contains(@class,'logout')]") 
WebElement logout;
@FindBy(xpath = "//td") 
WebElement latestmail;
@FindBy(xpath = "//body") 
WebElement body;
@FindBy(xpath = "//p[text()='Copy email']") 
WebElement copymail;
@FindBy(xpath = "//span[@class='slider round']") 
WebElement sliderround;
@FindBy(xpath = "//button[contains(text(),'Agree')]") 
WebElement agreebutton;
@FindBy(xpath = "//p[contains(text(),'If you have any')]") 
WebElement lastline;
@FindBy(xpath = "//*[local-name()='svg' and contains(@class,'cursor')]") 
WebElement refresh;
@FindBy(xpath = "//span[contains(text(),'expired')]") 
WebElement expired;
@FindBy(xpath = "//div[contains(@class,'add-new-admin')]") 
WebElement addnewadmin;
@FindBy(xpath = "//input[@placeholder='Search']") 
WebElement searchnewadmin;
@FindBy(xpath = "//div[@class='search-icon']") 
WebElement searchicon;
@FindBy(xpath = "//div[contains(text(),'ashish.rawat@fleekitsolutions.com')]") 
WebElement ashishsir;
@FindBy(xpath = "//button[contains(text(),'Confirm')]") 
WebElement confirm;
@FindBy(xpath = "//div[contains(text(),'Feedback')]") 
WebElement feedback;
@FindBy(xpath = "//div[contains(text(),'Campaign Creator')]") 
WebElement campaigncreator;
@FindBy(xpath = "//div[contains(text(),'Marketing Calendar')]") 
WebElement marketingcalendar;
@FindBy(xpath = "//div[contains(text(),'ESG Marketplace')]") 
WebElement esgmarketplace;
@FindBy(xpath = "//div[contains(text(),'Partner Timeline')]") 
WebElement partnertimeline;
@FindBy(xpath = "//div[contains(text(),'Home')]") 
WebElement home;

@FindBy(xpath = "//div[contains(text(),'Send us your feedback')]") 
WebElement sendusfeedback;
@FindBy(xpath = "//div[contains(text(),'Send feedback')]") 
WebElement sendfeedback;
@FindBy(xpath = "//button[contains(text(),'Choose')]") 
WebElement choose;
@FindBy(xpath = "//button[contains(text(),'Dashboard')]") 
WebElement dashboard;
@FindBy(xpath = "//textarea[@placeholder='Your feedback']") 
WebElement textarea;
@FindBy(xpath = "//button[@type='submit']") 
WebElement submitfeedback;
@FindBy(xpath = "//div[contains(text(),'Thanks')]") 
WebElement thanks;
@FindBy(xpath = "//h4[contains(text(),'Material Credits')]") 
WebElement materialcredits;
@FindBy(xpath = "//h4[contains(text(),'Social Benefits')]") 
WebElement socialbenefits;
@FindBy(xpath = "//h4[contains(text(),'Partnership Engagement')]") 
WebElement partnershipengagment;
@FindBy(xpath = "//h3[contains(text(),'Marketing Calendar')]") 
WebElement marketingcalendarh3;
@FindBy(xpath = "//div[contains(@class,'material-card-image')]") 
WebElement materialcardimage;
@FindBy(xpath = "//div[contains(text(),'Program Details')]") 
WebElement programdetails;
@FindBy(xpath = "//h3") 
WebElement h3;
@FindBy(xpath = "//div[contains(@class,'material-card-image')]/div/following-sibling::div/div") 
WebElement materialcardimagetext;

boolean imageispresent=false;

public void openAPIsandResources2() throws InterruptedException {
	 alcDriver.get("https://staging-impact.plasticbank.com/unitedbyblue");
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		try {
			alcDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 
			expired.isDisplayed();
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
			alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");
			AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
			loginAlchmey.alc_adminlogin("+17783844311","778778");
			clientdashboardtab.click();
			waitforloader();
			dashboardname.clear();
			dashboardname.sendKeys("united");
			waitforloader();
			firstres.click();
			waitforloader();
			addnewadmin.click();
			searchnewadmin.sendKeys("ashish");
			searchicon.click();
			ashishsir.click();
			confirm.click();
			update.click();
			Thread.sleep(4000);
			alcDriver.get("https://staging-impact.plasticbank.com/unitedbyblue");
			ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
			ihpw.sendKeys("123456a");
			ihlogin.click();
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		}catch(Exception e) {
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		}
		Actions action = new Actions(alcDriver);
		action.moveToElement(sidenavitems.get(0)).build().perform();
		
		Thread.sleep(3000);
		apisresources.click();
		resourceImage.isDisplayed();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) alcDriver;
	    //Scroll down till the bottom of the page
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

@SuppressWarnings("deprecation")
public void waitforloader() {
	boolean ispresent= true;
	alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	while(ispresent) {
		try {
			loader.isDisplayed();
		}catch(Exception e) {
			ispresent=false;
		}
	}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
}

@SuppressWarnings("deprecation")
public void verifyCertsAndImages() throws InterruptedException {
	alcDriver.get("https://staging-impact.plasticbank.com/unitedbyblue");
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	Actions action = new Actions(alcDriver);
	action.moveToElement(sidenavitems.get(0)).build().perform();
	
	Thread.sleep(3000);
	apisresources.click();
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
	certificates.isDisplayed();
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		System.out.println("certificates not visible");
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	/*
	 * int count=backgroundimages.size(); assertTrue(count==4); Thread.sleep(10000);
	 */
	takescreenshotof(impactapitext,"User can't see certificates and four images under it.");
}

@SuppressWarnings("deprecation")
public void preconditions() throws InterruptedException {
	clientdashboardtab.click();
	waitforloader();
	dashboardname.clear();
	dashboardname.sendKeys("united");
	waitforloader();
	firstres.click();
	waitforloader();
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		disabledembeddablemaptoggle.isDisplayed();
		Thread.sleep(2000);
		sharingtoolscheckbox.click();
		Thread.sleep(2000);
		uncheckedembeddablemaptoggle.click();
		Thread.sleep(2000);
		uncheckedimpactapitoggle.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
	}
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		checkedembeddablemaptoggle.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		uncheckedembeddablemaptoggle.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
	}
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		checkedimpactapitoggle.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		uncheckedimpactapitoggle.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
	}
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		privcldb.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		privcldbcheckbox.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(10000);
	}
	
	
}
@SuppressWarnings("deprecation")
public void next() throws InterruptedException {
	alcDriver.get("https://staging-impact.plasticbank.com/unitedbyblue");
		
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		
	
	Actions action = new Actions(alcDriver);
	action.moveToElement(sidenavitems.get(0)).build().perform();
	
	Thread.sleep(3000);
	apisresources.click();
	action.moveToElement(impactapitext).build().perform();
	Thread.sleep(3000);
	locationsapi.click();
	Thread.sleep(10000);
	embedcodebutton.click();
	for(WebElement e: copybuttons) {
		e.click();
	}
	takescreenshotof(copybuttons.get(0),"Copy buttons are clickable.");
}

@SuppressWarnings("deprecation")
public void uploadResource() throws InterruptedException, AWTException {
	clientdashboardtab.click();
	waitforloader();
	dashboardname.clear();
	dashboardname.sendKeys("united");
	waitforloader();
	firstres.click();
	waitforloader();
	
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		clearbuttons.get(0).isDisplayed();
		for(WebElement e : clearbuttons) {
			e.click();
		}
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		resourcescheckbox.click();
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		resourcescheckbox.click();
	}
	
	
	addresources.click();
	resourcename.sendKeys("fleek-resource-"+RandomStringUtils.randomAlphabetic(5));
	resourcetype.click();
	resourcetypefileoption.click();
	resourcefileupload.click();
	
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection ss = new StringSelection("C:\\Users\\Fleek\\Downloads\\PlasticBank\\com.plasticbank.actual\\uploadimage.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	rb.delay(2000);
	 thumbnail.click();
	 Robot rb1 = new Robot();
		rb1.delay(2000);
		
		StringSelection ss1 = new StringSelection("C:\\Users\\Fleek\\Downloads\\PlasticBank\\com.plasticbank.actual\\uploadimage.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		
		rb1.delay(2000);
	crop.click();
	update.click();
	Thread.sleep(2000);
}
public void uploadResource2() throws InterruptedException, AWTException {
	clientdashboardtab.click();
	waitforloader();
	dashboardname.clear();
	dashboardname.sendKeys("united");
	waitforloader();
	firstres.click();
	waitforloader();
	
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		clearbuttons.get(0).isDisplayed();
		for(WebElement e : clearbuttons) {
			e.click();
		}
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		resourcescheckbox.click();
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		resourcescheckbox.click();
	}
	
	
	addresources.click();
	resourcename.sendKeys("fleek-resource-"+RandomStringUtils.randomAlphabetic(5));
	resourcetype.click();
	resourcetypefileoption.click();
	//resourcefileupload2.sendKeys("C:\\Users\\Fleek\\Downloads\\PlasticBank\\com.plasticbank.actual\\uploadimage.png");
	resourcefileupload2.sendKeys("uploadimage.png");
	
	
	// thumbnail2.sendKeys("C:\\Users\\Fleek\\Downloads\\PlasticBank\\com.plasticbank.actual\\uploadimage.png");
	 thumbnail2.sendKeys("uploadimage.png");
	 
	crop.click();
	update.click();
	Thread.sleep(2000);
}

@SuppressWarnings("deprecation")
public void openAPIsAndResources() throws InterruptedException {
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
	ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
	ihpw.sendKeys("123456a");
	ihlogin.click();
	try {
		alcDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 
		expired.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		alcDriver.get("https://qa-admin.cognitionfoundry.io/#/login");
		clientdashboardtab.click();
		waitforloader();
		dashboardname.clear();
		dashboardname.sendKeys("united");
		waitforloader();
		firstres.click();
		waitforloader();
		addnewadmin.click();
		searchnewadmin.sendKeys("ashish");
		searchicon.click();
		ashishsir.click();
		confirm.click();
		update.click();
		Thread.sleep(4000);
		alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	Actions action = new Actions(alcDriver);
	action.moveToElement(sidenavitems.get(0)).build().perform();
	
	Thread.sleep(3000);
	apisresources.click();
	resourceImage.isDisplayed();
	Thread.sleep(10000);
	JavascriptExecutor js = (JavascriptExecutor) alcDriver;
    //Scroll down till the bottom of the page
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
}

public void verifyDownload() throws InterruptedException {
	
	resourceImage.click();
	Thread.sleep(10000);

    Assert.assertEquals(
            ((JavascriptExecutor) alcDriver).executeScript("lambda-file-exists=uploadimage.png"),
            true); 
}


@SuppressWarnings("deprecation")
public void verifyesghomeischecked() throws InterruptedException {
	alcDriver.get("https://staging-admin.plasticbank.com/unitedbyblue/");
	try {
		alcDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		impacthubemailaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		impacthubpassword.sendKeys("123456a");
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
	imagesmemstories.get(0).isDisplayed();
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		alcDriver.get("https://staging-admin.plasticbank.com/#/login");
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		clientdashboardtab.click();
		waitforloader();
		dashboardname.clear();
		dashboardname.sendKeys("united");
		waitforloader();
		firstres.click();
		waitforloader();
		try {
			alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			esghomecheckboxdisabled.isDisplayed();
			esgcheckbox.click();
			esghomecheckbox.click();
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		}catch(Exception e12) {
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
			esgcheckbox.click();
			esgcheckbox.click();
			esghomecheckbox.click();
		}
		
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
	}
	
	
}

@SuppressWarnings("deprecation")
public void downloadMemberStoriesAsset() throws InterruptedException {
	alcDriver.get("https://staging-impact.plasticbank.com/unitedbyblue");
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		impacthubemailaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		impacthubpassword.sendKeys("123456a");
		ihlogin.click();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	
	int count=imagesmemstories.size();
	assertTrue(count>=4);
	Thread.sleep(2000);
	Actions action = new Actions(alcDriver);
	action.moveToElement(imagesmemstories.get(0)).build().perform();
	Thread.sleep(1000);
	view.click();
	
	download.click();

	Thread.sleep(600000);
    Assert.assertEquals(
            ((JavascriptExecutor) alcDriver).executeScript("lambda-file-exists=brandfolder.zip"),
            true); 
   
    
}

@SuppressWarnings("deprecation")
public void verifyDashBoardisPrivate() throws InterruptedException {
	clientdashboardtab.click();
	waitforloader();
	dashboardname.clear();
	dashboardname.sendKeys("united");
	waitforloader();
	firstres.click();
	waitforloader();
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		privcldb.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		privcldbcheckbox.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
	}
}

@SuppressWarnings("deprecation")
public void goToUserAccess() {
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		alp.enterDetails("+919560071590", "123456a");
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	useraccess.click();
}

@SuppressWarnings("deprecation")
public void verifyInvitedUserCanBeRemoved() {
	invitenewusers.sendKeys("fleek@mail.com");
	sendInvites.click();
	wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(invite)));
	remove.click();
	remove_button.click();
	wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(sort_icon)));
	try {
		alcDriver.manage().timeouts().implicitlyWait(2	, TimeUnit.SECONDS); 
		invite.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		System.out.println("invitation to user is successfully removed.");
	}
}

@SuppressWarnings("deprecation")
public void acceptInvite() throws AWTException, InterruptedException {
	
	//open new window and switch to it.
	
    alcDriver.get("https://internxt.com/temporary-email");
    Thread.sleep(4000);
   
	copymail.click();
	
	
	//switch to impact window.
	alcDriver.switchTo().newWindow(WindowType.TAB);
	ArrayList<String> tabs = new ArrayList<String>(alcDriver.getWindowHandles());
	alcDriver.switchTo().window(tabs.get(1));
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	try {
		alcDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		alp.enterDetails("+919560071590", "123456a");
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}
	useraccess.click();
	invitenewusers.click();
	invitenewusers.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	sendInvites.click();
	Thread.sleep(3000);
	wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(remove)));
	String lm=latestmail.getText();
	String lme=lm.replace(" ", "").replace(" ", "");
	System.out.println("----"+lme+"----");
	//switch to 10 minutemail
	alcDriver.switchTo().window(tabs.get(0));
	Thread.sleep(2000);
	refresh.click();
	Thread.sleep(4000);
	refresh.click();
	noreply.click();
	Actions action1 = new Actions(alcDriver);
	action1.scrollToElement(registertodashboard);
	Point p = registertodashboard.getLocation();
	Actions action = new Actions(alcDriver);
	System.out.println("x="+p.getX()+"  y="+p.getY());
	action.moveByOffset(p.getX(), p.getY()).click().build().perform();
	//switch to third window and fill form
	ArrayList<String> tab = new ArrayList<String>(alcDriver.getWindowHandles());
	alcDriver.switchTo().window(tab.get(2));
	countrycode.click();
	option.click();
	phone.clear();
	phone.sendKeys(randomPhoneNumber+"2");
	password.clear();
	password.sendKeys("123456a");
	passwordre.sendKeys("123456a");
	register.click();
	ok.click();
	wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
	AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
	alp.enterDetails(lme, "123456a");
	wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
}

public void ih5159() throws InterruptedException {
	
	clientdashboardtab.click();
	waitforloader();
	dashboardname.clear();
	dashboardname.sendKeys("united");
	waitforloader();
	firstres.click();
	waitforloader();
	try {
		alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); 
		privcldb.isDisplayed();
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	}catch(Exception e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		privcldbcheckbox.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(5000);
	}
	 alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		Actions action = new Actions(alcDriver);
		action.moveToElement(sidenavitems.get(0)).build().perform();
		
		Thread.sleep(3000);
		feedback.click();
		choose.click();
		dashboard.click();
		textarea.sendKeys("my feedback");
		sendfeedback.click();
		thanks.isDisplayed();
}

public void ih5160() throws InterruptedException {
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
	ihpw.sendKeys("123456a");
	ihlogin.click();
	Actions action = new Actions(alcDriver);
		action.moveToElement(sidenavitems.get(0)).build().perform();
		Thread.sleep(3000);
		campaigncreator.click();
		Thread.sleep(3000);
		action.moveToElement(campaigncreatorcards.get(0)).build().perform();
		Thread.sleep(1000);
		view.click();
		
		download.click();

		Thread.sleep(20000);
	    Assert.assertEquals(
	            ((JavascriptExecutor) alcDriver).executeScript("lambda-file-exists=brandfolder.zip"),
	            true); 
	    closebtnwrapper.click();
}


public void ih5161() throws InterruptedException {
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
	ihpw.sendKeys("123456a");
	ihlogin.click();
	Thread.sleep(3000);
	Actions action = new Actions(alcDriver);
	    action.moveToElement(sidenavitems.get(0)).build().perform();
	    Thread.sleep(3000);
	    esgmarketplace.click();
	    Thread.sleep(3000);
	    materialcredits.isDisplayed();
	    socialbenefits.isDisplayed();
	    partnershipengagment.isDisplayed();
	    
}
public void ih5491() throws InterruptedException {
	alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
	ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
	ihpw.sendKeys("123456a");
	ihlogin.click();
	Thread.sleep(3000);
	Actions action = new Actions(alcDriver);
	    action.moveToElement(sidenavitems.get(0)).build().perform();
	    Thread.sleep(3000);
	    marketingcalendar.click();
	    marketingcalendarh3.isDisplayed();
	    
}
 public void ih5492() throws InterruptedException {
	 alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		Thread.sleep(3000);
		Actions action = new Actions(alcDriver);
	    action.moveToElement(sidenavitems.get(0)).build().perform();
	    Thread.sleep(3000);
	    esgmarketplace.click();
	    Thread.sleep(3000);
	    action.moveToElement(materialcardimage).build().perform();
	    Thread.sleep(3000);
	   String text1= materialcardimagetext.getText().replaceAll(" ", "");
	   Thread.sleep(1000);
	   programdetails.click();
	   Thread.sleep(3000);
	   String text2=h3.getText().replaceAll(" ", "");
	   assertEquals(text1, text2);
 }
 
 public void ih5493() throws InterruptedException {
	 alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
		ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
		ihpw.sendKeys("123456a");
		ihlogin.click();
		Thread.sleep(3000);
		Actions action = new Actions(alcDriver);
	   action.moveToElement(sidenavitems.get(0)).build().perform();
	   Thread.sleep(3000);
	   home.click();
	   partnertimeline.isDisplayed();
	   Thread.sleep(3000);
	   logout.click();
	   alcDriver.get("https://qa-admin.cognitionfoundry.io//#/login");
	   AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		clientdashboardtab.click();
		waitforloader();
		dashboardname.clear();
		dashboardname.sendKeys("united");
		waitforloader();
		firstres.click();
		waitforloader();
		homecheckbox.click();
		update.click();
		Thread.sleep(4000);
		 alcDriver.get("https://qa-impact.cognitionfoundry.io/unitedbyblue");
			ihaddress.sendKeys("ashish.rawat@fleekitsolutions.com");
			ihpw.sendKeys("123456a");
			ihlogin.click();
			try {
				partnertimeline.isDisplayed();
			}catch(Exception e) {
				System.out.println("partner timeline not visible");
			}
}
	
	
}
