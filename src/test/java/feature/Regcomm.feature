

Feature: commregister
  

  Scenario Outline: page signup
    Given user lanuch the comm browser
    When user enter <fname> <lname> <email> <cmpny> <password> <confpw>
    Then I verify the <status> in step

    Examples: 
      | fname | lname | email     | cmpny   | password | confpw |
      | Tester|     1 | Tester21@gmail.com | wistron | Tester@21| Tester@21 |
      | Tester|     2 | Tester12@gmail.com | wistron | Tester@21| Tester@21|
      | Tester|     3 | Tester33@gmail.com | QT      | Tester@21| Tester@21|