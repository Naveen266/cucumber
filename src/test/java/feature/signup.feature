Feature: signup
Scenario Outline: enter the details
Given user lanuch the page
When user enter the fnmae<f1> lname<l1> adr<a1> cty<c1> state<s1> Zip<z1> phone<p1> ssn<s2> user<un> pasword<pw> cpw<cp>
Then verify
Examples:
|f1    |l1   |a1|c1|s1|z1|p1|s2|un|pw|cp|
|naveen|kumar|cmy|cmy1|kar|A123|9876543210|1234|naveen1234|naveen@25|