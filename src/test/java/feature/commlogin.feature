Feature: ecommerse login
@log
  Scenario Outline: login
    Given user lanuch the ecommerse login page
    When user enter the username<un> password<pw>
    Then userverify the login page

    Examples: 
    | un                 | pw       | 
    | Tester21@gmail.com |Tester@21 |
    | Tester12@gmail.com |Tester@21 |
@cart
Scenario: add to cart
 Given user lanuch the ecommerse login page
 When User eneter the un "Tester12@gmail.com" pw "Tester@21"
 And enter the detail 
 Then verif it is in cart
 
 @Shipping
 Scenario Outline: place the order
 Given user lanuch the ecommerse login page
 When User eneter the un "Tester12@gmail.com" pw "Tester@21"
 And enter city <city> ads <address> pin <pincode> mob <phone> 
 Then verify its placed

  Examples:
 |city     |address   |pincode|phone     |
 |Bengaluru|Chintamani|563125 |9876543210|
 