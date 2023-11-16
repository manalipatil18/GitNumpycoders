Feature: Handling datastructure options

  Scenario: User clicks gets into DS page and gets into time complexity page
    Given User is logged in and on Home Page
    When User clicks on Get started button
    Then User is on DataStructures Intro page
    And User clicks Time Complexity
    Then user gets into time Complexity page of DS

  Scenario: User clicks on Practice Question page and return to TC page
    Given user gets into time Complexity page of DS
    When User clicks Practice Questions button
    And user gets into Practice Questions of DS
    Then user navigates back to time complexity page

  Scenario: User redirected to try me page to run code
    Given user gets into time Complexity page of DS
    When User clicks on try me button
    Then User lands on tryEditor page
    
    Scenario: User redirected to try me page to run invalid code
    Given User lands on tryEditor page
    When User enters invalid code to run on editor
    And User clicks Run to execute code
    Then User gets a error message and dismisses it
    

  Scenario: User redirected to try me page to run python code
    Given User is on tryEditor page
    When User enters python code to run on editor
    And User clicks Run to execute code
    Then User gets a valid output

    
  
    
    