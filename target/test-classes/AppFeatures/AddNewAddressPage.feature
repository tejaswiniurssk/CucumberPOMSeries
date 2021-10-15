Feature: Add New Address Page

  Background: 
    Given user has already logged in to application
      | username                 | password  |
      | dummyemail9093@gmail.com | dummy@123 |
    Then user clicks on My Addresses
    Then user clicks on Add a new address


  Scenario: Add New Address Page title
    Given user is already on the add new address page
    When user gets the title of the new address page
    Then the title of the page is "Address - My Store"
    Then Your Addresses Label is displayed


  Scenario Outline: Fill new address form
    Given new Address form is displayed
    Then user enters "<firstname>" "<lastname>" "<company>"
    And user enters "<address>" "<city>" "<state>" "<zipcode>" "<country>"
    And user enters "<phone>" "<mobile>" and "<alias>"
    Then user clicks on save button

    Examples: 
      | firstname | lastname | company | address    | city    | state      | zipcode | country       | phone      | mobile      | alias    |
      | Tommy     | Singh    | Dell    | Manor Lane | Feltham | California |   21117 | United States | 3152377218 | 31573624244 | Address1 |
			| Eziekeil  | Singh    | EMC     | Chapman    | Feltham | California |   21117 | United States | 3152368318 | 31570974244 | Address2 |
			
			
			
			