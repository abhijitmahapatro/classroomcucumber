
Feature: Demowebshop Login
  I want to login demowebshop login

  @login
  Scenario Outline: Sucessful login
    Given user is in login page
    
    And user clicks on login button
    When user types "<email>" and "<password>" credentials
    And user clicks on login option
    
    Then user is on the home page
    Examples:
    | email                  | password |
    |karthik456@gmail.com    |karthik456|
    |abhijit1997bam@gmail.com|sinu1997|
     @login1
  Scenario: Sucessful login1
    Given above user is in login page
    
    And  above user clicks on login button
    When avove user types emailme and passwordme credentials
    And above user clicks on login option
    
    Then above user is on the home page
   
 @search
 Scenario: search on demoshop page
 Given again user is on demo webshop
 And User clicks on shopping cart
 When user gives the product name
 Then list of product is displayed