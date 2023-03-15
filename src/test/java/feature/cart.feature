
Feature: cart and order
  @cart
  Scenario: add item to the cart
    Given user lanuch the home page
    When user select the items
    Then check item is added 
    

  @order
  Scenario Outline: place the order
    Given user added to the cart
    When user eneter 
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      
      
