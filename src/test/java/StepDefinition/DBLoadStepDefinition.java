package StepDefinition;

import org.junit.Assert;

import com.tnbc.qa.base.TestBase;
import com.tnbc.qa.constants.IntfConstants;
import com.tnbc.qa.pages.DBLoadPage;
import com.tnbc.qa.pages.HomePage;
import com.tnbc.qa.pages.LoginPage;
import com.tnbc.qa.pages.ParticipantBankPage;
import com.tnbc.qa.util.Windowhandle;
import io.cucumber.java.en.Then;

public class DBLoadStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	DBLoadPage dbLoadPage;
	ParticipantBankPage	participantBankPage;
	Windowhandle win;

	@Then("User goes to Maintenance DB and open DB Loads menu to upload Participant Banks")
	public void user_goes_to_Maintenance_DB_and_open_DB_Loads_menu_to_upload_Participant_Banks() throws InterruptedException {
		driver.switchTo().frame("toc");
		dbLoadPage=homePage.clickonDBDBLoadsLink();	
	}
	
	@Then("User uploads IFSC list using {string},{string} and {string}")
	public void user_uploads_IFSC_list_using_and(String Loadtype, String ForceUpdate, String FileName) throws InterruptedException {
		dbLoadPage=dbLoadPage.addParticipantBank(Loadtype, ForceUpdate, FileName);
	}
	
	@Then("User view Participant Bank list")
	public void user_view_Participant_Bank_list() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Enhanced Global Payment System", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		participantBankPage=homePage.clickonDBParticipantBankListLink();
		participantBankPage=participantBankPage.listParticipantBank();
	}
}
