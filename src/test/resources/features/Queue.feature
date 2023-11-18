Feature: Handling queue options

  Scenario: User gets into Implementation of queue from the queue page
    Given User is logged in and on Home page
    When User clicks on Get Started button of Queue
    Then User is on Queue page
    And User clicks Implementation of queue in Python
    Then user gets into Implementation of queue in Python page

  Scenario: User redirected to try me page to run code
    Given user is on Implementation of queue in Python page
    When User clicks on try me button
    Then User lands on tryEditor page

  #Scenario Outline: User redirected to try me page to run invalid code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         0 |
      #| TestCode  |         1 |
#
  #Scenario Outline: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a valid output
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         2 |
      #| TestCode  |         3 |

    Scenario: User gets into Implementation using collections.deque page and uses the try me button
    Given User gets back on Implementation of queue in python page
    When User clicks on Implementation using collections.deque
    Then User lands on Implementation using collections.deque page
    And User clicks on try me button
    Then User lands on tryEditor page   
    
     #Scenario Outline: User redirected to try me page to run invalid code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it

    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         0 |
      #| TestCode  |         1 |
#
  #Scenario Outline: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a valid output
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         2 |
      #| TestCode  |         3 |
      
    Scenario: User gets into Implementation using array page and uses the try me button
    Given User gets back Implementation using collections.deque page
    When User clicks on Implementation using array
    Then User lands on Implementation using array page
    And User clicks on try me button
    Then User lands on tryEditor page   
    
     #Scenario Outline: User redirected to try me page to run invalid code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         0 |
      #| TestCode  |         1 |
#
  #Scenario Outline: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a valid output
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         2 |
      #| TestCode  |         3 |
       #
    Scenario: User gets into Queue Operations page and uses the try me button
    Given User gets back Implementation using array page
    When User clicks on Queue Operations
    Then User lands on Queue Operations page
    And User clicks on try me button
    Then User lands on tryEditor page  
    
    
      #Scenario Outline: User redirected to try me page to run invalid code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         0 |
      #| TestCode  |         1 |
#
  #Scenario Outline: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When The user enters sheet "<Sheetname>" and <RowNumber>
    #And User clicks Run to execute code
    #Then User gets a valid output
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| TestCode  |         2 |
      #| TestCode  |         3 |
      #
    Scenario: User gets into Practice question page and signs out
    Given User gets back on Queue Operations from Deletion page
    When User clicks Practice Questions button of Queues 
    And user gets into Practice Questions of Queues 
    Then user navigates back and clicks signs out
    