Feature: Women T-Shirts Page

  Background: 
    Given user has already logged in to application
      | username                 | password  |
      | dummyemail9093@gmail.com | dummy@123 |

  Scenario: Filter catalog
    Given user is on T-shirts page "T-shirts - My Store"
    When Catalog is displayed
    Then user applies filter 
