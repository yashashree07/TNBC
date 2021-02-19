package com.tnbc.qa.pages;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tnbc.qa.base.TestBase;
import com.tnbc.qa.constants.IntfConstants;
import com.tnbc.qa.util.Windowhandle;

public class EnvironmentPage extends TestBase {
	
	Windowhandle win = new Windowhandle(driver);
	
	@FindBy(id = "palestine,palestine/the_national_bank,palestine/the_national_bank/gps:sodExecutor")
	WebElement sodcheckbox;

	@FindBy(id = "TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:sodExecutorc2")
	WebElement sodStatus;

	@FindBy(id = "TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:eodExecutorc2")
	WebElement eodStatus;

	@FindBy(id = "modalDialogContinue")
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"preconditionEnforceAdvice\"]/table/tbody/tr/td[2]/input")
	WebElement manageBtn;

	@FindBy(name = "env.run.continue")
	WebElement returnButton;

	@FindBy(id = "palestine,palestine/the_national_bank,palestine/the_national_bank/gps:eodExecutor")
	WebElement eodcheckbox;

	@FindBy(id = "palestine,palestine/the_national_bank,palestine/the_national_bank/gps")
	WebElement bdcheckbox;

	@FindBy(id = "SET_BUSINESS_DATE_ACTION")
	WebElement setBusinessDateButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	WebElement bdSubmitbutton;

	@FindBy(id = "SWITCH_RESOURCE_ACTION")
	WebElement switchResourceButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement environmentokbutton;

	@FindBy(xpath = "//*[@id='adviceId' and @class='visible']")
	WebElement buttonVisibility;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:envEventServerc2")
	WebElement envEventServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps:envEventServer")
	WebElement envEventServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:emailServerc2")
	WebElement emailServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps:emailServer")
	WebElement emailServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:AutoSODServerc2")
	WebElement AutoSODServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps:AutoSODServer")
	WebElement AutoSODServercheckbox;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps:AutoEODServer")
	WebElement AutoEODServerstatus;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps:AutoEODServerc2")
	WebElement AutoEODServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Vip_Cheque_Acceptance_Serverc2")
	WebElement Vip_Cheque_Acceptance_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Vip_Cheque_Acceptance_Server")
	WebElement Vip_Cheque_Acceptance_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:BatchChequePaymentCreationServerc2")
	WebElement BatchChequePaymentCreationServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:BatchChequePaymentCreationServer")
	WebElement BatchChequePaymentCreationServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Batch_Modification_Serverc2")
	WebElement Batch_Modification_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Batch_Modification_Server")
	WebElement Batch_Modification_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Outward_Payment_Creation_Serverc2")
	WebElement Cheque_Outward_Payment_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Outward_Payment_Creation_Server")
	WebElement Cheque_Outward_Payment_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Return_Creation_Serverc2")
	WebElement Return_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Return_Creation_Server")
	WebElement Return_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Clearing_File_Input_Serverc2")
	WebElement ACH_Clearing_File_Input_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Clearing_File_Input_Server")
	WebElement ACH_Clearing_File_Input_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Clearing_Inward_Payment_Creation_Serverc2")
	WebElement ACH_Clearing_Inward_Payment_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Clearing_Inward_Payment_Creation_Server")
	WebElement ACH_Clearing_Inward_Payment_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Response_Process_Serverc2")
	WebElement ACH_Response_Process_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ACH_Response_Process_Server")
	WebElement ACH_Response_Process_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:File_Routing_Serverc2")
	WebElement File_Routing_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:File_Routing_Server")
	WebElement File_Routing_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:AchClearingMQOutputServerc2")
	WebElement AchClearingMQOutputServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:AchClearingMQOutputServer")
	WebElement AchClearingMQOutputServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:AchClearingMQInputServerc2")
	WebElement AchClearingMQInputServerstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:AchClearingMQInputServer")
	WebElement AchClearingMQInputServercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ATM_Processing_ChequeData_Serverc2")
	WebElement ATM_Processing_ChequeData_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:ATM_Processing_ChequeData_Server")
	WebElement ATM_Processing_ChequeData_Servercheckbox;

	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Leaf_Creation_Serverc2")
	WebElement Cheque_Leaf_Creation_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Leaf_Creation_Server")
	WebElement Cheque_Leaf_Creation_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Inventory_File_Download_Serverc2")
	WebElement Cheque_Inventory_File_Download_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Inventory_File_Download_Server")
	WebElement Cheque_Inventory_File_Download_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Data_Migration_Serverc2")
	WebElement PDC_Data_Migration_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Data_Migration_Server")
	WebElement PDC_Data_Migration_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_FileBean_ChequeData_Serverc2")
	WebElement PDC_FileBean_ChequeData_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_FileBean_ChequeData_Server")
	WebElement PDC_FileBean_ChequeData_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Migration_Image_Tagging_Serverc2")
	WebElement Cheque_Migration_Image_Tagging_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Cheque_Migration_Image_Tagging_Server")
	WebElement Cheque_Migration_Image_Tagging_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Account_Verification_Serverc2")
	WebElement Account_Verification_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Account_Verification_Server")
	WebElement Account_Verification_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Out_Present_Cheque_Serverc2")
	WebElement Out_Present_Cheque_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Out_Present_Cheque_Server")
	WebElement Out_Present_Cheque_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Out_Reply_Cheque_Serverc2")
	WebElement Out_Reply_Cheque_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Out_Reply_Cheque_Server")
	WebElement Out_Reply_Cheque_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Add_PDC_Serverc2")
	WebElement Add_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Add_PDC_Server")
	WebElement Add_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Delete_PDC_Serverc2")
	WebElement Delete_PDC_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Delete_PDC_Server")
	WebElement Delete_PDC_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Amendment_Serverc2")
	WebElement PDC_Amendment_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Amendment_Server")
	WebElement PDC_Amendment_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Replacement_Serverc2")
	WebElement PDC_Replacement_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Replacement_Server")
	WebElement PDC_Replacement_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Contra_Posting_Serverc2")
	WebElement PDC_Contra_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:PDC_Contra_Posting_Server")
	WebElement PDC_Contra_Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Posting_Serverc2")
	WebElement Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Posting_Server")
	WebElement Posting_Servercheckbox;
	
	@FindBy(id="TRpalestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Contra_Posting_Serverc2")
	WebElement Contra_Posting_Serverstatus;
	
	@FindBy(id="palestine,palestine/the_national_bank,palestine/the_national_bank/gps,palestine/the_national_bank/gps:Contra_Posting_Server")
	WebElement Contra_Posting_Servercheckbox;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public EnvironmentPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonEnvironmentokbutton() throws InterruptedException {
//		win.handlewin();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentokbutton.click();
	}

	public void businessDate() throws InterruptedException {
		String Status = sodStatus.getText();
		String StatusEod = eodStatus.getText();
		if (Status.equals("Not Performed") && StatusEod.equals("Not Performed")) {
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		} else if (Status.equals("Performed") && StatusEod.equals("Not Performed")) {
			System.out.println("SOD is already performed");
		} else if (Status.equals("Performed") && StatusEod.equals("Performed")) {
			System.out.println("SOD is already performed");
			System.out.println("EOD is already performed");
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		}

	}

	public void returnBtnStatus() throws InterruptedException {
		boolean waitForReturnBtn = true;
		while (waitForReturnBtn) {
			if (null != buttonVisibility) {
				returnButton.click();
				waitForReturnBtn = false;
			} else {
				System.out.println(new Date() + " start time");
				Thread.sleep(IntfConstants.TIMEOUT);
				System.out.println(new Date() + " start time");
			}
		}
	}

	public void performSOD() throws InterruptedException {
		sodcheckbox.click();
		switchResourceButton.click();
		continuebutton.click();
		returnBtnStatus();
	}

	public void checkenvEventServer() throws InterruptedException {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Inactive")) {
			envEventServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkenvEventServer1();
		} else {
			System.out.println("envEventServer is already running");
		}
	}

	public void checkenvEventServer1() {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Active")) {
			System.out.println("envEventServer is started");
		} else {
			System.out.println("envEventServer is failed to start");
		}
	}

	public void checkemailServer() throws InterruptedException {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Inactive")) {
			emailServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkemailServer1();
		} else {
			System.out.println("emailServer is already running");
		}
	}

	public void checkemailServer1() {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Active")) {
			System.out.println("emailServer is started");
		} else {
			System.out.println("emailServer is failed to start");
		}
	}

	public void checkAutoSODServer() throws InterruptedException {
		String statusAutoSODServer = AutoSODServerstatus.getText();
		if (statusAutoSODServer.equals("Inactive")) {
			AutoSODServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAutoSODServer1();
		} else {
			System.out.println("AutoSODServer is already running");
		}
	}

	public void checkAutoSODServer1() {
		String statusAutoSODServer = AutoSODServerstatus.getText();
		if (statusAutoSODServer.equals("Active")) {
			System.out.println("AutoSODServer is started");
		} else {
			System.out.println("AutoSODServer is failed to start");
		}
	}
	
	public void checkAutoEODServer() throws InterruptedException {
		String statusAutoEODServer = AutoEODServerstatus.getText();
		if (statusAutoEODServer.equals("Inactive")) {
			AutoEODServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAutoEODServer1();
		} else {
			System.out.println("AutoEODServer is already running");
		}
	}

	public void checkAutoEODServer1() {
		String statusAutoEODServer = AutoEODServerstatus.getText();
		if (statusAutoEODServer.equals("Active")) {
			System.out.println("AutoEODServer is started");
		} else {
			System.out.println("AutoEODServer is failed to start");
		}
	}
	
	public void checkVip_Cheque_Acceptance_Server() throws InterruptedException {
		String statusVip_Cheque_Acceptance_Server = Vip_Cheque_Acceptance_Serverstatus.getText();
		if (statusVip_Cheque_Acceptance_Server.equals("Inactive")) {
			Vip_Cheque_Acceptance_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkVip_Cheque_Acceptance_Server1();
		} else {
			System.out.println("Vip_Cheque_Acceptance_Server is already running");
		}
	}

	public void checkVip_Cheque_Acceptance_Server1() {
		String statusVip_Cheque_Acceptance_Server = Vip_Cheque_Acceptance_Serverstatus.getText();
		if (statusVip_Cheque_Acceptance_Server.equals("Active")) {
			System.out.println("Vip_Cheque_Acceptance_Server is started");
		} else {
			System.out.println("Vip_Cheque_Acceptance_Server is failed to start");
		}
	}

	public void checkBatchChequePaymentCreationServer() throws InterruptedException {
		String statusBatchChequePaymentCreationServer = BatchChequePaymentCreationServerstatus.getText();
		if (statusBatchChequePaymentCreationServer.equals("Inactive")) {
			BatchChequePaymentCreationServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkBatchChequePaymentCreationServer1();
		} else {
			System.out.println("BatchChequePaymentCreationServer is already running");
		}
	}

	public void checkBatchChequePaymentCreationServer1() {
		String statusBatchChequePaymentCreationServer = BatchChequePaymentCreationServerstatus.getText();
		if (statusBatchChequePaymentCreationServer.equals("Active")) {
			System.out.println("BatchChequePaymentCreationServer is started");
		} else {
			System.out.println("BatchChequePaymentCreationServer is failed to start");
		}
	}

	public void checkBatch_Modification_Server() throws InterruptedException {
		String statusBatch_Modification_Server = Batch_Modification_Serverstatus.getText();
		if (statusBatch_Modification_Server.equals("Inactive")) {
			Batch_Modification_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkBatch_Modification_Server1();
		} else {
			System.out.println("Batch_Modification_Server is already running");
		}
	}

	public void checkBatch_Modification_Server1() {
		String statusBatch_Modification_Server = Batch_Modification_Serverstatus.getText();
		if (statusBatch_Modification_Server.equals("Active")) {
			System.out.println("Batch_Modification_Server is started");
		} else {
			System.out.println("Batch_Modification_Server is failed to start");
		}
	}

	public void checkCheque_Outward_Payment_Creation_Server	() throws InterruptedException {
		String statusCheque_Outward_Payment_Creation_Server	= Cheque_Outward_Payment_Creation_Serverstatus.getText();
		if (statusCheque_Outward_Payment_Creation_Server.equals("Inactive")) {
			Cheque_Outward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Outward_Payment_Creation_Server1();
		} else {
			System.out.println("Cheque_Outward_Payment_Creation_Server is already running");
		}
	}

	public void checkCheque_Outward_Payment_Creation_Server1() {
		String statusCheque_Outward_Payment_Creation_Server = Cheque_Outward_Payment_Creation_Serverstatus.getText();
		if (statusCheque_Outward_Payment_Creation_Server.equals("Active")) {
			System.out.println("Cheque_Outward_Payment_Creation_Server is started");
		} else {
			System.out.println("Cheque_Outward_Payment_Creation_Server is failed to start");
		}
	}

	public void checkReturn_Creation_Server() throws InterruptedException {
		String statusReturn_Creation_Server = Return_Creation_Serverstatus.getText();
		if (statusReturn_Creation_Server.equals("Inactive")) {
			Return_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkReturn_Creation_Server1();
		} else {
			System.out.println("Return_Creation_Server is already running");
		}
	}

	public void checkReturn_Creation_Server1() {
		String statusReturn_Creation_Server = Return_Creation_Serverstatus.getText();
		if (statusReturn_Creation_Server.equals("Active")) {
			System.out.println("Return_Creation_Server is started");
		} else {
			System.out.println("Return_Creation_Server is failed to start");
		}
	}

	public void checkACH_Clearing_File_Input_Server() throws InterruptedException {
		String statusACH_Clearing_File_Input_Server = ACH_Clearing_File_Input_Serverstatus.getText();
		if (statusACH_Clearing_File_Input_Server.equals("Inactive")) {
			ACH_Clearing_File_Input_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Clearing_File_Input_Server1();
		} else {
			System.out.println("ACH_Clearing_File_Input_Server is already running");
		}
	}

	public void checkACH_Clearing_File_Input_Server1() {
		String statusACH_Clearing_File_Input_Server = ACH_Clearing_File_Input_Serverstatus.getText();
		if (statusACH_Clearing_File_Input_Server.equals("Active")) {
			System.out.println("ACH_Clearing_File_Input_Server is started");
		} else {
			System.out.println("ACH_Clearing_File_Input_Server is failed to start");
		}
	}

	public void checkACH_Clearing_Inward_Payment_Creation_Server() throws InterruptedException {
		String statusACH_Clearing_Inward_Payment_Creation_Server = ACH_Clearing_Inward_Payment_Creation_Serverstatus.getText();
		if (statusACH_Clearing_Inward_Payment_Creation_Server.equals("Inactive")) {
			ACH_Clearing_Inward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Clearing_Inward_Payment_Creation_Server1();
		} else {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is already running");
		}
	}

	public void checkACH_Clearing_Inward_Payment_Creation_Server1() {
		String statusACH_Clearing_Inward_Payment_Creation_Server = ACH_Clearing_Inward_Payment_Creation_Serverstatus.getText();
		if (statusACH_Clearing_Inward_Payment_Creation_Server.equals("Active")) {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is started");
		} else {
			System.out.println("ACH_Clearing_Inward_Payment_Creation_Server is failed to start");
		}
	}

	public void checkACH_Response_Process_Server() throws InterruptedException {
		String statusACH_Response_Process_Server = ACH_Response_Process_Serverstatus.getText();
		if (statusACH_Response_Process_Server.equals("Inactive")) {
			ACH_Response_Process_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkACH_Response_Process_Server1();
		} else {
			System.out.println("ACH_Response_Process_Server is already running");
		}
	}

	public void checkACH_Response_Process_Server1() {
		String statusACH_Response_Process_Server = ACH_Response_Process_Serverstatus.getText();
		if (statusACH_Response_Process_Server.equals("Active")) {
			System.out.println("ACH_Response_Process_Server is started");
		} else {
			System.out.println("ACH_Response_Process_Server is failed to start");
		}
	}

	public void CheckFile_Routing_Server() throws InterruptedException {
		String statusFile_Routing_Server = File_Routing_Serverstatus.getText();
		if (statusFile_Routing_Server.equals("Inactive")) {
			File_Routing_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFile_Routing_Server1();
		} else {
			System.out.println("File_Routing_Server is already running");
		}
	}

	public void checkFile_Routing_Server1() {
		String statusFile_Routing_Server = File_Routing_Serverstatus.getText();
		if (statusFile_Routing_Server.equals("Active")) {
			System.out.println("File_Routing_Server is started");
		} else {
			System.out.println("File_Routing_Server is failed to start");
		}
	}

	public void checkAchClearingMQOutputServer() throws InterruptedException {
		String statusAchClearingMQOutputServer = AchClearingMQOutputServerstatus.getText();
		if (statusAchClearingMQOutputServer.equals("Inactive")) {
			AchClearingMQOutputServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchClearingMQOutputServer1();
		} else {
			System.out.println("AchClearingMQOutputServer is already running");
		}
	}

	public void checkAchClearingMQOutputServer1() {
		String statusAchClearingMQOutputServer = AchClearingMQOutputServerstatus.getText();
		if (statusAchClearingMQOutputServer.equals("Active")) {
			System.out.println("AchClearingMQOutputServer is started");
		} else {
			System.out.println("AchClearingMQOutputServer is failed to start");
		}
	}

	public void checkAchClearingMQInputServer() throws InterruptedException {
		String statusAchClearingMQInputServer = AchClearingMQInputServerstatus.getText();
		if (statusAchClearingMQInputServer.equals("Inactive")) {
			AchClearingMQInputServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchClearingMQInputServer1();
		} else {
			System.out.println("AchClearingMQInputServer is already running");
		}
	}

	public void checkAchClearingMQInputServer1() {
		String statusAchClearingMQInputServer = AchClearingMQInputServerstatus.getText();
		if (statusAchClearingMQInputServer.equals("Active")) {
			System.out.println("AchClearingMQInputServer is started");
		} else {
			System.out.println("AchClearingMQInputServer is failed to start");
		}
	}

	public void checkATM_Processing_ChequeData_Server() throws InterruptedException {
		String statusATM_Processing_ChequeData_Server = ATM_Processing_ChequeData_Serverstatus.getText();
		if (statusATM_Processing_ChequeData_Server.equals("Inactive")) {
			ATM_Processing_ChequeData_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkATM_Processing_ChequeData_Server1();
		} else {
			System.out.println("ATM_Processing_ChequeData_Server is already running");
		}
	}

	public void checkATM_Processing_ChequeData_Server1() {
		String statusATM_Processing_ChequeData_Server = ATM_Processing_ChequeData_Serverstatus.getText();
		if (statusATM_Processing_ChequeData_Server.equals("Active")) {
			System.out.println("ATM_Processing_ChequeData_Server is started");
		} else {
			System.out.println("ATM_Processing_ChequeData_Server is failed to start");
		}
	}

	public void checkCheque_Leaf_Creation_Server() throws InterruptedException {
		String statusCheque_Leaf_Creation_Server = Cheque_Leaf_Creation_Serverstatus.getText();
		if (statusCheque_Leaf_Creation_Server.equals("Inactive")) {
			Cheque_Leaf_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Leaf_Creation_Server1();
		} else {
			System.out.println("Cheque_Leaf_Creation_Server is already running");
		}
	}

	public void checkCheque_Leaf_Creation_Server1() {
		String statusCheque_Leaf_Creation_Server = Cheque_Leaf_Creation_Serverstatus.getText();
		if (statusCheque_Leaf_Creation_Server.equals("Active")) {
			System.out.println("Cheque_Leaf_Creation_Server is started");
		} else {
			System.out.println("Cheque_Leaf_Creation_Server is failed to start");
		}
	}

	public void checkCheque_Inventory_File_Download_Server() throws InterruptedException {
		String statusCheque_Inventory_File_Download_Server = Cheque_Inventory_File_Download_Serverstatus.getText();
		if (statusCheque_Inventory_File_Download_Server.equals("Inactive")) {
			Cheque_Inventory_File_Download_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Inventory_File_Download_Server1();
		} else {
			System.out.println("Cheque_Inventory_File_Download_Server is already running");
		}
	}

	public void checkCheque_Inventory_File_Download_Server1() {
		String statusCheque_Inventory_File_Download_Server = Cheque_Inventory_File_Download_Serverstatus.getText();
		if (statusCheque_Inventory_File_Download_Server.equals("Active")) {
			System.out.println("Cheque_Inventory_File_Download_Server is started");
		} else {
			System.out.println("Cheque_Inventory_File_Download_Server is failed to start");
		}
	}

	public void checkPDC_Data_Migration_Server() throws InterruptedException {
		String statusPDC_Data_Migration_Server = PDC_Data_Migration_Serverstatus.getText();
		if (statusPDC_Data_Migration_Server.equals("Inactive")) {
			PDC_Data_Migration_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Data_Migration_Server1();
		} else {
			System.out.println("PDC_Data_Migration_Server is already running");
		}
	}

	public void checkPDC_Data_Migration_Server1() {
		String statusPDC_Data_Migration_Server = PDC_Data_Migration_Serverstatus.getText();
		if (statusPDC_Data_Migration_Server.equals("Active")) {
			System.out.println("PDC_Data_Migration_Server is started");
		} else {
			System.out.println("PDC_Data_Migration_Server is failed to start");
		}
	}

	public void checkPDC_FileBean_ChequeData_Server() throws InterruptedException {
		String statusPDC_FileBean_ChequeData_Server = PDC_FileBean_ChequeData_Serverstatus.getText();
		if (statusPDC_FileBean_ChequeData_Server.equals("Inactive")) {
			PDC_FileBean_ChequeData_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_FileBean_ChequeData_Server1();
		} else {
			System.out.println("PDC_FileBean_ChequeData_Server is already running");
		}
	}

	public void checkPDC_FileBean_ChequeData_Server1() {
		String statusPDC_FileBean_ChequeData_Server = PDC_FileBean_ChequeData_Serverstatus.getText();
		if (statusPDC_FileBean_ChequeData_Server.equals("Active")) {
			System.out.println("PDC_FileBean_ChequeData_Server is started");
		} else {
			System.out.println("PDC_FileBean_ChequeData_Server is failed to start");
		}
	}

	public void checkCheque_Migration_Image_Tagging_Server() throws InterruptedException {
		String statusCheque_Migration_Image_Tagging_Server = Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusCheque_Migration_Image_Tagging_Server.equals("Inactive")) {
			Cheque_Migration_Image_Tagging_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCheque_Migration_Image_Tagging_Server1();
		} else {
			System.out.println("Cheque_Migration_Image_Tagging_Server is already running");
		}
	}

	public void checkCheque_Migration_Image_Tagging_Server1() {
		String statusCheque_Migration_Image_Tagging_Server = Cheque_Migration_Image_Tagging_Serverstatus.getText();
		if (statusCheque_Migration_Image_Tagging_Server.equals("Active")) {
			System.out.println("Cheque_Migration_Image_Tagging_Server is started");
		} else {
			System.out.println("Cheque_Migration_Image_Tagging_Server is failed to start");
		}
	}

	public void checkAccount_Verification_Server() throws InterruptedException {
		String statusAccount_Verification_Server = Account_Verification_Serverstatus.getText();
		if (statusAccount_Verification_Server.equals("Inactive")) {
			Account_Verification_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAccount_Verification_Server1();
		} else {
			System.out.println("Account_Verification_Server is already running");
		}
	}

	public void checkAccount_Verification_Server1() {
		String statusAccount_Verification_Server = Account_Verification_Serverstatus.getText();
		if (statusAccount_Verification_Server.equals("Active")) {
			System.out.println("Account_Verification_Server is started");
		} else {
			System.out.println("Account_Verification_Server is failed to start");
		}
	}

	public void checkOut_Present_Cheque_Server() throws InterruptedException {
		String statusOut_Present_Cheque_Server = Out_Present_Cheque_Serverstatus.getText();
		if (statusOut_Present_Cheque_Server.equals("Inactive")) {
			Out_Present_Cheque_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOut_Present_Cheque_Server1();
		} else {
			System.out.println("Out_Present_Cheque_Server is already running");
		}
	}

	public void checkOut_Present_Cheque_Server1() {
		String statusOut_Present_Cheque_Server = Out_Present_Cheque_Serverstatus.getText();
		if (statusOut_Present_Cheque_Server.equals("Active")) {
			System.out.println("Out_Present_Cheque_Server is started");
		} else {
			System.out.println("Out_Present_Cheque_Server is failed to start");
		}
	}

	public void checkOut_Reply_Cheque_Server() throws InterruptedException {
		String statusOut_Reply_Cheque_Server = Out_Reply_Cheque_Serverstatus.getText();
		if (statusOut_Reply_Cheque_Server.equals("Inactive")) {
			Out_Reply_Cheque_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOut_Reply_Cheque_Server1();
		} else {
			System.out.println("Out_Reply_Cheque_Server is already running");
		}
	}

	public void checkOut_Reply_Cheque_Server1() {
		String statusOut_Reply_Cheque_Server = Out_Reply_Cheque_Serverstatus.getText();
		if (statusOut_Reply_Cheque_Server.equals("Active")) {
			System.out.println("Out_Reply_Cheque_Server is started");
		} else {
			System.out.println("Out_Reply_Cheque_Server is failed to start");
		}
	}

	public void checkAdd_PDC_Server() throws InterruptedException {
		String statusAdd_PDC_Server = Add_PDC_Serverstatus.getText();
		if (statusAdd_PDC_Server.equals("Inactive")) {
			Add_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAdd_PDC_Server1();
		} else {
			System.out.println("Add_PDC_Server is already running");
		}
	}

	public void checkAdd_PDC_Server1() {
		String statusAdd_PDC_Server = Add_PDC_Serverstatus.getText();
		if (statusAdd_PDC_Server.equals("Active")) {
			System.out.println("Add_PDC_Server is started");
		} else {
			System.out.println("Add_PDC_Server is failed to start");
		}
	}

	public void checkDelete_PDC_Server() throws InterruptedException {
		String statusDelete_PDC_Server = Delete_PDC_Serverstatus.getText();
		if (statusDelete_PDC_Server.equals("Inactive")) {
			Delete_PDC_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDelete_PDC_Server1();
		} else {
			System.out.println("Delete_PDC_Server is already running");
		}
	}

	public void checkDelete_PDC_Server1() {
		String statusDelete_PDC_Server = Delete_PDC_Serverstatus.getText();
		if (statusDelete_PDC_Server.equals("Active")) {
			System.out.println("Delete_PDC_Server is started");
		} else {
			System.out.println("Delete_PDC_Server is failed to start");
		}
	}

	public void checkPDC_Amendment_Server() throws InterruptedException {
		String statusPDC_Amendment_Server = PDC_Amendment_Serverstatus.getText();
		if (statusPDC_Amendment_Server.equals("Inactive")) {
			PDC_Amendment_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Amendment_Server1();
		} else {
			System.out.println("PDC_Amendment_Server is already running");
		}
	}

	public void checkPDC_Amendment_Server1() {
		String statusPDC_Amendment_Server = PDC_Amendment_Serverstatus.getText();
		if (statusPDC_Amendment_Server.equals("Active")) {
			System.out.println("PDC_Amendment_Server is started");
		} else {
			System.out.println("PDC_Amendment_Server is failed to start");
		}
	}

	public void checkPDC_Replacement_Server() throws InterruptedException {
		String statusPDC_Replacement_Server = PDC_Replacement_Serverstatus.getText();
		if (statusPDC_Replacement_Server.equals("Inactive")) {
			PDC_Replacement_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Replacement_Server1();
		} else {
			System.out.println("PDC_Replacement_Server is already running");
		}
	}

	public void checkPDC_Replacement_Server1() {
		String statusPDC_Replacement_Server = PDC_Replacement_Serverstatus.getText();
		if (statusPDC_Replacement_Server.equals("Active")) {
			System.out.println("PDC_Replacement_Server is started");
		} else {
			System.out.println("PDC_Replacement_Server is failed to start");
		}
	}

	public void checkPDC_Contra_Posting_Server() throws InterruptedException {
		String statusPDC_Contra_Posting_Server = PDC_Contra_Posting_Serverstatus.getText();
		if (statusPDC_Contra_Posting_Server.equals("Inactive")) {
			PDC_Contra_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPDC_Contra_Posting_Server1();
		} else {
			System.out.println("PDC_Contra_Posting_Server is already running");
		}
	}

	public void checkPDC_Contra_Posting_Server1() {
		String statusPDC_Contra_Posting_Server = PDC_Contra_Posting_Serverstatus.getText();
		if (statusPDC_Contra_Posting_Server.equals("Active")) {
			System.out.println("PDC_Contra_Posting_Server is started");
		} else {
			System.out.println("PDC_Contra_Posting_Server is failed to start");
		}
	}

	public void checkPosting_Server() throws InterruptedException {
		String statusPosting_Server = Posting_Serverstatus.getText();
		if (statusPosting_Server.equals("Inactive")) {
			Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPosting_Server1();
		} else {
			System.out.println("Posting_Server is already running");
		}
	}

	public void checkPosting_Server1() {
		String statusPosting_Server = Posting_Serverstatus.getText();
		if (statusPosting_Server.equals("Active")) {
			System.out.println("Posting_Server is started");
		} else {
			System.out.println("Posting_Server is failed to start");
		}
	}

	public void checkContra_Posting_Server() throws InterruptedException {
		String statusContra_Posting_Server = Contra_Posting_Serverstatus.getText();
		if (statusContra_Posting_Server.equals("Inactive")) {
			Contra_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkContra_Posting_Server1();
		} else {
			System.out.println("Contra_Posting_Server is already running");
		}
	}

	public void checkContra_Posting_Server1() {
		String statusContra_Posting_Server = Contra_Posting_Serverstatus.getText();
		if (statusContra_Posting_Server.equals("Active")) {
			System.out.println("Contra_Posting_Server is started");
		} else {
			System.out.println("Contra_Posting_Server is failed to start");
		}
	}

	public void disableCheque_Outward_Payment_Creation_Server() throws InterruptedException {
		Cheque_Outward_Payment_Creation_Servercheckbox.click();
		switchResourceButton.click();
		returnBtnStatus();
		System.out.println("Cheque_Outward_Payment_Creation_Server stopped");
	}
	
	//-------  method for Cheque_Outward_Payment_Creation_Server inactive-----//
	
		public void switchInactiveCheque_Outward_Payment() throws InterruptedException {
			Cheque_Outward_Payment_Creation_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			
		}
	
	public void LogOut() {
		logOutBtn.click();
		logoutBtn.click();
	}
}
