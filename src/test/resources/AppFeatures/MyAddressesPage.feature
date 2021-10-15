Feature: My Addresses feature

  Background: 
    Given user has already logged in to application
      | username                 | password  |
      | dummyemail9093@gmail.com | dummy@123 |
    Then user clicks on My Addresses

  Scenario: My Addresses page title
    Given user is on My Addresses page
    Then addresses page title should be "Addresses - My Store"
    Then my addresses label is displayed
		Then user clicks on Add a new address
		
	
