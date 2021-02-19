#Author: Suvarna
Feature: DBload feature

  @TC_03_01_DBLoadfunctionality
  Scenario Outline: To upload Participant banks through DBLoad
    Then User goes to Maintenance DB and open DB Loads menu to upload Participant Banks
    Then User uploads IFSC list using "<Loadtype>","<ForceUpdate>" and "<FileName>"
    Then User view Participant Bank list

    Examples: 
      | Loadtype             | ForceUpdate | FileName                                                         |
      | PARTICIPANT_BANKCODE | Y           | E:\\Palestine\\TNBC\\STATIC-DATA-DIR\\Participant List_local.csv |
