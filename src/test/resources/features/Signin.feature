Feature: Sign In feature

  #Scenario Outline: User on login page and login with invalid username and invalid passowrd
    #Given browser is open
    #And user is on login page
    #When user enters <username> and <password>
    #And user clicks on login
    #Then <Outcome>

    #Examples: Invalid username for login
      #| username | password     | Outcome                |
      #| Ninja    | SDET135batch | Invalid username and password error |
     # | NinjaCoders | SDET135  | Invalid username and password error |
      #| Ninja       | SDET135batch | Error message displayed |
      #| NinjaCoders | SDET         | Error message displayed |



  Scenario Outline: User on login page and login with valid username and valid password
   # Given browser is open
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then <Outcome>
    And user clicks Sign Out

    Examples: Successful login
      | username    | password     | Outcome                                  |
      | NinjaCoders | SDET135batch | Login success window should be displayed |

      