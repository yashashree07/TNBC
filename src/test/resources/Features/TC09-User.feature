#Author: Pranjal
@RegressionUserMenu
Feature: To Test Create User Functionality

  @TC_09_01_AddUserScenario
  Scenario Outline: Create User
    Given user goes to administration and users and click on Add menu
    And user enters "<UserName>" and "<FullName>" and selects "<Profile>" ,"<AuthMatrix>" and enters "<Password>"  "<Verify Password>" and clicks on Ok button
    Then user goes to Approve screen and approves the record

    Examples: 
      | UserName | FullName    | Profile | AuthMatrix | Password | Verify Password |
      | Maker11   | Test User11  | Admin   |            | secure   | secure          |
      | Checker13 | Test User14 | Admin   |            | secure   | secure          |
     # | Maker2   | Test  User3 | Admin   |            | secure   | secure          |
      #| Checker2 | Test User4  | Admin   |            | secure   | secure          |
      #| Maker3   | Test  User5 | Admin   |            | secure   | secure          |
      #| Checker3 | Test User6  | Admin   |            | secure   | secure          |
      #| Checker6 | Test User9  | Admin   |            | secure   | secure          |

  @TC_09_02_ValidateUserScenario
  Scenario: Validate UserPage Fields
    Given user goes to administration and users and click on Add menu
    Then user clicks on ok button for validation message

  @TC_09_03_ModifyUserScenario
  Scenario Outline: Modify User
    Then user goes to administration and users and click on Modify menu and enters "<UserName>"
    And user then modifies "<Username>" "<FullName>" and clicks on Ok
    And user then approves the modified record

    Examples: 
      | UserName | Username | FullName   |
      | Checker12 | Checker12 | Test User27 |

  @TC_09_04_UserBlockUnblockScenario
  Scenario Outline: Block User
    Given user goes to administration and users and click on Block/Unblock menu and enters "<username>"
    And blocks the user profile
    And user then approves the record

    Examples: 
      | username    |
      | Maker10 |

  @TC_09_05_UserRemoveScenario
  Scenario Outline: Remove user
    Given user goes to administration and users and click on Remove menu and enters "<username>"
    And removes the user profile
    Then user goes to Approve screen and approves the record

    Examples: 
      | username |
      | Checker12   |
