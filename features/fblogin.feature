
Feature: Facebook Login
  User can login to facebook to post comments & share photos

  
  Scenario: Sucessful Facebook Login
    Given user is in fb login page
    
    When user provides correct credentials
   
    And clicks on login button
    Then user is on homepage
    And sees the title of page is Facebook
      
