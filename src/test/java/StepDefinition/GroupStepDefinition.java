package StepDefinition;

import java.io.IOException;

import com.tnbc.qa.base.TestBase;
import com.tnbc.qa.pages.GroupPage;
import com.tnbc.qa.pages.HomePage;
import com.tnbc.qa.pages.LoginPage;
import com.tnbc.qa.util.Windowhandle;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GroupStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	GroupPage groupPage;
	Windowhandle win;

	@Given("user goes to administration and clicks on Group menu and add menu")
	public void user_goes_to_administration_and_clicks_on_profile_menu_and_add_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		groupPage = homePage.createGroup();
	}

	@Then("user enters {string} {string} {string} and checkbox on Admin and Non-Inquiry Users options and clicks on Ok button")
	public void user_enters_and_checkbox_on_Admin_and_Non_Inquiry_Users_options_and_clicks_on_Ok_button(String name,
			String sort, String details) throws InterruptedException, IOException {
		groupPage.addGroup(name, sort, details);
	}

	@Then("user goes to Approve screen and approve the record")
	public void user_goes_to_Approve_screen_and_approve_the_record() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		groupPage = homePage.approveGroup();
		groupPage.approveRecord();

	}

	// --------Modify Methods----------//

	@Then("user goes to administration and clicks on Group menu and modify menu and enters {string}")
	public void user_goes_to_administration_and_clicks_on_profile_menu_and_modify_menu_and_enters(String name)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		groupPage = homePage.modifyGroup(name);

	}

	@Then("user modifies {string} {string} and {string}")
	public void user_modifies_and(String name, String sortPriority, String details) throws InterruptedException {
		groupPage.modifyGroupRecord(name, sortPriority, details);
	}

	// -------Remove Methods---------//
	@Then("user goes to administration and clicks on Group menu and remove menu and enters {string}")
	public void user_goes_to_administration_and_clicks_on_profile_menu_and_remove_menu_and_enters(String name)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		groupPage = homePage.removeGroup(name);
	}

	@Then("user removes the group profile")
	public void user_removes_the_group_profile() throws InterruptedException, IOException {
		groupPage.removeGroupRecord();
	}

	@After
	public void quitBrowser() {
		driver.quit();
	}
}

