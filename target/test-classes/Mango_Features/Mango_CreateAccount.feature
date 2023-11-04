Feature: This is a feature for creating account unsuccessfully


Scenario: Verify user can not create account
Given open <"URL"> man
Then click my account man
Then click create an account man
Then click select & continue
Then enter invalid email password zipcode and phone
Then click create an account again
Then Verify user can not create account