Feature: Handling Linkedlist options

  Scenario: User clicks and gets into Linked List page
    Given User is logged in and is on Home Page
    When User clicks on Link list option from the dropdown menu
    Then User is on Linked list page

  Scenario: User gets into Introduction page and uses the try me button
    Given User is on Linked list page
    When User clicks on Introduction
    Then User lands on Introduction page
    And User clicks on try me button
    Then User lands on tryEditor page

  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Creating linked list page and uses the try me button
    Given User gets back on Intro page
    When User clicks on Creating Linked List
    Then User lands on Creating Linked List page
    And User clicks on try me button
    Then User lands on tryEditor page
#
  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Types of Linked List page and uses the try me button
    Given User gets back on Intro page from Creating Link list page
    When User clicks on Types of Linked List
    Then User lands on Types of Linked List page
    And User clicks on try me button
    Then User lands on tryEditor page

  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Implement Linked List page and uses the try me button
    Given User gets back on Intro page from Types of Linked List page
    When User clicks on Implement Linked List
    Then User lands on Implement Linked List page
    And User clicks on try me button
    Then User lands on tryEditor page

  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Traversal page and uses the try me button
    Given User gets back on Intro page from Implement Linked List page
    When User clicks on Traversal
    Then User lands on Traversal page
    And User clicks on try me button
    Then User lands on tryEditor page
#
  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Insertion page and uses the try me button
    Given User gets back on Intro page from Traversal page
    When User clicks on Insertion
    Then User lands on Insertion page
    And User clicks on try me button
    Then User lands on tryEditor page

  #Scenario: User redirected to try me page to run invalid code
    #Given User lands on tryEditor page
    #When User enters invalid code to run on editor
      #| System.out.println("Hi Java"); |
    #And User clicks Run to execute code
    #Then User gets a error message and dismisses it
#
  #Scenario: User redirected to try me page to run python code
    #Given User is on tryEditor page
    #When User enters python code to run on editor
      #| print 'hello'; |
    #And User clicks Run to execute code
    #Then User gets a valid output

  Scenario: User gets into Deletion page and uses the try me button
    Given User gets back on Intro page from Insertion page
    When User clicks on Deletion
    Then User lands on Deletion page
    And User clicks on try me button
    Then User lands on tryEditor page

  Scenario: User redirected to try me page to run invalid code
    Given User lands on tryEditor page
    When User enters invalid code to run on editor
      | System.out.println("Hi Java"); |
    And User clicks Run to execute code
    Then User gets a error message and dismisses it

  Scenario: User redirected to try me page to run python code
    Given User is on tryEditor page
    When User enters python code to run on editor
      | print 'hello'; |
    And User clicks Run to execute code
    Then User gets a valid output

  Scenario: User gets into Practice question page and signs out
    Given User gets back on Intro page from Deletion page
    When User clicks Practice Questions button of Linked list
    And user gets into Practice Questions of Linked list
    Then user navigates back and clicks signs out
