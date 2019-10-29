

Feature: demowebshop options
  I want to use demowebshop options
Background:
Given Karthik launvhed chrome browser
    And launched demowebshop url
  @register
  Scenario: Sucessful regisration
   
    When clicked on register button
    And gives correct credentials
    
    Then user gets sucessful registration message
    

  @login
  Scenario: login sucessful
   
    When clicked on login button
    And user gives correct credentials
    
    Then user moves to home page
    
  
